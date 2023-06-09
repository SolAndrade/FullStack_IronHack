// WHILE statement creates a loop that executes a specified code as long as the condition evaluates true.
//  If you forget to iterate the variable inside a while, you can create an infinite loop.
let i = 0;

while (i <= 100) {
  console.log(i);
  i++; // this is the same as i = i + 1
}

// FOR

for (let i = 0; i <= 100; i++) {
  console.log(i);
}

// FOR...OF

const greeting = "hi there!";

for (const value of greeting) {
  console.log(value);
}
// the expected output:
// h
// i

// t
// h
// e
// r
// e
// !
