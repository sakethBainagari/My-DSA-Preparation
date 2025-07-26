    class backtrackin1ton {
        static void func(int i,int n){
            if(i<1){
                return;
            }
            func(i-1,n);
            System.out.println(i);
        }
        public static void main(String[] args) {
            int n = 5;
            func(n,n);
        }
    }