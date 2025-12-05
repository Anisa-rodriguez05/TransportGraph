package javafoundations;


/**
 * Edge represents a directed connection in the graph from one node to another
 * For unweighted shortest-path problems, the weight can be set to 1
 */
public class Edge
{
    private GraphNode to;
    
    /**
     * param to the destination GraphNode this edge connects to
     */
    public Edge(GraphNode to){
        this.to = to;
    }
    
    /**
     * @return a redable representation of the edge
     */
    public String toString(){
        return "-->" + to.getName();
    }
}