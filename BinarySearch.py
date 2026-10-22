def binarysearch(arr, target):
  low=0
  high=len(arr)-1
  while(left<=high):
    mid=(low+high)//2
    if(arr[mid]==target):
      return mid
    elif(arr[mid]<target):
      low=mid+1
    else:
      high=mid-1
  return -1

binarysearch([2,4,5,6,9,10,15,21], 6)
