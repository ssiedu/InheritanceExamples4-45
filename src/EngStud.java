public class EngStud extends Stud {
    private String branch;
    private int sem;
    
    public void setEngInfo(String a, int b){
        branch=a; sem=b;
    }
    public void showEngInfo(){
        System.out.println(branch+","+sem);
    }
    
}
