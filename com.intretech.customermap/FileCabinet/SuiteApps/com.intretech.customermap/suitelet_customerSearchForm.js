/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 */
define(['N/ui/serverWidget', 'N/search', 'N/https'],
    function(serverWidget, search, https) {
        // Generate random annual revenue for each customer. Assume the max of annual revenue is 255
        var maxAnnualRevenue = 255;
        // Google Geocoding Service URL
        var urlGeocode = 'https://maps.googleapis.com/maps/api/geocode/json?address=';
        // Google API Key(Get your key following https://developers.google.com/maps/documentation/geocoding/get-api-key)
        var apiKey = 'AIzaSyAsCnHbNYnWnmnlGup6XWZoS2-gzh98owM';
        // CSS for HTML page
        var templateCSS = "<style>" +
                          "  #map {" +
                          "    height: 400px;" +
                          "    width: 100%;" +
                          "  }" +
                          "  .storelocator-panel {" +
                          "    border: 1px solid #ccc;" +
                          "    overflow: auto;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .store-list {" +
                          "    margin: 0;" +
                          "    padding: 0;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .store-list li," +
                          "  .storelocator-panel .directions-panel {" +
                          "    padding: 5px;" +
                          "  }" +
                          "  .storelocator-panel .directions-panel {" +
                          "    font-size: 0.8em;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .store-list li.store:hover {" +
                          "    cursor: pointer;" +
                          "    background: #eee;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .store-list li.highlighted," +
                          "  .storelocator-panel .store-list li.highlighted:hover {" +
                          "    background: #ccf;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .directions {" +
                          "    display: none;" +
                          "  }" +
                          "  " +
                          "  .storelocator-panel .store-list .no-stores {" +
                          "    color: grey;" +
                          "  }" +
                          "  " +
                          "  " +
                          "  .store .title {" +
                          "    font-weight: bold;" +
                          "  }" +
                          "  " +
                          "  .store .address," +
                          "  .store .phone," +
                          "  .store .web," +
                          "  .store .misc {" +
                          "    font-size: 80%;" +
                          "    margin-top: 0.2em;" +
                          "    margin-bottom: 0.5em;" +
                          "    display: block;" +
                          "  }" +
                          "  " +
                          "  body { font-family: sans-serif; }" +
                          "  #map-canvas, #panel { height: 500px; }" +
                          "  #panel { width: 300px; float: left; margin-right: 10px; }" +
                          "  #panel .feature-filter label { width: 130px; }" +
                          "  p.attribution, p.attribution a { color: #666; }" +
                          "</style>";
        // HTML Template for item in Address List
        var templateAddressLi = "<li class=\"store\">" +
                                "    <div class=\"store\">" +
                                "        <div class=\"title\">%addressee%</div>" +
                                "        <div class=\"address\">%address%</div>" +
                                "    </div>" +
                                "</li>";
        // HTML Template for Javascript
        var templateScript = "<script>" +
                             "    function initMap() {" +
                             "        var map = new google.maps.Map(document.getElementById(\'map-canvas\'), {" +
                             "          zoom: 4" +
                             "        });" +
                             "        var latlngbounds = new google.maps.LatLngBounds();" +
                             "        %markersScript%" +
                             "        map.fitBounds(latlngbounds);" +
                             "    }" +
                             "</script>" +
                             "<script async defer" +
                             "    src=\"https://maps.googleapis.com/maps/api/js?key=" + apiKey + "&callback=initMap\">" +
                             "</script>";
       
        // generate random integer between min and max
        // https://stackoverflow.com/questions/1527803/generating-random-whole-numbers-in-javascript-in-a-specific-range
        function generateRandomInt(min, max) {
            return Math.floor(Math.random() * (max - min + 1)) + min;
        }                             
        // Parse the address and Generate HTML
        function generateHtml(customers) {
            if(customers.length === 0) return 'No Customer was found.';
            // parse address to geolocation using google service      
            for(var i = 0, len = customers.length; i < len; i++) {
                var response = https.get({
                    url: urlGeocode + customers[i].address + '&key=' + apiKey
                });
                var responseBody = JSON.parse(response.body);
                if(responseBody.results.length) {
                    var responseResult = responseBody.results[0];
                    if(responseResult.geometry && responseResult.geometry.location && responseResult.geometry.location.lat) {
                        customers[i].geoloc = {
                            'lat': responseResult.geometry.location.lat,
                            'lng': responseResult.geometry.location.lng
                        };
                    }
                }
            }

            return generateHtmlFromTemplate(customers);
        }
        // Generate HTML
        function generateHtmlFromTemplate(customers) {  
            return "<div>" +
                         templateCSS +
                    "    <div id=\"panel\" class=\"storelocator-panel\">" +
                    "        <ul class=\"store-list\">" +
                              generateAddressList(customers) +
                    "        </ul>" +
                    "    </div>" +
                    "    <div id=\"map-canvas\"></div>" +
                         generateScript(customers)  +
                    "</div>";
        }
        // Generate the HTML for Address List
        function generateAddressList(customers) {
            var result = "";
            for(var i = 0, len = customers.length; i < len; i++) {
            	// https://stackoverflow.com/questions/377961/efficient-javascript-string-replacement
                result += templateAddressLi.replace(
                    /%(\w*)%/g,
                    function(m, key){
                      return customers[i].hasOwnProperty(key) ? customers[i][key] : "";
                    }
                );
            }
            return result;
        }
        // Generate the Javascript for the whole page
        function generateScript(customers) {    
            var markersScript = "";
            for(var i = 0, len = customers.length; i < len; i++) {
                // The address is invalid. Google failed to parse it
                if(customers[i].geoloc == null) {
                    continue;
                }                
                // If the customer has higher revenue, the marker is more red. If the customer has less revenue, the marker is more black. 
                var colorR = Math.floor(customers[i].annualRevenue * 255 / maxAnnualRevenue);
                markersScript += "var latlng = new google.maps.LatLng(" + customers[i].geoloc.lat + ", " + customers[i].geoloc.lng + ");" +
                                 "var marker = new google.maps.Marker({" +
                                 "    icon: {" +
                                 "        path: google.maps.SymbolPath.FORWARD_CLOSED_ARROW," +
                                 "        strokeColor: \"#" + colorR.toString(16) + "0000\"," +
                                 "        scale: 3" +
                                 "    }," +
                                 "    position: {lat: " + customers[i].geoloc.lat + ", lng: " + customers[i].geoloc.lng + "}," +
                                 "    map: map," +
                                 "    title:  \"" + customers[i].addressee + "\"" +
                                 "});" +
                                 "latlngbounds.extend(latlng);" +
                                 "var infowindow = new google.maps.InfoWindow({});" +
                                 "marker.addListener('click', function() {" +
                                 "    infowindow.setContent(\"" + customers[i].addressee + "\");" +
                                 "    infowindow.open(map, this);" +
                                 "});";
            }
            return templateScript.replace(
                /%(\w*)%/g, 
                function(m, key) {
                    // Replace %markersScript% with markersScript directly
                    return markersScript;
                }
            );
        }
      
        function onRequest(context) {
            // Create form
            var form = serverWidget.createForm({
                title: 'Customer Search Form'
            });
            var zipField = form.addField({
                id: 'zip',
                type: serverWidget.FieldType.TEXT,
                label: 'Zip Code'
            });
            zipField.updateLayoutType({
                layoutType : serverWidget.FieldLayoutType.OUTSIDEABOVE
            });
            var cityField = form.addField({
                id: 'city',
                type: serverWidget.FieldType.TEXT,
                label: 'City'
            });
            cityField.updateLayoutType({
                layoutType : serverWidget.FieldLayoutType.OUTSIDEABOVE
            });
            form.addSubmitButton({
                label: 'Search'
            });
            // HTML Control for Address List and GoogleMap
            var map = form.addField({
                id: 'map',
                type: serverWidget.FieldType.INLINEHTML,
                label: 'Inlinehtml'
            });
          
            if (context.request.method === 'POST') {
                var zipCode = context.request.parameters.zip;
                var cityName = context.request.parameters.city;
                // Run saved customer search
                var customerSearch = search.load({
                    id: 'customsearch_customeraddr2'
                });
                customerSearch.filters = [];
                // ZIP CODE or CITY is required to run the search
                var hasSearchCondition = false;
                if (zipCode) {
                    customerSearch.filters.push(search.createFilter({
                        name: 'zipcode',
                        operator: search.Operator.IS,
                        values: zipCode
                    }));
                    hasSearchCondition = true;
                }
                if (cityName) {
                    customerSearch.filters.push(search.createFilter({
                        name: 'city',
                        operator: search.Operator.IS,
                        values: cityName
                    }));
                    hasSearchCondition = true;
                }
                if(hasSearchCondition) {
                    var customers = [];
                    customerSearch.run().each(function(result) {
                        var customer = {};
                        customer.id = result.id;
                        customer.address = result.getValue('address');
                        customer.addressee = result.getValue('addressee');
                        if (customer.address) {
                            // Remove addressee from address
                            customer.address = customer.address.replace(customer.addressee,"");    
                            customer.annualRevenue = generateRandomInt(0, 255);
                            customers.push(customer);
                        }
                        return true; 
                    });
                    zipField.defaultValue = zipCode;
                    cityField.defaultValue = cityName;
                    map.defaultValue = generateHtml(customers);
                } else {
                    map.defaultValue = "Please fill ZIP CODE or CITY.";
                }
            }
            context.response.writePage(form);
        }
        return {
            onRequest: onRequest
        };
});