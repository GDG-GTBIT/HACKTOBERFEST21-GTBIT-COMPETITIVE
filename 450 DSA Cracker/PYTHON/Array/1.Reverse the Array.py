# creating an array
arr = []

# number of elements as input
n = int(input("Enter number of elements : "))

# iterating till the range
for i in range(0, n):
	ele = int(input())
	arr.append(ele) # adding the element
	
print("Before reversal Array is :",arr)

res = arr[::-1] #reversing using list slicing
print("Resultant new reversed array:",res)
