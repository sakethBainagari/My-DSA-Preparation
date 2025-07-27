
class paliRec {
    static boolean func(int i,String str){
        int n = str.length();
        if(i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
        return func(i+1,str);
    }
    public static void main(String[] args) {
        String str = "MAM";
        System.out.println(func(0,str));
    }
}