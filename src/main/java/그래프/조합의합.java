package 그래프;

import java.util.ArrayList;
import java.util.List;

public class 조합의합 {
    //1부터 n까지 k 개 조합
    public static void main(String[] args) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        int[] candidates={2,3,6,7};
        int target = 7;
        combine(combs, new ArrayList<Integer>(),candidates, target,0);
        System.out.println(combs);

    }

    public static void combine(List<List<Integer>> combs, List<Integer> comb, int[] candidate,int target,int start) {

        if (target< 0) {
            for(int i=start;i<candidate.length && target >= candidate[i];i++) {
                comb.add(candidate[i]);
                combine(combs, comb, candidate, target-candidate[i],i);
                comb.remove(comb.size()-1);
            }
        } else if (target == 0){
            combs.add(new ArrayList<>(comb));
        }
}}