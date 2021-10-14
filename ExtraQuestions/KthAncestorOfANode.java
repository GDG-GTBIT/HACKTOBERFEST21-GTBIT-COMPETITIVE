import java.util.*;
/*
Finding Kth ancestor of a treeNode using binarylifting technique implemented using sparse table

Idea behind sparse table is that every number can be represented as sum of decreasing power of two
eg.  13 = 2^3  + 2^2  + 2^0
 
in given tree we have to find 6th ancestor of 8 i.e. 2

in power of two ,6 = 2^2 + 2^1 
above also divide further
                   = (2^1 + 2^1)  + 2^1
                   

so our sparse[i][j] will store  the  2^jth  ancestor of  node i 

eg. sparse[8][2]= 4  . i.e. (2^2=4 ancestor of node 8) =4
                     

                            1
                          /
                        2
                       / 
                      3
                     /
                    4
                   /
                  5
                 /
                6
              /
             7
            /
           8          
*/
class KthAncestorOfANode {

    int LOG = 18;
    int[][] sparse;

    public KthAncestorOfANode(int n, int[] parent) {     // parent array means ith node has parent parent[i]

        sparse = new int[n][LOG];
        for (int[] arr : sparse) {
            Arrays.fill(arr, -1);
        }
//---------------------------------PreProcessing (Filling sparse table) ---------------------------
// O(nlog(n))
        for (int i = 0; i < n; i++) {
            sparse[i][0] = parent[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < LOG; j++) {
                if (sparse[i][j - 1] != -1) {
                    sparse[i][j] = sparse[sparse[i][j - 1]][j - 1];
                } else {
                    sparse[i][j] = -1;
                }
            }
        }

    }
// O(log(n))
    public int getKthAncestor(int node, int k) {

        int ans = node;
        for (int i = LOG; i >= 0; i--) {
            if ((1 << i) <= k) {
                ans = sparse[ans][i];
                if (ans == -1) {
                    return -1;
                }
                k -= (1 << i);
            }
        }
        return ans;
    }
}
