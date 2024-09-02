function countVowels(str) {
    return (str.match(/[aeiou]/gi) || []).length;
}
console.log('Occurrences of vowels in "Hello World":', countVowels('My name is Riana'));
console.log('Occurrences of vowels in "Programming":', countVowels('Programming Language'));
