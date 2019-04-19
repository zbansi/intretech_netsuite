let a = [{value: 'a', text: 'a1'},{value: 'b', text: 'b2'},{value: 'c', text: 'c3'}];

console.log(a.filter(c=>c.value=='a'));
//µÈ¼ÛÐ´·¨
console.log(a.filter(function test(x){
	return x.value == 'a';
}));
