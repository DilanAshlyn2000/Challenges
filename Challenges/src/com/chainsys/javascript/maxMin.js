function maxMin(arr) {
    return {
        max: Math.max(...arr),
        min: Math.min(...arr)
    };
}

console.log('Max and Min in [999, 50, 17, 14, 603]:', maxMin([999, 50, 17, 14, 603]));
console.log('Max and Min in [111, 22, 3, 44, 555]:', maxMin([111, 22, 3, 44, 555]));