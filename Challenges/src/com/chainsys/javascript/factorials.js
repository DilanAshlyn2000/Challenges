//Calculate the factorial of each number in an array.
//Store the results in a new array.
//Sort the factorials in descending order.
//Print the original array, the factorials, and the sorted factorials.

function factorial(n) {
    if (n === 0 || n === 1) return 1;
    let result = 1;
    for (let i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

let numbers = [3, 5, 7, 4, 6];
let factorials = numbers.map(num => factorial(num));
factorials.sort((a, b) => b - a);

console.log('Original Array:', numbers);
console.log('Factorials:', factorials);
console.log('Sorted Factorials (Descending):', factorials);
