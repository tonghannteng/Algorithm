//  231. Power of Two

class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}