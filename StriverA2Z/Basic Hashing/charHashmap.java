import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();                
        Map<Character, Integer> map= new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        // show the frequencies
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        // answer queries
        int q = s.nextInt();
        while (q-- > 0) {
            char ch = s.next().charAt(0);    
            System.out.println(freq.getOrDefault(ch, 0));
        }
    }
}
