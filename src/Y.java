public class Y extends X {
    public Y(){
        super(10);
        System.out.println("Y-0-1");
        System.out.println("Y-0-2");
    }
    public Y(int p){
        super(1,2);
        System.out.println("Y-1-1");
        System.out.println("Y-1-2");
    }
    public Y(int p, int q){
        super(5);
        System.out.println("Y-2-1");
        System.out.println("Y-2-2");
    }
    public static void main(String args[]){
        
        Y ob=new Y(5,6);
        
    }
}
