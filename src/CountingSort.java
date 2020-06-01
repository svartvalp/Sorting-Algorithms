import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountingSort implements SortingAlgorithm {


    public void charSort(char[] arr, int start, int finish) {

        // find maximum value in array, char is unsigned so all values will be between 0 and max

        char max = Character.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)  {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        // array of counts for each value
        int[] count = new int[max+1];
        Arrays.fill(count, 0);
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int i = 0;
        for(int j = 0; j < count.length; j++) {
            for(int k = 0; k < count[j]; k++) {
                arr[i] = (char) j;
                i++;
            }
        }
    }

    // my implementation for normal working with ints
    @Override
    public void sort(int[] arr, int start, int finish) {
        // I used tree map to not break ordering in array

        Map<Integer, Integer> count = new TreeMap<>();
        for(int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }
        int currentIndex = 0;
        for(Integer key : count.keySet()) {
            for(int j = 0; j < count.get(key); j++) {
                arr[currentIndex] = key;
                currentIndex++;
            }
        }
    }
}
