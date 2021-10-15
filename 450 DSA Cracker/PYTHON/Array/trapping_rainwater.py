#ques 34 - Trapping rainwater
'''Given an array arr[] of N non-negative integers representing the height 
    of blocks. If width of each block is 1, compute how much water can be 
    trapped between the blocks during the rainy season. '''

def trapping_rainwater(N, heights):
    left_height = [0] * N
    right_height = [0] * N
    water = 0

    max_height_left = 0
    for i in range(N):
        left_height[i] = max_height_left
        max_height_left = max(max_height_left, heights[i])

    max_height_right = 0
    for i in range(N - 1, -1, -1):
        right_height[i] = max_height_right
        max_height_right = max(max_height_right, heights[i])

    for i in range(N):
        cur_water = min(left_height[i], right_height[i]) - heights[i]
        water += cur_water if cur_water > 0 else 0

    return water

print(trapping_rainwater(4, [7,4,0,9]))