#include<iostream>
using namespace std;
#define ll long long
long long toh(int N, int from, int to, int aux) {
    //Your code here
    int cnt=0;
    if(N>=1){
        cnt+=toh(N-1,from,aux,to);
        printf("move disk %d from rod %d to rod %d\n",N,from,to);
        cnt++;
        cnt+=toh(N-1,aux,to,from);
    }
    return cnt;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        ll moves=0;
        int n;
        cin>>n;
        moves=toh(n,1,3,2);
        cout<<moves<<'\n';
    }
    return 0;
}