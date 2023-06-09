// We will be working on the following array:

const nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

// Let's first copy/clone array and then apply the .reverse() on it:

console.log(`original: ${nums}`);
original: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9;

// .slice() makes a copy
const reversed = nums.slice().reverse();

console.log(`reversed: ${reversed}`); // reversed: 9,8,7,6,5,4,3,2,1,0

console.log(`original: ${nums}`);
original: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9;
