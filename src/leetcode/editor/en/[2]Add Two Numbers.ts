//You are given two non-empty linked lists representing two non-negative 
//integers. The digits are stored in reverse order, and each of their nodes contains a 
//single digit. Add the two numbers and return the sum as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the 
//number 0 itself. 
//
// 
// Example 1: 
// 
// 
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// 
//
// Example 2: 
//
// 
//Input: l1 = [0], l2 = [0]
//Output: [0]
// 
//
// Example 3: 
//
// 
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each linked list is in the range [1, 100]. 
// 0 <= Node.val <= 9 
// It is guaranteed that the list represents a number that does not have 
//leading zeros. 
// 
//
// Related Topics Linked List Math Recursion 👍 32241 👎 6468


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

class ListNode {
    val: number
    next: ListNode | null

    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

/**
 *
 * @constructor
 */
function GetLinked(linked: ListNode | null, num: string[]): bigint {
    if (linked === null) return BigInt(0);
    num.push(`${linked.val}`);
    if (linked.next === null) {
        num.reverse();
        let s: string = "";
        for (let data of num) {
            s += data;
        }
        return BigInt(s);
    }
    return GetLinked(linked.next, num);
}

/**
 *
 * @constructor
 */
function BuildAddList(num: bigint): ListNode | null {
    let s = `${num}`.split("").reverse();
    let list:ListNode = new ListNode();
    let temp:ListNode | null = list;
    for (let i = 0; i < s.length; i++) {
        temp.val = parseInt(s[i]);
        if(i < s.length - 1){
            temp.next = new ListNode();
            temp = temp.next;
        }
    }
    return list;
}
function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    let num1 = GetLinked(l1, []);
    let num2 = GetLinked(l2, []);
    let sum = num1 + num2;
    return BuildAddList(sum);
};
//leetcode submit region end(Prohibit modification and deletion)
