public class Adjmat {
    private int adjmat[][];
    private int vertices;

    Adjmat(int vertices){
        this.vertices = vertices;
        this.adjmat = new int[vertices][vertices];
    }

    public void addedge(int i, int j){
        adjmat[i][j] = 1;
        adjmat[j][i] = 1;
    }

    public boolean hasedge(int i , int j){
        return adjmat[i][j]==1;
    }

    public void printgraph(){
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjmat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Adjmat graph = new Adjmat(7);
        graph.addedge(1, 2);
        graph.addedge(1, 3);
        graph.addedge(2, 4);
        graph.addedge(3, 4);
        graph.addedge(5, 4);
        graph.addedge(5, 6);
        graph.printgraph();
        System.out.println(graph.hasedge(1,2));
    }

}
