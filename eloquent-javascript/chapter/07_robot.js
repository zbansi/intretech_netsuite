/**
 * 
 */
var roads = [
  "Alice's House-Bob's House",   "Alice's House-Cabin",
  "Alice's House-Post Office",   "Bob's House-Town Hall",
  "Daria's House-Ernie's House", "Daria's House-Town Hall",
  "Ernie's House-Grete's House", "Grete's House-Farm",
  "Grete's House-Shop",          "Marketplace-Farm",
  "Marketplace-Post Office",     "Marketplace-Shop",
  "Marketplace-Town Hall",       "Shop-Town Hall"
];

function buildGraph(edges) {
  let graph = Object.create(null);
  function addEdge(from, to) {
    if (graph[from] == null) {
      graph[from] = [to];
    } else {
      graph[from].push(to);
    }
  }
  for (let [from, to] of edges.map(r => r.split("-"))) {
    addEdge(from, to);
    addEdge(to, from);
  }
  return graph;
}

var roadGraph = buildGraph(roads);

var VillageState = class VillageState {
  constructor(place, parcels) {
    this.place = place;
    this.parcels = parcels;
  }

  move(destination) {
    if (!roadGraph[this.place].includes(destination)) {
      return this;
    } else {
      let parcels = this.parcels.map(p => {
        if (p.place != this.place) return p;
        return {place: destination, address: p.address};
      }).filter(p => p.place != p.address);
      return new VillageState(destination, parcels);
    }
  }
}

function runRobot(state, robot, memory) {
  for (let turn = 0;; turn++) {
    if (state.parcels.length == 0) {
      console.log('Done in ${turn} turns');
      break;
    }
    let action = robot(state, memory);
    state = state.move(action.direction);
    memory = action.memory;
    console.log('Moved to ${action.direction}');
  }
}

function randomPick(array) {
  let choice = Math.floor(Math.random() * array.length);
  return array[choice];
}

function randomRobot(state) {
  return {direction: randomPick(roadGraph[state.place])};
}

VillageState.random = function(parcelCount = 5) {
  let parcels = [];
  for (let i = 0; i < parcelCount; i++) {
    let address = randomPick(Object.keys(roadGraph));
    let place;
    do {
      place = randomPick(Object.keys(roadGraph));
    } while (place == address);
    parcels.push({place, address});
  }
  return new VillageState("Post Office", parcels);
};

var mailRoute = [
  "Alice's House", "Cabin", "Alice's House", "Bob's House",
  "Town Hall", "Daria's House", "Ernie's House",
  "Grete's House", "Shop", "Grete's House", "Farm",
  "Marketplace", "Post Office"
];

function routeRobot(state, memory) {
  if (memory.length == 0) {
    memory = mailRoute;
  }
  return {direction: memory[0], memory: memory.slice(1)};
}

function findRoute(graph, from, to) {
  let work = [{at: from, route: []}];
  for (let i = 0; i < work.length; i++) {
    let {at, route} = work[i];
    for (let place of graph[at]) {
      if (place == to) return route.concat(place);
      if (!work.some(w => w.at == place)) {
        work.push({at: place, route: route.concat(place)});
      }
      console.log(JSON.stringify(work));
    }
  }
}

function goalOrientedRobot({place, parcels}, route) {
  if (route.length == 0) {
    let parcel = parcels[0];
    if (parcel.place != place) {
      route = findRoute(roadGraph, place, parcel.place);
    } else {
      route = findRoute(roadGraph, place, parcel.address);
    }
  }
  return {direction: route[0], memory: route.slice(1)};
}
// Bansi 先收后发（目标地点全部收取，后派送）
function yourRobot({place, parcels}, memory){
	if(memory.length == 0){
		for(let i = 0; i<parcels.length; i++){
		  let parcel = parcels[i];
		    if (parcel.place != place) {
		      route[i] = findRoute(roadGraph, place, parcel.place);
		    } else {
		      route[i] = findRoute(roadGraph, place, parcel.address);
		    }
		}
	}
	var min =1000;
	var m = null;
	for(let j= 0; j<route.length; j++){		
		if(route[j].length<= min){
			min = route[j].length;
			m = j;
		}
	}
	memory = route[m];
	
	
	  return {direction: memory[0], memory: memory.slice(1)};
}

function findYourRoute(graph, from, to) {
    let work = [{
        at: from,
        route: []
    }];
    for (let i = 0; i < work.length; i++) {
        console.log('\n loop:' + i + ' \n');
        
        let {
            at,
            route
        } = work[i];
        console.log('work[i]xxxxxxx' + JSON.stringify(work[i]));

        console.log('\n subloop:graph[at]xxxxx' + JSON.stringify(graph[at]) + 'xxx\n');
        for (let place of graph[at]) {

            console.log('xxxxx' + place + 'xxxxxxxxxxxxxxxxxxxxxxx\n');
            if (place == to) {

                console.log(place + '====' + to + 'xxxx' + 'yeahhhhh \n');
                return route.concat(place);
            }
            if (!work.some(w = >w.at == place)) {
                work.push({
                    at: place,
                    route: route.concat(place)
                });
            }
            console.log('work:xxxxx' + JSON.stringify(work));
            console.log('route:xxxxx' + JSON.stringify(route));
        }
    }
}