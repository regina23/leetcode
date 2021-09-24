#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int res = nums[0];
        int dp = nums[0];
        for(int i = 1; i < n; i++) {
            dp = max(nums[i], dp + nums[i]);
            res = max(res, dp);
        }
        return res;
    }
};
