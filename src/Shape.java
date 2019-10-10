
public abstract class Shape {
    int radius;
    int area;
    
    public abstract void computeArea();
    
    public final void setRadius(int r){
        radius=r;
    }
    public final void showArea(){
        System.out.println("Area : "+area);
    }
}
