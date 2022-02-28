package 해시;

import java.util.HashMap;

public class 중복문자없는가장긴부분문자열 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        System.out.println(max);
    }
}
