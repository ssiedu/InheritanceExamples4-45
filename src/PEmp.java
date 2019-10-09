public class PEmp extends Emp {
    
    private int sal;
    private String desg;
    
    public void info(){
        super.info();
        System.out.println(sal+","+desg);
    }
    public PEmp(int a, String b, int c, String d){
        super(a,b);
        sal=c;
        desg=d;
    }
    
    public static void main(String args[]){
        PEmp e1=new PEmp(111,"AAA",50000,"SE");
        e1.info();
    }
}
