// function lengthOfLongestSubstring(s: string): number {
//
//     let setString: Set<string> = new Set();
//     let left = 0;
//     let max = 0;
//     for (let right = 0; right < s.length; right++) {
//         //檢查當前是否有包含該字串,由左往右一直刪除 直到刪道沒有為止
//         while (setString.has(s[right])) {
//             setString.delete(s[left]);
//             left++;
//         }
//         setString.add(s[right]);
//         max = Math.max(max,right-left+1);
//     }
//     return max;
// };
//
// lengthOfLongestSubstring("abcabcbb");