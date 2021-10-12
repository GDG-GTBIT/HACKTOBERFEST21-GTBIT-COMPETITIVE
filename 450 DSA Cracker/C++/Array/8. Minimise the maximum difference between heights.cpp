int getMinDiff(int a[], int n, int k) {
sort(a,a+n);
int min_e,max_e;
int res=a[n-1]-a[0];
for(int i=1;i<=n-1;i++)
{
if(a[i]>=k)
{
max_e=max(a[i-1]+k,a[n-1]-k);
min_e=min(a[0]+k,a[i]-k);
res=min(res,max_e-min_e);
}
else
continue;
}
return res;
}
