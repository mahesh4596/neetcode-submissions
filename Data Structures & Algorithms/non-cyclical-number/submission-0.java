class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = square(n);
        }

        return n == 1;
    }

    int square(int n) {

        int square = 0;

        while(n != 0) {
            int digit = n % 10;
            square += digit * digit;
            n /= 10;
        }

        return square;
    }
}
