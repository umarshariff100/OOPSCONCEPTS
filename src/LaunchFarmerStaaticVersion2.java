
import java.util.Scanner;



class Farmerr{
    private float p;
    private float t;
    private static final float r;
    private float si;
    
    
    static{
        r=2.5f;
        }
    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        p=scan.nextFloat();
        System.out.println("Enter the Time Duration");
        t=scan.nextFloat();
        
    }
    public void compute(){
        si= (p*t*r)/100 ;
    }
    public void disp(){
        System.out.println(si);
    }
    
}

public class LaunchFarmerStaaticVersion2 {
    public static void main(String[] args){
        Farmerr f1 = new Farmerr();
        Farmerr f2 = new Farmerr();
        Farmerr f3 = new Farmerr();
        
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

