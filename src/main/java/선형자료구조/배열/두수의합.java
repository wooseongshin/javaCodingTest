package 선형자료구조.배열;

import java.util.Arrays;
import java.util.HashMap;

public class 두수의합 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;


        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){

            Integer diff = (Integer)(target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                System.out.println(Arrays.toString(toReturn));
                break;
            }

            hash.put(numbers[i], i);

        }


    }
}
