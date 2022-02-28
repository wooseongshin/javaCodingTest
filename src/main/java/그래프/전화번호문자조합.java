package 그래프;

import java.util.ArrayList;
import java.util.List;

public class 전화번호문자조합 {
    public static void main(String[] args) {
        String digits = "23";

        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<String>();

        if (digits.length()==0) System.out.println(result);

        result.add("");
        for (int i=0; i<digits.length(); i++)
            result = combine(digitletter[digits.charAt(i)-'0'],result);

        System.out.println(result.toString());;
    }

    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<String>();

        for (int i=0; i<digit.length(); i++)
            for (String x : l)
                result.add(x+digit.charAt(i));

        return result;


    }
}
