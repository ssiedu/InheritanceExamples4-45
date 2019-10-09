public class University {
    public static void main(String[] args) {
        
        EngStud s1=new EngStud();
        s1.setBasicInfo(111, "AAA");
        s1.setEngInfo("CS", 4);
        s1.showBasicInfo();
        s1.showEngInfo();
        s1.result(45);
        System.out.println("__________________________");
        MediStud s2=new MediStud();
        s2.setBasicInfo(112, "BBB");
        s2.setMediInfo(2);
        s2.showBasicInfo();
        s2.showMediInfo();
        s2.result(48);
        String res=s2.toString();
        System.out.println(res);
    }
}
