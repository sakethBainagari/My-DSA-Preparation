
class fact {
    static int fact(int n) {
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fact(n));
    }
}