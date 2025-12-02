class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;         // each child must get at least 1

        long m = money - children;               // leftover after giving each child $1
        int k = (int) Math.min(m / 7, (long)children); // max children that can become 8

        long r = m - 7L * k;                     // remaining leftover after making k kids 8

        // Case 1: we gave all children 8 but leftover > 0 -> impossible, reduce one
        if (k == children && r != 0) {
            k--;
            r += 7; // not necessary for answer but clarifies reasoning
        }

        // Case 2: exactly one child is NOT 8 and leftover == 3 -> that single child would become 4
        if (k == children - 1 && r == 3) {
            k--;
        }

        return k;
    }
}
