/**
 * @NApiVersion 2.x
 * @NScriptType MapReduceScript
 */
define(
		[ 'N/file' ],
		function(file) {
			// Define characters that should not be counted when the script
			// performs its analysis of the text.
			const
			PUNCTUATION_REGEXP = /[\u2000-\u206F\u2E00-\u2E7F\\'!"#\$%&\(\)\*\+,\-\.\/:;<=>\?@\[\]\^_`\{\|\}~]/g;

			/**
			 * Marks the beginning of the Map/Reduce process and generates input
			 * data.
			 * 
			 * @typedef {Object} ObjectRef
			 * @property {number} id - Internal ID of the record instance
			 * @property {string} type - Record type id
			 * 
			 * @return {Array|Object|Search|RecordRef} inputSummary
			 * @since 2015.1
			 */

			// Use the getInputData function to return two strings.
			function getInputData() {
				return "the quick brown fox \njumps over the lazy dog."
						.split('\n');
			}
			// After the getInputData function is executed, the system creates
			// the following
			// key/value pairs:
			//
			// key: 0, value: 'the quick brown fox'
			// key: 1, value: 'jumps over the lazy dog.'

			/**
			 * Executes when the map entry point is triggered and applies to
			 * each key/value pair.
			 * 
			 * @param {MapSummary}
			 *            context - Data collection containing the key/value
			 *            pairs to process through the map stage
			 * @since 2015.1
			 */
			// The map function is invoked one time for each key/value pair.
			// Each time the
			// function is invoked, the relevant key/value pair is made
			// available through
			// the context.key and context.value properties.
			function map(context) {

				// Create a loop that examines each character in the string.
				// Exclude spaces
				// and punctuation marks.

				for (var i = 0; context.value && i < context.value.length; i++)
					if (context.value[i] !== ' '
							&& !PUNCTUATION_REGEXP.test(context.value[i])) {

						// For each character, invoke the context.write()
						// method. This method saves
						// a new key/value pair. For the new key, save the
						// character currently being
						// examined by the loop. For each value, save the number
						// 1.

						context.write(context.value[i], 1);
					}
			}

			// After the map function has been invoked for the last time, the
			// shuffle stage
			// begins. In this stage, the system sorts the 35 key/value pairs
			// that were saved
			// by the map function during its two invocations. From those pairs,
			// the shuffle
			// stage creates a new set of key/value pairs, where the each key is
			// unique. In
			// this way, the number of key/value pairs is reduced to 25. For
			// example, the map
			// stage saved three instances of {'e','1'}. In place of those
			// pairs, the shuffle
			// stage creates one pair: {'e', ['1','1','1']}. These pairs are
			// made available to
			// the reduce stage through the context.key and context.values
			// properties.

			/**
			 * Executes when the reduce entry point is triggered and applies to
			 * each group.
			 * 
			 * @param {ReduceSummary}
			 *            context - Data collection containing the groups to
			 *            process through the reduce stage
			 * @since 2015.1
			 */
			// The reduce function is invoked one time for each of the 25
			// key/value pairs
			// provided.
			function reduce(context) {
				// Use the context.write() method to save a new key/value pair,
				// where the new key
				// equals the key currently being processed by the function.
				// This key is a letter
				// in the alphabet. Make the value equal to the length of the
				// context.values array.
				// This number represents the number of times the letter
				// occurred in the original
				// string.
				context.write(context.key, context.values.length);

			}

			/**
			 * Executes when the summarize entry point is triggered and applies
			 * to the result set.
			 * 
			 * @param {Summary}
			 *            summary - Holds statistics regarding the execution of
			 *            a map/reduce script
			 * @since 2015.1
			 */
			// The summarize stage is a serial stage, so this function is
			// invoked only one
			// time.
			function summarize(context) {
				// Log details about the script's execution.
				log.audit({
					title : 'Usage units consumed',
					details : context.usage
				});
				log.audit({
					title : 'Concurrency',
					details : context.concurrency
				});
				log.audit({
					title : 'Number of yields',
					details : context.yields
				});
				// Use the context object's output iterator to gather the
				// key/value pairs saved
				// at the end of the reduce stage. Also, tabulate the number of
				// key/value pairs
				// that were saved. This number represents the total number of
				// unique letters
				// used in the original string.
				var text = '';
				var totalKeysSaved = 0;
				context.output.iterator().each(function(key, value) {
					text += (key + ' ' + value + '\n');
					totalKeysSaved++;
					return true;
				});
				// Log details about the total number of pairs saved.
				log.audit({
					title : 'Unique number of letters used in string',
					details : totalKeysSaved
				});
				// Use the N/file module to create a file that stores the reduce
				// stage output,
				// which you gathered by using the output iterator.
				var fileObj = file.create({
					name : 'letter_count_result.txt',
					fileType : file.Type.PLAINTEXT,
					contents : text
				});
				fileObj.folder = -15;
				var fileId = fileObj.save();
				log.audit({
					title : 'Id of new file record',
					details : fileId
				});
			}
			// Link each entry point to the appropriate function.
			return {
				getInputData : getInputData,
				map : map,
				reduce : reduce,
				summarize : summarize
			};

		});