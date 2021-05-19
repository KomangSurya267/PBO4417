import java.awt.*;

public class TextFieldExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("TextFieldExample");
        TextField t1,t2;
        t1 = new TextField("Welcome to Javapoint");
        t1.setBounds(50,100,200,30);
        t2 = new TextField("AWT Tutorial");
        t2.setBounds(50,150,200,30);
        f.add(t1);f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
