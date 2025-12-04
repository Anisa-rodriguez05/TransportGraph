
/**
 * Write a description of class location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private int x;
    public String name;
    public String locationType;
    public String ID;
    /**
     * Constructor for objects of class location
     */
    public Location()
    {
        // initialise instance variables
        name = "";
        locationType = "";
        ID = ""; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getID()
    {
        // put your code here
        return ID;
    }
    
    public String getName(){
        return name; 
    }
    
    //possibly might get rid of, maybe dont want client changing locationtype 
    public void setLocationType(){ 
        this.locationType = locationType;   
    }    
    
    public String getLocationType(){
        return locationType;
    }
}
