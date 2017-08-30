package in.nrsh.sort;

/**
 * Selection sort is the one in which We run through the entire set in the right and
 * select the minimal value and swap the value to the left most value of the unsorted array.
 *
 * Time Complexity : O(N^2)
 * Space Complexity: O(1)
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(Comparable[] comparableItems) {
        for (int i = 0; i < comparableItems.length; i++) {
            for (int j = i; j < comparableItems.length; j++) {
                if (lessThan(comparableItems[j], comparableItems[i])) {
                    swap(comparableItems, i, j);
                }
            }
        }
    }

}
