import java.util.*;
import java.util.Map.Entry;
public class adjList {
    private Map<Integer, List<Integer>> adjlist;
    adjList(){
        adjlist = new HashMap<>();
    }
    public void addvertex(int vertex){
        adjlist.putIfAbsent(vertex,new ArrayList<>());
    }
    public void addedge(int i, int j){
        addvertex(i);
        addvertex(j);
        adjlist.get(i).add(j);
        adjlist.get(j).add(i);        
    }
    // Depth First Search (DFS)
    public void DFS(int start){
        System.out.println();
        Stack <Integer> stack = new Stack<>();
        Set <Integer> visited  = new HashSet<>();
        
        stack.add(start);
        visited.add(start);
        System.out.print("DFS :");

        while(!stack.isEmpty()){
            int current = stack.pop();
            System.out.print(current+" ");

            for(int nighbour : adjlist.getOrDefault(current,Collections.emptyList())){
                if(!visited.contains(nighbour)){
                    visited.add(nighbour);
                    stack.add(nighbour);
                }
            }
        }
    }
    // Breadth First Search (BFS)
    public void BFS(int start){
        System.out.println();
        Queue <Integer> queue= new LinkedList<>();
        Set <Integer> visited  = new HashSet<>();

        queue.add(start);
        visited.add(start);
        System.out.print("BFS :");

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current+" ");

            for(int nighbour : adjlist.getOrDefault(current,Collections.emptyList())){
                if(!visited.contains(nighbour)){
                    visited.add(nighbour);
                    queue.add(nighbour);
                }
            }
        }
    }

    public void printgraph_adjList(){
        for(Entry<Integer, List<Integer>> entry : adjlist.entrySet()){
            System.out.print(entry.getKey() + " ->");
            for(Integer temp : entry.getValue()){
                System.out.print(temp+ ", ");
            }         
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        adjList graph = new adjList();
        graph.addedge(0, 1);
        graph.addedge(0, 2);
        graph.addedge(0, 3);
        graph.addedge(1, 4);
        graph.addedge(2, 4);
        graph.addedge(3, 4);
        graph.printgraph_adjList();
        // graph.DFS(0);
        // graph.BFS(0);
    }
}