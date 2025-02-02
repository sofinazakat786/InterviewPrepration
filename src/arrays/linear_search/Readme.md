Linear Search: 
- Linear search is a simple search algorithm that searches for a target value within an array.
- It sequentially checks each element of the array for the target value until a match is found or until all the elements have been searched.
- It is also known as a sequential search.
- It is not suitable for large data sets as it is not efficient.
- It has a time complexity of O(n) where n is the number of elements in the array.
- syntax: linear_search(arr, target)
- Example: linear_search([1, 2, 3, 4, 5], 3) => 2
- logic: 
  - Iterate through the array and check if the current element is equal to the target value.
  - If the element is found, return the index of the element.
  - If the element is not found, the function will return -1 as the index of an element in an array cannot be negative.
 Flow:
  - arr = [1, 2, 3, 4, 5]
  - target = 3
  - 1 != 3
  - 2 != 3
  - 3 == 3
  - return 2