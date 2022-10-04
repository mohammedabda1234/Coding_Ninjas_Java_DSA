package Graphs1;

public class Cycle {

    public static int solve(boolean[][] graph, int n) {

        int count=0;
        for(int i=0;i<graph.length;i++) {
            for(int j=0;j<graph.length;j++) {
                if(graph[i][j] ==true) {

                    for(int k=0;k<graph.length;k++) {

                        if(k!=i && graph[k][j]==true && graph[i][k] ==true ) {
                            count++;
                        }


                    }

                }
            }
        }
        return count/6;

    }

}
