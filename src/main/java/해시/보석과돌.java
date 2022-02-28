package 해시;

public class 보석과돌 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        int result= S.replaceAll("[^" + J + "]", "").length();
        // j 가아닌건다없앰
    }
}
