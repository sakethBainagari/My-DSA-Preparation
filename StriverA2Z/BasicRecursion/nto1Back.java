    class nto1Back {
        static void func(int i,int n){
            if(n<1){
                return;
            }
            func(i,n-1);
            System.out.println(n);
        }
        public static void main(String[] args) {
            int n = 5;
            func(n,n);
        }
    }