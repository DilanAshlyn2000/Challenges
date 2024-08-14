//Palindrome Check Program

function isPalindrome(str) {
    let cleanedStr = str.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    let reversedStr = cleanedStr.split('').reverse().join('');
    return cleanedStr === reversedStr;
}

console.log(isPalindrome('dad')); 
console.log(isPalindrome('Hello World')); 
console.log(isPalindrome('mum')); 
console.log(isPalindrome('yummy')); 
