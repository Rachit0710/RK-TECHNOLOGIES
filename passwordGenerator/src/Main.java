import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
     private generator generator ;

    JFrame frame = new JFrame();
    JButton btn = new JButton("GENERATE");
    JTextArea textArea = new JTextArea();
    Font font = new Font("Roboto",Font.BOLD,20);

     Main() {

         generator = new generator();

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,750);
        frame.setTitle("PASSWORD GENERATOR");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);



    frame.add(textArea);
    textArea.setBounds(730, 200, 400, 50);
    textArea.setBorder(BorderFactory.createLineBorder(Color.cyan));
    textArea.setAlignmentX(SwingConstants.CENTER);
    textArea.setFont(font);
    textArea.setText("");



        JLabel heading = new JLabel("PASSWORD GENERATOR");
        heading.setFont(font);
        heading.setBounds(500,20,400,50);
        frame.add(heading);
        heading.setForeground(Color.cyan);



         JLabel heading1 = new JLabel("PASSWORD LENGTH :");
         heading1.setFont(font);
         heading1.setBounds(500,200,400,50);
         frame.add(heading1);
         heading1.setForeground(Color.cyan);

         JLabel heading2 = new JLabel("PASSWORD:");
         heading2.setFont(font);
         heading2.setBounds(560,400,400,50);
         frame.add(heading2);
         heading2.setForeground(Color.cyan);


        ImageIcon image = new ImageIcon("src/pwdgen.png");
        JLabel label = new JLabel(image);
        label.setBounds(20,200,500,300);
        frame.add(label);


    JTextField result = new JTextField();
    result.setBounds(730, 400, 400, 50);
    result.setBorder(BorderFactory.createLineBorder(Color.cyan));
    result.setFont(font);
    result.setEnabled(false);
    frame.add(result);



         frame.add(btn);
         btn.setFont(new Font("Aerial",Font.BOLD,20));
         btn.setBackground(Color.black);
         btn.setForeground(Color.cyan);
         btn.setBounds(850,300,150,50);
         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(textArea.getText().length() <=0) return;

                try {
                    int passwordLength = Integer.parseInt(textArea.getText());
                 String generatedpassword = generator.Passwordgenerator(passwordLength);
                 result.setText(generatedpassword);
                } catch(Exception l){
                JOptionPane.showMessageDialog(null,"Enter the Numeric value");
                }
             }
         });

         JButton btn1 = new JButton();
         btn1.setBounds(1139,400,400,50);
        // btn1.setFont(new Font("Aerial",Font.BOLD,10));
         btn1.setSize(30,50);
         ImageIcon copyIcon = new ImageIcon("src/copy.png");
         btn1.setIcon(copyIcon);
         btn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            String s = result.getText();
                 Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                 StringSelection sel = new StringSelection(s);
                 clip.setContents(sel,null);
                 JOptionPane.showMessageDialog(null,"THE PASSWORD IS COPIED.");
             }
         });
         frame.add(btn1);

         frame.setVisible(true);
     }







    public static void main(String[] args) {
      new Main();

    }
}