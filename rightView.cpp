using namespace std;
#include <iostream> 
#include <vector>
#include <queue>

struct node{
    node*right;
    node*left;
    int data;
    node(int k){
        data = k;
        left = right = NULL;
    }
};

vector<int> rightView(node *root){
    vector<int> v;
   queue<node*> q;
   if(root==NULL) return v;
   q.push(root);
   while(q.size()){
       int a = q.size();
       for(int i = 0; i < a; i++){
           node*curr = q.front();
           q.pop();
           if(i==(a-1)) v.push_back(curr->data);
           if(curr->left) q.push(curr->left);
           if(curr->right) q.push(curr->right);
       }
   }
   return v;
    }

int main(){
 
}