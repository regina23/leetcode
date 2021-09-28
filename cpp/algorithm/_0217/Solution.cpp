#include <vector>
#include <algorithm>
#include <iostream>
#include <set>
#include <unordered_set>

using namespace std;

//class Solution {
//public:
//    bool containsDuplicate(vector<int>& nums) {
//        sort(nums.begin(), nums.end());
//        for(int i = 1; i < nums.size(); i++) {
//            if(nums[i] == nums[i-1]) {
//                return true;
//            }
//        }
//        return false;
//    }
//};

//class Solution {
//public:
//    bool containsDuplicate(vector<int>& nums) {
//        set<int> set(nums.begin(), nums.end());
//        int setLength = set.size();
//        int numsLength = nums.size();
//        if(setLength == numsLength) {
//            return false;
//        }
//        return true;
//    }
//};

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> s;
        for(int num : nums) {
            if(s.find(num) != s.end()) {
                return true;
            }
            s.insert(num);
        }
        return false;
    }
};

