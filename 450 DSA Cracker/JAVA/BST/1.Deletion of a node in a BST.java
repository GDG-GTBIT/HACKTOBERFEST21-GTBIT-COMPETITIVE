
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
   if (root == null) {
        return null;
    }
    
    if (root.val < key) {
        TreeNode right =  deleteNode(root.right, key);
        root.right = right;
    } else if (root.val > key) {
        TreeNode left =  deleteNode(root.left, key);
        root.left = left;
    } else {
        if (root.right == null) {
            return root.left;
        } else {
            TreeNode pointer = root.right;
            while (pointer.left != null){
                pointer = pointer.left;
            }
            pointer.left = root.left;
            return root.right;
        }
    }
    
    return root;
}      
}
