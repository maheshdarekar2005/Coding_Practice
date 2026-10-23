import java.util.Scanner;

public class Graph {
    int[][]  graph;  // declared the graph using 2d array
    int[] visited;   // declared the visited array to get the visited nodes
    int vertices;    // declared the vertices before only so we could access it for every method

    /**
     * Creation of the Graph
     * @param node
     */
    void create_Graph(int node){
        vertices = node;      
        Scanner sc = new Scanner(System.in);
        graph = new int[vertices][vertices];  // initialized the graph using vertices
        visited = new int[vertices];          // initialized the visited array using vertices
        // now we will traverse till the vertices i.e. from source till destination using nested for loops

        for(int i = 0; i < vertices;i++){// we are starting from the source
            for(int j = 0; j< vertices;j++){// we are going till the destination from the source
                System.out.println("Enter the value for the vertices " + i + " to the vertices " + j + " (Enter 999 for infinity)");
                graph[i][j] = sc.nextInt();
            }    
        }
    }

    /**
     * Graph printing
     */
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j =0;j<vertices;j++){
                System.out.print(graph[i][j]);
            }
            System.out.println(); // for new line only
        }
    }

    // Now we also need to implement the reset the visited array as we want to further call the BFS and DFS methods several times
    // So reseting is important

    /**
     * Reset Visited array
     */
    void resetVisited(){
        for(int i=0;i<vertices;i++){
           visited[i] = 0;        // if not visited then 0 and if visited then it is 1
        }
    }

    /**
     * BFS Traversal using the queue data structure
     */
    void getBFS(int source){
        int queue[] = new int[vertices];  // created the queue as array with the same size as of the vertices 
        int front = 0, rear = -1;         // declared the front at 0th index and rear at -1th index [queue property] 
        visited[source] = 1;              // the element becomes visited
        queue[++rear] = source;           // here we enqueued the element into the queue

        while(front <= rear){             // here we will traverse untill our queue gets empty
            int element = queue[front++]; // here we popped the element from the queue and in next we will print that element
            System.out.print("V" + element + "-");  // here we print the  complete BFS sequence
            /**
             * for checking the neighbouring and visited condition we again need to iterate using the for loop
             * from i = 0 till the vertices 
             * and in the we check the condition of visited[i] != 0 and graph[element][i] == 1
             */

            for(int i=0;i<vertices;i++){
                if(graph[element][i] == 1 && visited[i] != 1){
                    visited[i] = 1;       // if the visited of i is not visited then make it visited
                    queue[++rear] = i;    // here we again the enqueing the array or the queue if the condition is matched
                }
            }
        }
        System.out.println(); // for new line only
    }

    /**
     * DFS Traversal using the stack data structure
     * Here the stack is used internally (by using recursion)
     */
    void getDFS(int source){
        visited[source] = 1;              // here we directly giving the visited for the unvisited element
        System.out.print("V" + source + "-");
        /**
         * Now we will traverse through the vertices from i=0
         * and we will check the condition of the following =
         * if the graph of the i,j == 1 and the visited[i] != 1
         * if it is true then call the recursive function of the getDFS(i);
         * This is the most important part of the program as the recursive call is bit complex to understand at first
         */

        for(int i = 0; i<vertices;i++){
            if(graph[source][i] == 1 && visited[i] != 1){
                getDFS(i);     // here we called the recursion function
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.create_Graph(2);
        graph.printGraph();
        graph.resetVisited();
        System.out.println("BFS Of the Graph is = ");
        graph.getBFS(0);
        graph.resetVisited();
        System.out.println("DFS Of the Graph is = ");
        graph.getDFS(0);
        graph.resetVisited();
    }
}
