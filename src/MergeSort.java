public class MergeSort implements SortingAlgorithm {

    // split till
    @Override
    public void sort(int[] arr, int start, int finish) {
        if(start >= finish) return;
        int middle = (start + finish)/2;
        sort(arr, start, middle);
        sort(arr, middle + 1, finish);
        merge(arr, start,middle, finish);
    }

    // two arrays which we merge are already sorted so we must just join them into one sorted array
    private void merge(int[] arr, int start, int middle, int finish) {
        var leftArray = new int[middle - start + 1];
        var rightArray = new int[finish - middle];
        for(int i = start, j = 0; i <= middle;j++, i++) {
            leftArray[j] = arr[i];
        }
        for(int i = middle + 1, j = 0; i <= finish;j++, i++) {
            rightArray[j] = arr[i];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = start; i <= finish; i++) {
            if(leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if(leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if(leftIndex < leftArray.length) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if(rightIndex < rightArray.length) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


}
