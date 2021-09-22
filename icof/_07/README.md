# 07 重建二叉树

## 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

例如，给出
```
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
```

返回如下的二叉树：
```
    3
   / \
  9  20
    /  \
   15   7
```

**限制：**

`0 <= 节点个数 <= 5000`

## 解题思路

只适用于节点无重复值的树。

1. 前序遍历的首元素为树的根节点的值；

2. 在中序遍历中搜索根节点的索引，将中序遍历划分为[左子树|根节点|右子树]；

3. 根据中序遍历中左/右子树的节点数量，将前序遍历划分为[根节点|左子树|右子树]。

**分治算法：**

- 递推参数：根节点在前序遍历中的索引`root`，子树在中序遍历中的左边界`left`，子树在中序遍历中的右边界`right`；

- 边界条件：`left > right`时越界，返回null；

- 递推内容：
    
    1. 建立根节点`node`：节点值为`preorder[root]`；
    
    2. 划分左右子树：查找根节点在中序遍历中的索引`i`；
    
    3. 构建左右子树：开始左右子树递归

|       | 根节点索引 | 中序遍历左边界 | 中序遍历右边界 |
| :-----: | :----: | :----: | :----: |
| 左子树 | root + 1 | left | right |
| 右子树 | root - left + i + 1 | i + 1 | right |

- 返回值：返回`node`

**复杂度分析：**

- 时间复杂度：O(N)
- 空间复杂度：O(N)