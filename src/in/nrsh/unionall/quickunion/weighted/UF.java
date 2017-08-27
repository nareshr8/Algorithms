package in.nrsh.unionall.quickunion.weighted;

import static java.lang.StrictMath.max;

/**
 * We have a root item under which all linked items are stored. the second param being the root and the first one being the child.
 * There by making a tree structure
 * The Algorithm takes Big O notation of:
 * Initialization: N
 * Union: lg N
 * Find: lg N
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
        while(connectedComponents[i]!=i)
            i=connectedComponents[i];
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
