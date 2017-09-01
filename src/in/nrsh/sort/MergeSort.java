package in.nrsh.sort;

/**
 * Insertion sort is the one that happens when each record is inserted. The record is inserted left to right.
 * When the records are inserted, the new record is moved to the appropriate position to the left so that the order is maintained
 * <p>
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class MergeSort implements Sort {

    @Override
    public void sort(Comparable[] comparableItems) {
        Comparable[] aux = comparableItems.clone();
        sort(comparableItems, aux, 0, comparableItems.length-1);
    }

    private void sort(Comparable[] items, Comparable[] auxItems, int start, int end) {
        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        sort(items, auxItems, start, mid);
        sort(items, auxItems, mid + 1, end);
        merge(items, auxItems, start, mid, end);
    }

    private void merge(Comparable[] items, Comparable[] auxItems, int start, int mid, int end) {
        int r = start;
        int i = start;
        int j = mid + 1;

        for (int k = start; k <= end; k++) {
            auxItems[k] = items[k];
        }
        while (r <= end) {
            if (i > mid)
                items[r++] = auxItems[j++];
            else if (j > end)
                items[r++] = auxItems[i++];
            else if (lessThan(auxItems[i], auxItems[j]))
                items[r++] = auxItems[i++];
            else
                items[r++] = auxItems[j++];
        }
    }
}
