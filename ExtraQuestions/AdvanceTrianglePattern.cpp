#include <iostream.h> 

int main()
{ 
  int i, j; 
  int n=5;//size 

  /upper part/ 

  for(i=n/2; i<=n; i+=2) 
  { 
    for(j=1; j<n-i; j+=2) 
    { 
      cout<<" "; 
    } 

    for(j=1; j<=i; j++) 
    { 
      cout<<"*"; 
    } 

    for(j=1; j<=n-i; j++) 
    { 
      cout<<" "; 
    } 

    for(j=1; j<=i; j++) 
    { 
      cout<<"*"; 
    } 

    cout<<endl; 
  } 

  /lower part/ 

  for(i=n; i>=1; i--) 
  { 
    for(j=i; j<n; j++) 
    { 
      cout<<" "; 
    } 

    for(j=1; j<=(i*2)-1; j++) 
    { 
      cout<<"*"; 
    } 

    cout<<endl; 
  } 

} 
