package in.nrsh.sort;

/**
 * Shell Sorting is doing insertion sorting with an interval of h items.
 * Insertion Sort the items that are h indices away from one another.
 * Later we reduce h to slowly towards 1. Since we have the data already sorted, the performance is much better
 *
 * Time Complexity: O(N log(N)^2)
 * Space Complexity: O(1)
 */
public class ShellSort implements Sort {

    @Override
    public void sort(Comparable[] comparableItems) {
        int h=comparableItems.length;
        while (h != 0) {
            h = h / 3 + 1;

            for (int i = h; i < comparableItems.length; i++) {
                for (int j = i; j-h >= 0; j-=h) {
                    if (lessThan(comparableItems[j], comparableItems[j - h])) {
                        swap(comparableItems, j, j - h);
                    }
                }
            }
            h/=3;
        }
    }

}
