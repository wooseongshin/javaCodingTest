package 그래프;

import java.util.ArrayList;
import java.util.Arrays;

public class 여행경로 {
    static boolean[] visited;
    static ArrayList<String> allRoute;

    public static void main(String[] args) {

        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        String[] answer = {};
        int cnt =0;
        allRoute = new ArrayList<>();
        visited = new boolean[tickets.length];

        dfs("ICN","ICN",tickets,cnt);

        answer = allRoute.get(0).split(" ");

        Arrays.asList(answer);



    }

    public static void dfs(String start,String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }

        for(int i=0; i< tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1],tickets,cnt+1);
                visited[i] = false;

            }
        }
    }
}
