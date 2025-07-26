    class Main {
        static void func(int i,int n){
            if(n<i){
                return;
            }
            System.out.println(n);
            func(i,n-1);
        }
        public static void main(String[] args) {
            int n = 5;
            func(1,n);
        }
    }