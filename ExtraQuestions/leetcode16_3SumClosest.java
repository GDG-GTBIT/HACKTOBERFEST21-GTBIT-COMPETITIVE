import java.util.Arrays;
public class leetcode16_3SumClosest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=(int)1e9;
        for(int i = 0 ; i < nums.length-2 ; i++)
        {
            int low = i+1 , high = nums.length-1;
            
            while(low<high)
            {
            int sum = nums[i] + nums[low] + nums[high];
            if(Math.abs(target-sum) < Math.abs(target-res))
            res = sum;             
            if(sum == target)
                return sum;
            else if(sum < target)
                low++;
            else if(sum > target)
                high--;
            }
            
        }
        return res;
    }
}