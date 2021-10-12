bool search(Node* root,int k){
    if(root==NULL)
     return false;
     if(root->data==k)
      return true;
     if(k<root->data)
      search(root->left,k);
     else
     search(root->right,k);
}

Node* insert(Node* root, int Key) {
    // Your code here
    if(search(root,Key)==false){
    if(root==NULL)
     return new Node(Key);
     
    if(Key<root->data)
     root->left=insert(root->left,Key);
    else
    root->right=insert(root->right,Key);
     return root;
    }
    else  return root;
}
