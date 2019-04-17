console.log([1,2,3].reduce((a,b) => a+b,-6));
console.log([1,2,3].map(n=>n*100));
console.log([1,2,3].filter(n=>n>=2));
[1,2,3].forEach(a=>console.log(a+1));

let g = Object.create(null);
	let roads = [["A","B"],["B","C"],["A","C"]];
	for (let [f,t] of roads){
	console.log(f);
	console.log(t);
	console.log(g);
	g[f]=[t];
	
}
	function canYouSpotTheProblem() {
		var counter =1;
		"use strict";
		for (counter = 0; counter < 10; counter++) {
		console.log("Happy happy");
		}
		}
		canYouSpotTheProblem();
		// ¡ú ReferenceError: counter is not defined
		
function promptNumber(question) {
let result = Number(prompt(question, ""));
if (Number.isNaN(result)) return null;
else return result;
}
console.log(promptNumber("How many trees do you see?"));

