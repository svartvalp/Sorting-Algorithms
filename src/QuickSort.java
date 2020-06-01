public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr, int start, int finish) {
        if(start >= finish) return;
        int pivot = partition(arr, start, finish);
        sort(arr,start, pivot -1);
        sort(arr, pivot+1, finish);
    }

    private int partition(int[] arr, int start, int finish) {
        int pivot = arr[finish];
        int i = start-1;
        for(int j = start; j < finish; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[finish];
        arr[finish] = temp;
        return i;
    }
}
