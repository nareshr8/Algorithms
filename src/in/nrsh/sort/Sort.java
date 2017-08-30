package in.nrsh.sort;

/**
 * Created by Naresh on 29-08-2017.
 */
public interface Sort {
    public void sort(Comparable[] comparableItems);

    public default boolean lessThan(Comparable a, Comparable b){
            return a.compareTo(b)<0;
    }

    public default void swap(Comparable[] comparables, int i, int j){
        Comparable swap = comparables[i];
        comparables[i]=comparables[j];
        comparables[j]=swap;
    }

}
