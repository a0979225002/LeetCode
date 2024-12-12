//Given a string s, return the longest palindromic substring in s. 
//
// 
// Example 1: 
//
// 
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: s = "cbbd"
//Output: "bb"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consist of only digits and English letters. 
// 
//
// Related Topics Two Pointers String Dynamic Programming 👍 30003 👎 1843


//leetcode submit region begin(Prohibit modification and deletion)

function checkPalindrome(leftIndex: number, rightIndex: number, s: string): number {
    while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] === s[rightIndex]) {
        leftIndex--;
        rightIndex++;
    }
    return rightIndex - leftIndex - 1;
}

function longestPalindrome(s: string): string {

    let max = 0;
    let start = 0;

    for (let i = 0; i < s.length; i++) {
        let odd = checkPalindrome(i, i, s);
        let even = checkPalindrome(i, i + 1, s);

        const len = Math.max(odd, even);
        if (max < len) {
            max = len;
            start = i - Math.floor((len - 1) / 2);
        }
    }
    return s.substring(start, start + max);

};
//leetcode submit region end(Prohibit modification and deletion)
