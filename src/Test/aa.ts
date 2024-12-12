// function checkPalindrome(leftIndex: number, rightIndex: number, s: string): number {
//     while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] === s[rightIndex]) {
//         leftIndex--;
//         rightIndex++;
//     }
//     return rightIndex - leftIndex - 1;
// }
//
// function longestPalindrome(s: string): string {
//
//     let max = 0;
//     let start = 0;
//
//     for (let i = 0; i < s.length; i++) {
//         let odd = checkPalindrome(i, i, s);
//         let even = checkPalindrome(i, i + 1, s);
//
//         const len = Math.max(odd, even);
//         if (max < len) {
//             max = len;
//             start = i - Math.floor((len - 1)/ 2) ;
//         }
//     }
//     console.log(s.substring(start, start + max))
//     return s.substring(start, start + max);
//
// }
// longestPalindrome("cbbd")