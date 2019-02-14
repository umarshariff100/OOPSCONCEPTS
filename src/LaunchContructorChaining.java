class Dog10 {
    
    private String name;
    private String breed;
    private int Cost;
    
    public String getName(){
    
    return name;
}
    public String getBreed(){
    return breed;
}
    public int getCost(){
    return Cost;
}
    Dog10(String name, String breed, int cost){
        this(name);
    }
    Dog10(String name){
        this.name = name;
        breed = "Mastiff";
        Cost = 7777;
    }
    
    Dog10(){
        name = "Cyrus";
        breed = "German Sheperd";
        Cost = 1234 ;
    
}
}


public class LaunchContructorChaining {
    public static void main(String args[]){
        Dog10 d1 = new Dog10 ("Lobo","BullDog", 1000);
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getCost());
           
    }
}
