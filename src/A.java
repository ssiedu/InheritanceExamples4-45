public  class A {
    
    int data=100;
    
    public void message(){
        System.out.println("hello message from A");
    }
    
    public static void main(String args[]){
        show(10);
    }
            
    public static void show(final int p){
        System.out.println(p);//read
    
        System.out.println(p);//read
    }
    public void m1(){
        System.out.println("hello from m1 of A");
    }
    public void m2(){
        System.out.println("hello from m2 of A");
    }
}
