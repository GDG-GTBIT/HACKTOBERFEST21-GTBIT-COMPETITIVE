vector<int> levelOrder(Node* node)
    {
      //Your code here
      queue<Node*>q;
      vector<int>v;
      q.push(node);
      while(!q.empty()){
          
          Node* cur=q.front();
          q.pop();
          v.push_back(cur->data);
          if(cur->left)   q.push(cur->left);
          if(cur->right)  q.push(cur->right); 
      }
      return v;
    }
