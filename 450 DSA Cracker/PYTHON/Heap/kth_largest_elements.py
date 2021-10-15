#Ques 339 - Kth largest elements
'''Given an array Arr of N positive integers, find K largest elements from the array.  
    The output elements should be printed in decreasing order.'''
import heapq

def kth_largest_elements(N, K, elements):
    hp = []
    for i, element in enumerate(elements):
        if i < K:
            heapq.heappush(hp, element)
        else:
            if hp[0] < element:
                heapq.heappop(hp)
                heapq.heappush(hp, element)
    return hp[::-1]

print(kth_largest_elements(5, 2, [12, 5, 787, 1, 23]))
