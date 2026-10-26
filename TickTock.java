import java.awt.event.*;
import javax.swing.*;

public class TickTock{
    public static void main(String[] args){
//        Create a timer that calls the ticker class at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();

//        Display a message box to prevent the program from ending immediately
        JOptionPane.showMessageDialog(null, "click OK to exit program.");
    }
}
//    event listener
    class Ticker implements ActionListener {
        private boolean tick = true;
        public void actionPerformed(ActionEvent event){
            if (tick){
                System.out.println("Tick...");
            } else {
                System.out.println("Tock...");
            }
            tick = !tick;
        }
    }
