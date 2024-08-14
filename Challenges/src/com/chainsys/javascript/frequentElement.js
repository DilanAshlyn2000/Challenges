function frequentElement(arr) {
    let frequencyMap = {};
    
    arr.forEach(element => {
        frequencyMap[element] = (frequencyMap[element] || 0) + 1;
    });
    
    let maxCount = 0;
    let mostFrequent;
    
    for (let element in frequencyMap) {
        if (frequencyMap[element] > maxCount) {
            maxCount = frequencyMap[element];
            mostFrequent = element;
        }
    }
    
    return { mostFrequent, count: maxCount };
}

let array = [11, 35, 143, 2, 11, 32, 422, 11, 11, 345];
let result = frequentElement(array);

console.log('Most Frequent Element:', result.mostFrequent);
console.log('Count:', result.count);
