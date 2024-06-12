import java.awt.event.WindowAdapter;
import javax.swing.*;
import java.awt.FlowLayout;
import java.io.IOException;
import java.awt.Color;
import java.awt.Dimension;

public class Cycles extends WindowAdapter{
    JFrame f;
    // Method for starting the game
    public void play(String[] args) throws IOException{



        // Stores all the questions in an array
        String message = "How many kilometers are you going?";
        String title = "Cycles";
        String message1 = "How many kilometers per hour are you going?";
        String title1 = "Cycles";

        int guess = Integer.parseInt(JOptionPane.showInputDialog(message,title));
        int hour = Integer.parseInt(JOptionPane.showInputDialog(message1,title1));

        
        // Stores the correct answers in an array
        int answer = guess / hour * 60;
        int answer1 = answer / 86400;
        int night = answer1 - 1;

    {  
        ImageIcon img = new ImageIcon("src/imagery/crescent-moon-icon-isolated-on-transparent-background-free-png.png");




            if (answer1 < 1) {
                message = "the total amount of days you going are " + answer1;
            }
            else if(answer1 > 1){
                
            message = "the total amount of days you going are " + answer1;
            message1 = "the total amount of nights you going are " + night;
    
            }
        f=new JFrame();
        JFrame frame = new JFrame("Cycles");  
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        label.setText("<html><body width='%1s'><h1>Results</h1>"
        + "<p>" + message
        + "<p>" + message1);
        panel.add(label);   
        label.setVisible(true);
        frame.add(panel); 
        frame.pack();
        frame.setPreferredSize(new Dimension(1080, 480));
        frame.setVisible(true); 
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setIconImage(img.getImage());
        frame.add(new JLabel(new ImageIcon("src/imagery/crescent-moon-icon-isolated-on-transparent-background-free-png.png")));
        frame.getContentPane().setBackground(Color.BLUE);
    

        }
        {
        };
    }     

} 
    
