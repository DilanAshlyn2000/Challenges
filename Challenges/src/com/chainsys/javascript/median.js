function median(numbers) {
    numbers.sort((a, b) => a - b);
    const mid = Math.floor(numbers.length / 2);
    if (numbers.length % 2 === 0) {
        return (numbers[mid - 1] + numbers[mid]) / 2;
    } else {
        return numbers[mid];
    }
}
let numbers = [13, 25, 37,44, 56];
let med = median(numbers);
console.log('Original Array:', numbers);
console.log('Median of Numbers:', med);
