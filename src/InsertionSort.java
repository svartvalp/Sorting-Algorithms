public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr, int start, int finish) {
        for (int i = start + 1; i <= finish; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
