const weekDay = function() {
const names = ["Sunday", "Monday", "Tuesday", "Wednesday",
"Thursday", "Friday", "Saturday"];
return {
name(number) { return names[number]; },
number(name) { return names.indexOf(name); }
};
}();
console.log(weekDay.name(weekDay.number("Sunday")));
// �� Sunday

//������ִ��Ϊ����
const x = 1;
function evalAndReturnX(code) {
eval(code);
return x;
}
console.log(evalAndReturnX("var x = 2"));
// �� 2
console.log(x);
// �� 1

let plusOne = Function("n", "return n + 1;");
console.log(plusOne(4));
// �� 5

const ordinal = require("ordinal");
const {days, months} = require("date-names");
exports.formatDate = function(date, format) {
return format.replace(/YYYY|M(MMM)?|Do?|dddd/g, tag => {
if (tag == "YYYY") return date.getFullYear();
if (tag == "M") return date.getMonth();
if (tag == "MMMM") return months[date.getMonth()];
if (tag == "D") return date.getDate();
if (tag == "Do") return ordinal(date.getDate());
if (tag == "dddd") return days[date.getDay()];
});
};