function findMedianSortedArrays(nums1, nums2) {
    let merged = [...nums1, ...nums2].sort((a, b) => a - b);
    let len = merged.length;
    if (len % 2 === 0) {
        return (merged[len / 2 - 1] + merged[len / 2]) / 2;
    } else {
        return merged[Math.floor(len / 2)];
    }
}

let nums1 = [1, 3];
let nums2 = [2];
console.log('Median of Arrays [1, 3] and [2]:', findMedianSortedArrays(nums1, nums2));

nums1 = [1, 2];
nums2 = [3, 4];
console.log('Median of Arrays [1, 2] and [3, 4]:', findMedianSortedArrays(nums1, nums2));
