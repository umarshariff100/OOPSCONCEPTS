
class Dogg
        
{
    private final String name;
    private final String breed;
    private final int cost;
    
  public Dogg(String name, String breed, int cost){
        this.name = name;  
        this.breed= breed;  
        this.cost = cost;    
    }
  
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
       
    }
    public int getCost(){
        return cost;
    }
}

public class ShadowProblemResolved {
    public static void main(String[] args){
        Dogg d = new Dogg("Jobo", "BullDOg", 50);
        System.out.println(d.getName());
        System.out.println(d.getBreed());
        System.out.println(d.getCost());
        
      
    }
}
