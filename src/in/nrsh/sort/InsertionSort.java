package in.nrsh.sort;

/**
 * Insertion sort is the one that happens when each record is inserted. The record is inserted left to right.
 * When the records are inserted, the new record is moved to the appropriate position to the left so that the order is maintained
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(Comparable[] comparableItems) {
        for (int i = 0; i < comparableItems.length; i++) {
            for (int j = i; j > 0; j--) {
                if (lessThan(comparableItems[j], comparableItems[j-1])) {
                    swap(comparableItems, j, j-1);
                }
            }
        }
    }

}
