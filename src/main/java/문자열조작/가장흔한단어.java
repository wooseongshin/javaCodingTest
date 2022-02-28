package 문자열조작;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 가장흔한단어 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        Set<String> ban = new HashSet<>();
        for(String word: banned) {
            ban.add(word);
        }
        ban.add("");

        String text = paragraph.replaceAll("[^\\w]", " ").toLowerCase();

        HashMap<String,Integer> hashMap = new HashMap<>();

        String[] result = text.split(" ");


        for(int i=0; i<result.length; i++){

            if(!ban.contains(result[i])) {
                hashMap.put(result[i], hashMap.getOrDefault(result[i], 1) + 1);
            }
        }
        int maxval = 0;
        String answer="";
        for(String s : hashMap.keySet()){
            if(maxval < hashMap.get(s)){
                maxval = hashMap.get(s);
                answer = s;
            }
        }

        System.out.println(answer);
    }



}
