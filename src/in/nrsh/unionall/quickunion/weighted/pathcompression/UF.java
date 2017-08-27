package in.nrsh.unionall.quickunion.weighted.pathcompression;

/**
 * On top of  weighted quick Union we do path compression where we flatten the tree structure as we traverse to the root.
 * The Algorithm takes Big O notation of:
 * Initialization: N
 * Union:  lg*N
 * Find:  1
 * O(N + M lg* N) : M union-find operations on size N
 */
public class UF {
    int[] connectedComponents;

    int[] depth;

    public UF(int N) {
        connectedComponents = new int[N];
        depth = new int[N];
        for (int i = 0; i < connectedComponents.length; i++) {
            connectedComponents[i] = i;
            depth[i]=0;
        }
    }

    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    private int root(int index) {
        int i=index;
        //The flatteninf of the root happens in this step
        while(connectedComponents[i]!=i) {
            connectedComponents[i]=connectedComponents[connectedComponents[i]];
            i = connectedComponents[i];
        }
        connectedComponents[index]=i;
        return i;
    }


    public void union(int p, int q)
    {
        if(!connected(p,q)) {
            int rootP = root(p);
            int rootQ = root(q);
            if (depth[rootP] < depth[rootQ]) {
                connectedComponents[rootP] = rootQ;
                depth[rootP] += depth[rootQ];
            } else {
                connectedComponents[rootQ] = rootP;
                depth[rootQ] += depth[rootP];
            }
        }
    }
}
