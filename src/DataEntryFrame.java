
import java.awt.Color;
import java.awt.Frame;

public class DataEntryFrame extends Frame {
    
    public void showData(){
        System.out.println("hello");
    }
    
    public DataEntryFrame(){
        setBackground(Color.yellow);
        setTitle("SSI INDORE");
    }
    public static void main(String args[]){
        //DataEntryFrame ob=new DataEntryFrame();
        Frame ob=new Frame();
        //ob.showData();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
}
