class Solution {
public:
    int findDuplicate(vector<int>& nums) {
       map<int,int>m;
        int p;
        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
            if(m[nums[i]]==2)
            {
                p=nums[i];
                break;
            }
        }
        return p;
        
        
    }
};
