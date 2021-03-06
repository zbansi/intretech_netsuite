/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @NModuleScope SameAccount
 */
define(
		[ 'N/ui/serverWidget' ],

		function(ui) {

			/**
			 * Definition of the Suitelet script trigger point.
			 * 
			 * @param {Object}
			 *            context
			 * @param {ServerRequest}
			 *            context.request - Encapsulation of the incoming
			 *            request
			 * @param {ServerResponse}
			 *            context.response - Encapsulation of the Suitelet
			 *            response
			 * @Since 2015.2
			 */
			function onRequest(context) {
				if (context.request.method === 'GET') {
					var form = ui.createForm({
						title : 'A bansi Suitelet Form'
					});
					var abansiTextField = form.addField({
						id : 'abansi',
						label : 'abansi Text Field',
						type : ui.FieldType.TEXT,
						source : '',
						container : ''
					});
					form.addSubmitButton({
						label : 'Click me!'
					});
					context.response.writePage(form);
				} else {
					var request = context.request;
					// parameters follow id
					var abansTextField = context.request.parameters.abansi;
					switch (abansTextField) {
					case 'file':
						require([ 'N/file' ], function(file) {
							function createAndSaveFile() {
								var fileObj = file.create({
									name : 'bansi_test.txt',
									fileType : file.Type.PLAINTEXT,
									contents : 'Hello World\nHello World'
								});
								fileObj.folder = -15;
								var id = fileObj.save();
								fileObj = file.load({
									id : id
								});
								context.response.writeFile(fileObj);

							}
						})
						break;

					case 'email':
						require([ 'N/email', 'N/runtime' ], function(email,
								runtime) {
							function sendEmail() {
								email.send({
									author : runtime.getCurrentUser().id,
									recipients : '377132229@qq.com',
									subject : abansTextField,
									body : 'a bansi suitelet form test'

								});
								context.response
										.write('You have sent a email!');

							}

						})
						break;

					case 'dialog':
						require(
								[ 'N/ui/dialog' ],
								function(dialog) {
									function dialogAlert() {
										var options = {
											title : 'Hello!',
											message : 'Hello, World! '
										};
										try {
											dialog.alert(options);
											log
													.debug({
														title : 'Success',
														details : 'Require invoke successfully'
													});
										} catch (e) {
											log.error({
												title : e.name,
												details : e.message
											});
										}
										context.response
												.write('You have invoke requie function successfully!');

									}
								});
					default:
						return null;
					}
					/**
					 * context.response.write('You have xxx successfully!
					 * Reference: ' + abansTextField)
					 */
				}
				;
			}

			return {
				onRequest : onRequest
			};
		});
