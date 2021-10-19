

def binarySearch(arr, start, end, x):

	if(end>=start):
		mid =(start + end)//2; 
		if(arr[mid] == x):						
			return x
		if(arr[mid] > x):                				
			return binarySearch(arr,start,mid-1,x);
		return binarySearch(arr,mid+1,end,x);
	return -1;

n=int(input())	
ls=list(map(int, input().split()))
x=int(input())
result = binarySearch(ls,0,n-1,x);
if(result==-1):
	print("Element is not present in array")
else:
	print("Element is present ")
