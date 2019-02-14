
class Dog3   {
    private String name;
    private String breed;
    private int cost;
    
  public Dog3 (String name, String breed, int cost){
        name = name; \\Shadowing Problem
        breed= breed;  \\Shadowing Problem
        cost = cost;   \\Shadwing Problem 
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

public class LaunchEncapShadowProblem {
    public static void main(String[] args){
        Dog3 d = new Dog3("Lobo", "BullDOg", 50);
        System.out.println(d.getName());
        System.out.println(d.getBreed());
        System.out.println(d.getCost());
        
      
    }
}
