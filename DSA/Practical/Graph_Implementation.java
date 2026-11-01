import java.util.Scanner;

public class Graph_Implementation {
    int[][] graph;
    int[] visited;
    int vertices;

    void create_Graph(int nodes){
        Scanner sc = new Scanner(System.in);
        vertices = nodes;
        graph = new int[vertices][vertices];
        visited = new int[vertices];
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.println("Enter value for vertices " +i+"to vertices " + j+"999 for infinity" );
                graph[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(graph[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    void resetVisited(){
        for(int i=0;i<vertices;i++){
            visited[i] = 0;
        }
    }
    void DFS(int source){
        visited[source] = 1;
        System.out.println("v" + source);
        for(int i=0;i<vertices;i++){
            if(graph[source][i] == 1 && visited[i] !=1){
                DFS(i);
            }
        }
    }
    void BFS(int source){
        int[] queue = new int[vertices];
        int front=0;
        int rear = -1;
        visited[source] = 1;
        queue[++rear] = source;
        while(front<=rear){
            int element = queue[front++];
            System.out.print(element + " ");
            for(int i=0;i<vertices;i++){
                if(graph[element][i] ==1 && visited[i] != 1){
                    visited[i]=1;
                    queue[++rear] = i;
                }
            }
        }
    }
}
