public class SelectionSort implements SortingAlgorithm{
    @Override
    public void sort(int[] arr, int start, int finish) {
        for(int i = start; i <= finish; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j = i+1; j <= finish; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
    }
}
