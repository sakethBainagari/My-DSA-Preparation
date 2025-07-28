class multirec {
    
    static int fibbo(int n) {
        if(n<=1) return n;
        int last = fibbo(n-1);
        int secLast = fibbo(n-2);
        return last + secLast;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibbo(n));
    }
}