public class Insertion_sort {

    public static void array(){
        int[] array = {5, 4, 6, 2, 1, 7, 8, 9, 3};
        insertion_sort(array);

        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static void insertion_sort(int arr[]){
        // Get index 1 and store it
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > temp){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
    }
    public static void main(String[] args) {
        Insertion_sort.array();
    }
}