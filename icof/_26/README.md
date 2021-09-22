# 26 树的子结构

## 题目描述

输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)

B是A的子结构， 即 A中有出现和B相同的结构和节点值。

例如：

给定的树A：[3,4,5,1,2]

给定的树B：[4,1]

返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。

**示例1：**
```
输入：A = [1,2,3], B = [3,1]
输出：false
```

**示例2：**
```
输入：A = [3,4,5,1,2], B = [4,1]
输出：true
```

**限制：**
```
0 <= 节点个数 <= 10000
```

## 解题思路

1. 先序遍历树A的每个节点A<sub>i</sub>；
   
2. 判断树A中以节点A<sub>i</sub>为根节点的子树是否包含树B。

`recur(A, B)`函数：

1. 边界条件：
    
    （1）节点B为空：说明树B匹配完成，返回true；
    
    （2）节点A为空：说明树A已遍历完成，匹配失败，返回false；
   
    （3）节点A和B的值不同：说明匹配失败，返回false。
   
2. 返回值：
   
    （1）判断A和B的左子节点，即`recur(A.left,B.left)`

    （2）判断A和B的右子节点，即`recur(A.right,B.right)`
   
`isSubStructure(A,B)`函数：

1. 边界条件：树A或树B为空时，返回false。

2. 返回值：若树A包含树B，则满足以下三种情况之一：

    （1）以节点A为根节点的子树包含树B，即`recur(A,B)`；

    （2）树A左子树包含树B，即`isSubStructure(A.left, B)`；

    （3）树A右子树包含树B，即`isSubStructure(A.right, B)`。
   
**复杂度分析** 

- 时间复杂度O(MN)，其中MN分别为树A和树B的节点数量；
- 空间复杂度O(M)，其中M为树A的节点数量。

**代码**
```java
public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
```