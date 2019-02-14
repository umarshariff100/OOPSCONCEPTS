public class LaunchStaaticSeg {
    public static void main(String[] args){
        
        Demo.disp1();
        Demo m= new Demo();
        
        m.disp2();
    }
    
}


class Demo{
    
      int x,y,z;
    {
        a=100;
        b=200;
        c=300;
        x=400;
        y=500;
        z=600;
    }
    static int a,b,c;
    static{
        a=10;
        b=20;
        c=30;    
   }
    static void disp1(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
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

