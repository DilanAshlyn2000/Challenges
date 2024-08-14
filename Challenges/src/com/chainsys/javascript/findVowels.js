function findVowels(str) {
    const vowels = 'aeiouAEIOU';
    let vowelCounts = {};
    let vowelList = [];

    for (let char of str) {
        if (vowels.includes(char)) {
            if (!vowelCounts[char.toLowerCase()]) {
                vowelCounts[char.toLowerCase()] = 0;
                vowelList.push(char);
            }
            vowelCounts[char.toLowerCase()] += 1;
        }
    }

    return { counts: vowelCounts, vowels: vowelList };
}

const result = findVowels('Life is Beautiful');
console.log('Vowel Counts:', result.counts); 
