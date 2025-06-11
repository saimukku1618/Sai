class Solution {
    public int[] twoSum(int[] nums, int target)
     {
      int n=nums.length;
      int ans[]=new int[2];
      HashMap<Integer,Integer>mpp=new HashMap<>() ;
      for(int i=0;i<n;i++)
      {
        int extra=target-nums[i];
        if(mpp.containsKey(extra))
        {
            ans[0]=i;
            ans[1]=mpp.get(extra);
            return ans;
        }
        mpp.put(nums[i],i);
      } 
      return new int[]{};
    }
}
