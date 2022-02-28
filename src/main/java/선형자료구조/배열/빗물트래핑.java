package 선형자료구조.배열;

import java.util.Stack;

public class 빗물트래핑 {
    public static void main(String[] args) {
        int[] A= {0,1,0,2,1,0,1,3,2,1,2,1};
        if (A==null) System.out.println(0);
        Stack<Integer> s = new Stack<Integer>();
        int i = 0, maxWater = 0, maxBotWater = 0;
        while (i < A.length){
            if (s.isEmpty() || A[i]<=A[s.peek()]){
                s.push(i++);
            }
            else {
                int bot = s.pop();
                maxBotWater = s.isEmpty()? // empty means no il
                        0:(Math.min(A[s.peek()],A[i])-A[bot])*(i-s.peek()-1);
                maxWater += maxBotWater;
            }
        }
        System.out.println(maxWater);

    }
}
