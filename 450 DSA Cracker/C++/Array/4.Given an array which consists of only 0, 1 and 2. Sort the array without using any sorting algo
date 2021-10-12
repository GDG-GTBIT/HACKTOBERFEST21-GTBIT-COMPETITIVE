void sort012(int a[], int n)
{
    int lo=0,mid=0,hi=n-1;
    while(mid<=hi){
        switch(a[mid]){
            case 0: swap(a[mid++],a[lo++]);
            break;
            case 1: mid++;
            break;
            case 2: swap(a[mid],a[hi--]);
            break;
        }
    }
