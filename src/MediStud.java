public class MediStud extends Stud {
    private int profs;
    
    public String toString(){
        return "MGM Medical Student";
    }
    /*
    public void result(int per){
        if(per>=50){
            System.out.println("Medical Student Passed With "+per+" % ");
        }else{
            System.out.println("Medical Student Failed With "+per+" % ");
        }
    }
    */
    public void setMediInfo(int p){
        profs=p;
    }
    public void showMediInfo(){
        System.out.println(profs);
    }
}
