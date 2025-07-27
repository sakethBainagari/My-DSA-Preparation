    // using recution and two pointers
    class revArr {
        static void func(int l, int r,int[] arr){
            if(l>=r){
                return;
            }
            // int temp = arr[l];
            // arr[l] = arr[r];
            // arr[r] = temp;
            swap(l,r,arr);
            func(l+1,r-1,arr);
        }
        static void swap(int l,int r,int[] arr){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]=temp;
        }
        public static void main(String[] args) {
            int[] arr = {1,2,3};
            int n = arr.length;
            func(0,n-1,arr); 
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }