public class linearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return 1;
            }
        }
        return -1;
    }
}
