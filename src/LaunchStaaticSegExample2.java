class Demoo{
    static int a,b,c,d,e,f;
    static{
        a=10;
        b=20;
        c=30;    
        d=40;
        e=50;
        f=60;
    
   }
    static void disp1(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);    
}
    int x,y,z;
    {
        a=100;
        b=200;
        c=300;
        x=400;
        y=500;
        z=600;
    }
    void disp2(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
}
}
public class LaunchStaaticSegExample2 {
    public static void main(String[] args){
        
        Demoo.disp1();
        Demoo m= new Demoo();
        
        m.disp2();
    }
    
}


