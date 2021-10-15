#include<bits/stdc++.h>
using namespace std;

int main() 
{ 
  int n = 9; // prefer odd values 
  int x = 1; 


  for(int i =1; i <= n; i++) 
  { 
    for(int j =1; j <= n; j++) 
    { 
      if ((j <= x || j >= n - x + 1) && j % 2 == 1) 
      { 
        cout<<"* "; 
      } 
      else if ((j >= x && j <= n - x + 1) && i % 2 == 1) 
      { 
        cout<<"* "; 
      } 
      else 
      { 
        cout<<"  "; // 2ws 
      } 
    } 
    cout<<endl; 
    if (i <= n / 2) 
      x= x+1; 
    else 
      x= x-1; 
  } 
  return 0; 
} 
