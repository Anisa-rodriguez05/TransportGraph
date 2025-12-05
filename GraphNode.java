package javafoundations;


/**
 * Represents a location in the transportation network.
 * Each node has a name and a type
 * "D" for distribution center, "H" for hospital, "House" for intermediate nodes
 */
public class GraphNode
{
    private String name;
    private String type;
    
    /**
     * @param name the unique name of the node (eh. "D1")
     * @return type the type of node ("D", "H", or "House")
     */
    public GraphNode(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    /**
     * @return the node's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * @return the node's type
     */
    public String getType(){
        return type;
    }
    
    public String toString(){
        return name + "(" + type + ")";
    }
}