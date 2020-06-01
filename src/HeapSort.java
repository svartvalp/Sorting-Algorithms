public class HeapSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr, int start, int finish) {
        int size = finish - start + 1;
        for(int i = (size/2 - 1) + start; i >= start; i--) {
            heapify(arr, start, finish, i);
        }
        for(int i = finish; i >= start; i--) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            heapify(arr, start, i - 1, 0);
        }
    }

    private void heapify(int[] arr, int start, int finish, int currentNodeIndex) {
        int largestElementIndex = currentNodeIndex;
        int leftChildIndex = currentNodeIndex * 2 + 1;
        int rightChildIndex = currentNodeIndex * 2 + 2;
        if(leftChildIndex <= finish && arr[leftChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }
        if(rightChildIndex <= finish && arr[rightChildIndex] > arr[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }
        if(largestElementIndex != currentNodeIndex) {
            int temp = arr[currentNodeIndex];
            arr[currentNodeIndex] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;

            heapify(arr, start, finish, largestElementIndex);
        }
    }
}
