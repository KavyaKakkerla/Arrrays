///I DID BY MY OWN USING HASH TABLE
class Solution {

    public int singleNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                set.remove(nums[i]);
            }
        }
        for(int n:set)
        {
            return n;
        }
    return -1;
        
    }
}

/* TIME COMPLEXITY IS 
  The time complexity of the singleNumber method in the above code is O(n), where n is the number of elements in the input array nums. 
  This is because the method iterates through the array once to check if each element is already in the HashSet (O(1) time complexity 
  for HashSet operations on average). The overall time complexity is dominated by the loop that iterates through the array.

The space complexity is also O(n) in the worst case. This is because the HashSet can potentially store all n elements of the input array 
  if none of them are duplicates. In the best case, where all elements are duplicates except for one, the HashSet will only store one element,
  resulting in O(1) space complexity. However, the worst-case scenario is considered for space complexity analysis, so the space complexity is O(n).
  */



 int xor=0;
    for(int i=0;i<nums.length;i++)
    {
        xor=xor^nums[i];
    }
    return xor;
