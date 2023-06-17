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
