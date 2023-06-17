public class bubble_sort {

    int bubbleSort(int[] arr){
        boolean arrayState = true;
        while (arrayState) {
            // set state to false once the loop starts
            arrayState = false;
            // Looping through array and swapping
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Set the while state to through if we detect any sorting
                    arrayState = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        bubble_sort sort = new bubble_sort();
        int[] sortArray = {8,5,6,3,4,2,7,2,1,0,9};
        sort.bubbleSort(sortArray);
        for (int i = 0; i < sortArray.length; i++){
            System.out.println(sortArray[i]);
        }
    }
}
