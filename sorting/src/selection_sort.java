public class selection_sort {
    void selectionSort(int[] arr){
        int size = arr.length;
//        int minIndex = arr[1];
//        for (int i = 0; i<size;i++){
//            if (minIndex > arr[i+1]){
//                minIndex = arr[i+1];
//            }
//        }
//        System.out.println("Minimum Index " + minIndex);
//        // Swapping numbers
//        int temp = arr[1];
//        int lastElement = temp;
//        arr[1] = minIndex;

        for (int step = 0; step< size-1;step++){
            int minIndex = step;
            for (int i = step+1;i<size;i++){
                if (arr[minIndex] > arr[i]){
                    minIndex = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args){
        selection_sort sort = new selection_sort();
        int[] unsortedArray = {9344, 45664, 56655, 63665, 76655, 0, 8455, 3655, 23345, 1555};
        sort.selectionSort(unsortedArray);
        for (int i = 0; i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }
}

//Complexity = O(n2)
//
//        Also, we can analyze the complexity by simply observing the number of loops. There are 2 loops so the complexity is n*n = n2.
//
//        Time Complexities:
//
//        Worst Case Complexity: O(n2)
//        If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
//        Best Case Complexity: O(n2)
//        It occurs when the array is already sorted
//        Average Case Complexity: O(n2)
//        It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
//        The time complexity of the selection sort is the same in all cases. At every step, you have to find the minimum element and put it in the right place. The minimum element is not known until the end of the array is not reached.
//
//        Space Complexity:
//
//        Space complexity is O(1) because an extra variable temp is used.