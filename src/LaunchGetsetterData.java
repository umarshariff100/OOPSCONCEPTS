class Dog{
    private  String name;
    private  String breed;
    private  int Cost;
    
    public void setData(String x, String y, int z){
        name = x;
        breed = y;
        Cost = z;
    }
    
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    
    public int getCost(){
        return Cost;
    }
}

public class LaunchGetsetterData {
    public static void main(String[] args){
        Dog d = new Dog();
        d.setData("Lob0", "BullDog", 9999);
        System.out.println(d.getName());
        System.out.println(d.getBreed());
        System.out.println(d.getCost());
        
        
        
        Dog d1 = new Dog();
        d1.setData("TOMI", "BullDog", 9999);
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getCost());
       
          }
}
