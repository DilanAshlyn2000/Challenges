function intersect(arr1, arr2) {
    let set1 = new Set(arr1);
    let set2 = new Set(arr2);
    let intersection = [...set1].filter(item => set2.has(item));
    return intersection;
}

let array1 = [71, 82, 66, 41, 15];
let array2 = [47, 5, 66, 7, 41];

console.log('Intersection:', intersect(array1, array2));
