class Solution
{   ArrayList<Integer> ls= new ArrayList<>();
   // return the Kth largest element in the given BST rooted at 'root'
   public int kthLargest(Node root,int k)
   {
       //Your code here
       fill(root);
       Collections.sort(ls);
       return(ls.get(ls.size()-k));
   }
   void fill(Node root){
       if(root==null)return;
       ls.add(root.data);
       fill(root.left);
       fill(root.right);
   }
}
