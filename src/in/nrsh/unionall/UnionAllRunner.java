package in.nrsh.unionall;

import java.util.Scanner;

/**
 * Algorithm            Initialize      Union           Connected
 * Quick Find               N           N                  1
 * Quick Union              N           N                  N
 * Weighted QU              N         lg N               lg N
 * W QU Path Compression    N         lg* N              lg* N : M operations on size N
 *
 * Details: https://www.cs.princeton.edu/~rs/AlgsDS07/01UnionFind.pdf
 */
public class UnionAllRunner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	    int N= scanner.nextInt();
//	    in.nrsh.unionall.quickfind.UF uf=new in.nrsh.unionall.quickfind.UF(N);
//        in.nrsh.unionall.quickunion.UF uf=new in.nrsh.unionall.quickunion.UF(N);
        in.nrsh.unionall.quickunion.weighted.UF uf=new in.nrsh.unionall.quickunion.weighted.UF(N);
	    while(!scanner.next().isEmpty()){
	        int p= scanner.nextInt();
	        int q= scanner.nextInt();
	        if(!uf.connected(p,q)){
	            uf.union(p,q);
                System.out.println(p+" and "+q+" are connected");
            }
        }
    }
}
