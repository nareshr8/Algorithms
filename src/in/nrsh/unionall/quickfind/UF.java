package in.nrsh.unionall.quickfind;

/**
 * We name the value of array element 'p' to be value of q's when we connect pa dn q.
 * The Algorithm takes Big O notation of:
 * Initialization: N
 * Union: N
 * Find: 1
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
        if (p > 0 && p < connectedComponents.length)
            if (q > 0 && q < connectedComponents.length)
                return connectedComponents[p] == connectedComponents[q];
        return false;
    }

    public void union(int p, int q) {
        int pId=connectedComponents[p];
        for (int i = 0; i < connectedComponents.length; i++) {
            if (connectedComponents[i] == pId) {
                connectedComponents[i] = connectedComponents[q];
            }
        }

    }
}
