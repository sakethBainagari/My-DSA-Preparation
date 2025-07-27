    class factRec {
        static int func(int n){
            if(n==0){
                return 0;
            }
            return n+func(n-1);
        }
        public static void main(String[] args) {
            int n = 3; // 1+2+3 = 6
            System.out.println(func(n)); 
        }
    }