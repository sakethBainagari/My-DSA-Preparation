    class firstn {
        static void func(int n,int sum){
            if(n<1){
                System.out.println(sum);
                return;
            }
            func(n-1,sum + n);
        }
        public static void main(String[] args) {
            int n = 3;
            func(n,0); // intializing sum = 0
        }
    }