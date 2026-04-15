package codex.leetcode;

import java.util.HashSet;

/*
 * Problem: 001. Contains Duplicate
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*
 * Fill this block before writing the solution.
 *
 * Input:
 * - nums = [1,2,3,1]
 *
 * Output:
 * - true
 *
 * Brute-force idea:
 * - Brute force is I think, I will use each element and compare it with rest of elements.
 * So I think it will take 2 for loops which will result in O(n^2) time complexity.
 *
 * Better idea:
 * - So normally I use set to get elements and while iterating though the nums I check whether that element exists in the set
 * If it exists then I return true or false.
 *
 *
 *
 * Key invariant (top of each loop iteration at index i):
 * - numSet contains exactly nums[0..i-1], and no duplicate has been found yet.
 *
 * Time complexity:
 * - Brute force: O(n^2) — n outer iterations × up to n inner comparisons.
 * - This solution: O(n) average — one loop of n iterations × O(1) HashSet ops.
 *
 * Space complexity:
 * - O(n) — numSet holds up to n distinct elements in the all-distinct case.
 *
 * Common bug to avoid:
 * - if we add first and check later, it will result in false outputs.
 */
class Problem001ContainsDuplicate {

    public boolean containsDuplicate(final int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num: nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }

        return false;

    }

    public static void main(final String[] args) {
        Problem001ContainsDuplicate solution = new Problem001ContainsDuplicate();

        System.out.println(solution.containsDuplicate(new int[]{}));
        System.out.println(solution.containsDuplicate(new int[]{5}));
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
