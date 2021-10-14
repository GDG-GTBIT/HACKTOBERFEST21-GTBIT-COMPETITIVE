// Fenwick Tree or Binary indexed tree is used to solve the range queries like sum of range , update in range
// this can implemented for any range queries like sum,minimum,maximum, gcd
class FenwickTree {

    private int[] BIT;
    private int n;

    FenwickTree(int n) {
        this.n = n;
        this.BIT = new int[n];
    }

    // O(log(n))
    public int sum(int r) { // function give sum from [0 to r]
        int ans = 0;
        while (r >= 0) {
            ans += BIT[r];
            r = (r & (r + 1)) - 1;

        }
        return ans;
    }

    public int sum_range(int l, int r) {          // Range sum

        return sum(r) - sum(l - 1);
    }
  //O(log(n))
    public void update(int idx, int delta) { // this function update value at idx and all other
                                             // subarray where idx contribute
        while (idx < this.n) {
            BIT[idx] += delta;
            idx = idx | (idx + 1);
        }
    }

}