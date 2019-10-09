public class C extends A{
    public void m5(){
        System.out.println("hello from m5 of C");
    }
    public void m6(){
        System.out.println("hello from m6 of C");
    }
    public void test(){
        m1();
        m2();
        m5();
        m6();
    }
    public static void main(String args[]){
        C ob=new C();
        ob.test();
    }
            
    
}
