class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if(digitSum(n) <= target)return 0;

        long original = n;
        long place = 1;

        while(true){
            long next = ((n/place) + 1) * place;
            if (digitSum(next) <= target) {
                return next - original;
            }
            place *= 10;
        }


    }
    public static int digitSum(long n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}