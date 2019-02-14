
import java.util.Scanner;

class Farmer{
    private float p;
    private float t;
    private float r;
    private float si;
    
    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        p=scan.nextFloat();
        System.out.println("Enter the Time Duration");
        t=scan.nextFloat();
        r=2.5f;
    }
    public void compute(){
        si= (p*t*r)/100 ;
    }
    public void disp(){
        System.out.println(si);
    }
    
}

public class LaunchFarmerStaatic {
    public static void main(String[] args){
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();
        
        f1.acceptInput();
        f1.compute();
        f1.disp();
        
        f2.acceptInput();
        f2.compute();
        f2.disp();
        
        f3.acceptInput();
        f3.compute();
        f3.disp();
        
    }
}
