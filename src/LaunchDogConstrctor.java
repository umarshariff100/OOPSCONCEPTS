
class Dog1 {

    private String name;
    private String breed;
    private int cost;

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getCost(){
        return cost;
    }
    Dog1 (String name,String breed, int cost){
        this.name= name;
        this.breed = breed;
        this.cost = cost;
    }
    Dog1(){
        
    }
    
}







public class LaunchDogConstrctor {

    public static void main(String[] args) {
        Dog1 d1 = new Dog1("Lobo", "BullDog", 123);
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getCost());
        
        
        Dog1 d2 = new Dog1("Tomi", "BullDog", 123);
        System.out.println(d2.getName());
        System.out.println(d2.getBreed());
        System.out.println(d2.getCost());

    }

}
