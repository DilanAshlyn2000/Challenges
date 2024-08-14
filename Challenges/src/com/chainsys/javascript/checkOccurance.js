function countOccurrences(str, char) {
    return str.split(char).length - 1;
}

console.log('Occurrences of "a" in "Anita":', countOccurrences('Anita', 'a')); 
console.log('Occurrences of "n" in "Nilavan":', countOccurrences('Nilavan', 'n'));