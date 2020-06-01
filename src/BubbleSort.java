public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr, int start, int finish) {
        // when array is sorted, while loop finishes
        var sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for(int i = start; i < finish; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
