import java.awt.event.WindowAdapter;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Cycles extends WindowAdapter{
    JFrame f;
    // Method for starting the game
    public void play(String[] args) throws IOException{

        File file = new File("c:\\Users\\342744547\\Downloads\\crescent-moon-icon-isolated-on-transparent-background-free-png.png");
        BufferedImage bufferedImage = ImageIO.read(file);

        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        
        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            



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

        JFrame f;
    {  
        ImageIcon img = new ImageIcon("src/imagery/crescent-moon-icon-isolated-on-transparent-background-free-png.png");
        f=new JFrame();   
        f.setSize(1280, 720);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setIconImage(img.getImage());
        f.add(new JLabel(new ImageIcon("src/imagery/crescent-moon-icon-isolated-on-transparent-background-free-png.png")));


            if (answer1 < 1) {
                message = "the total amount of days you going are " + answer1;
            }
            else if(answer1 > 1){
                
            message = "the total amount of days you going are " + answer1;
            message1 = "the total amount of nights you going are " + night;
    
            }


            JOptionPane.showMessageDialog(null,message);
            JOptionPane.showMessageDialog(null,message1);

                
        }
        {
        };
    }     

} 
    