import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* I implemented sorting algorithms for int[]
 * Only counting sort I made for char because counting sort works good for char and byte
 */

class SortingTest {

    @Test
    public void bubbleSort() {
        assertSorting(new BubbleSort());
    }

    @Test
    public void insertionSort() {
        assertSorting(new InsertionSort());
    }

    @Test
    public void selectionSort() {
        assertSorting(new  SelectionSort());
    }

    @Test
    public void mergeSort() {
        assertSorting(new MergeSort());
    }

    @Test
    public void quickSort() {assertSorting(new QuickSort());}

    @Test
    public void countingSort() {
        var notSorted = new char[]{'b', 'b', 'a', 'c', 'd', 'a', 'b'};
        var sorted = new char[]{'a', 'a', 'b', 'b', 'b', 'c', 'd'};
        new CountingSort().charSort(notSorted, 0, notSorted.length - 1);
        assertArrayEquals(sorted, notSorted);
    }

    @Test
    public void myCountingSort() {
        assertSorting(new CountingSort());
    }

    private void assertSorting(SortingAlgorithm sortingAlgorithm) {
        int[] notSorted = {3, 1, 4, 5, 2};
        int[] sorted = {1, 2, 3, 4, 5};
        sortingAlgorithm.sort(notSorted, 0, notSorted.length - 1);
        assertArrayEquals(sorted, notSorted);
    }


}