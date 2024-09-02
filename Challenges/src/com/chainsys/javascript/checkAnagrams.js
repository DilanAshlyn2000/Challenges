function checkAnagrams(str1, str2) {
    const normalize = str => str.toLowerCase().replace(/[^a-z]/g, '').split('').sort().join('');
    return normalize(str1) === normalize(str2);
}

console.log('Are "listen" and "silent" anagrams?', checkAnagrams('listen', 'silent'));
console.log('Are "hello" and "world" anagrams?', checkAnagrams('hello', 'world'));
