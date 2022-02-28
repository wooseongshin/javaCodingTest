package 문자열조작;

public class 유효한팰린드롬 {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        // 정규표현식에 해당하는거빼고 ""로
        String text = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text);
        StringBuilder stringBuilder = new StringBuilder(text);


        System.out.println(text.equalsIgnoreCase(stringBuilder.reverse().toString()));

    }
}
