public class Stud {
    private int rno;
    private String name;
    private final int PASSING_MARKS=33;
    
    public String toString(){
        return "DAVV Student ";
    }
    public final void result(int per){
        if(per>=PASSING_MARKS){
            System.out.println("STUDENT PASSED WITH "+per+" % ");
        }else{
            System.out.println("STUDENT FAILED WITH "+per+" % ");
        }
    }
    
    public void setBasicInfo(int a, String b){
        rno=a;
        name=b;
    }
    public void showBasicInfo(){
        System.out.println(rno+","+name);
    }
}
