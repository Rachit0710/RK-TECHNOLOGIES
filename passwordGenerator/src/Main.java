import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main extends JFrame{

    // Main passwordGenerator;
     private generator generator ;

    JFrame frame = new JFrame();
    JButton btn = new JButton("GENERATE");
    JTextArea textArea = new JTextArea();
    Font font = new Font("Roboto",Font.BOLD,20);

     Main() {
     //gui();
        //passwordGenerator = new Main();


  // public void gui(){
         generator = new generator();

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,750);
        frame.setTitle("PASSWORD GENERATOR");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);



         frame.add(textArea);
      textArea.setBounds(700,200,400,50);
        textArea.setBorder(BorderFactory.createLineBorder(Color.cyan));
      textArea.setAlignmentX(SwingConstants.CENTER);
    //  textArea.setOpaque(true);
        textArea.setFont(font);
        textArea.setText("ENTER THE LENGTH OF PASSWORD");

        JLabel heading = new JLabel("PASSWORD GENERATOR");
        heading.setFont(font);
        heading.setBounds(500,20,400,50);
        frame.add(heading);
        heading.setForeground(Color.cyan);


        ImageIcon image = new ImageIcon("src/pwdgen.png");
        JLabel label = new JLabel(image);
        label.setBounds(20,200,500,300);
        frame.add(label);


       JTextField result = new JTextField();
       result.setBounds(700,400,400,50);
         result.setBorder(BorderFactory.createLineBorder(Color.cyan));
         result.setFont(font);
       frame.add(result);



         frame.add(btn);

         frame.setVisible(true);


         btn.setFont(new Font("Aerial",Font.BOLD,20));
         btn.setBackground(Color.black);
         btn.setForeground(Color.cyan);
         btn.setBounds(850,300,150,50);
         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(textArea.getText().length() <=0) return;

                 int passwordLength = Integer.parseInt(textArea.getText());
                 String generatedpassword = generator.Passwordgenerator(passwordLength);
                 result.setText(generatedpassword);
             }
         });

   }

    public static void main(String[] args) {
      new Main();

    }
}