public class B extends A{
    
    int data=200;

/*    
    public void message(){
        System.out.println("hello message from B");
    }
  */  
    public void display(){
        message();
        super.message();
//        int data=300;
//        System.out.println(data);//local
//        System.out.println(this.data);//data instance
//        System.out.println(super.data);//data of parent
        
    }
    public void m1(){
        System.out.println("hello from m1 of B");
        
    }
    public void m3(){
        System.out.println("hello from m3 of B");
    }
    public void m4(){
        System.out.println("hello from m4 of B");
    }
    
    
    public static void main(String argrs[]){
        B ob=new B();
        ob.display();
//        ob.m1();
//        ob.m2();
//        ob.m3();
//        ob.m4();
    }
            
}
