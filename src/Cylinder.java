public class Cylinder extends Shape {

    int height;
    public void setHeight(int h){
        height=h;
    }
    public void computeArea() {
        area=(int)(2*3.14*radius*height);
    }
    
}
