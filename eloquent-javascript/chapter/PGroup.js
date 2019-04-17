
class PGroup {
  // Your code here
  constructor(g){    
    this.group = g;
  }
  
  has(value){
    return this.group.includes(value);
  }
  
  add(value){
    if(this.has(value)) return this;
    return new PGroup(this.group.concat([value]));	
  }
  
  delete(value){
    if(this.has(value))
      this.group = this.group.filter(v => v!==value);    
    return this;
  }
}

PGroup.empty = new PGroup([]);

let a = PGroup.empty.add("a");
let ab = a.add("b");
let b = ab.delete("a");

console.log(b.has("b"));
// ¡ú true
console.log(a.has("b"));
// ¡ú false
console.log(b.has("a"));
// ¡ú false

function Person(name) { this.name = name; }
let ferdinand = Person("Ferdinand"); // oops
console.log(name);
// ¡ú Ferdinand