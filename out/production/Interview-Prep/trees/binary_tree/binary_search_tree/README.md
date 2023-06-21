# Binary Search Tree or BST 
### What is Binary Search Tree or BST?

It is basically a binary tree with some additional properties
At max will have two child nodes

**Special Properties of BST**

- Left subtree nodes is always **less than** root node. Example if root is 4 then left will have less than 4 (value) nodes
- Right subtree nodes is always **greater than** root node. Example if root is 4 then right will have greater than 4 (value) nodes
- Left and right subtrees are also BST with no duplicates
- _Inorder traversal of BST gives a **sorted** sequence_

```
Time complexity of the BST is O(H) which is logn
Where H is the height of the tree
O(N) worst time complexity will occured only when skewed tree (only in one direction)
```