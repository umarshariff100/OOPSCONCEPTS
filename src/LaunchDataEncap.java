

class Book{
    
    private int page_no;
    public void setData(int x){
        if(x>0){
            page_no = x;
        }
        else{
            System.out.println("invalid input");
            System.exit(0);
        }
    }
    public int getData(){
        return page_no;
    }
}


public class LaunchDataEncap {
public static void main(String[] args){
    Book bo = new Book();
    bo.setData(0);
    System.out.println(bo.getData());
}    
}
