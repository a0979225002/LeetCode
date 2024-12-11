//Given a string s, find the length of the longest substring without repeating 
//characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s consists of English letters, digits, symbols and spaces. 
// 
//
// Related Topics Hash Table String Sliding Window 👍 40730 👎 1964


//leetcode submit region begin(Prohibit modification and deletion)
function lengthOfLongestSubstring(s: string): number {

    let setString: Set<string> = new Set();
    let left = 0;
    let max = 0;
    for (let right = 0; right < s.length; right++) {
        //檢查當前是否有包含該字串,由左往右一直刪除 直到刪道沒有為止
        while (setString.has(s[right])) {
            setString.delete(s[left]);
            left++;
        }
        setString.add(s[right]);
        max = Math.max(max,right-left+1);
    }
    return max;
};
//leetcode submit region end(Prohibit modification and deletion)
