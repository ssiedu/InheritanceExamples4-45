public class Emp {
    private int eno;
    private String ename;
    
    public Emp(){}
    public Emp(int a, String b){
        eno=a; 
        ename=b;
    }
    public void info(){
        System.out.println(eno+","+ename);
    }
}
