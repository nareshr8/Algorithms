package in.nrsh.unionall.quickunion;

/**
 * We have a root item under which all linked items are stored. the second param's root being the root of the first one.
 * There by making a tree structure
 * The Algorithm takes Big O notation of:
 * Initialization: N
 * Union: N (As finding the root can cost N)
 * Find: N
 */
public class UF {
    int[] connectedComponents;

    public UF(int N) {
        connectedComponents = new int[N];
        for (int i = 0; i < connectedComponents.length; i++) {
            connectedComponents[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    private int root(int index) {
        int i=index;
        while(connectedComponents[i]!=i)
            i=connectedComponents[i];
        return i;
    }

    public void union(int p, int q) {
        int rootP=root(p);
        int rootQ=root(q);
        connectedComponents[rootQ]=rootP;
    }
}
