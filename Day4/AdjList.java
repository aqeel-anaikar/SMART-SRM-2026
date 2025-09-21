import java.util.*;
public class AdjList {
    private Map <Integer, ArrayList<Integer>> adjlist;
    private int vertices;
    AdjList(int vertices){
        this.vertices = vertices;
        adjlist = new Map(vertices);
    }
}
