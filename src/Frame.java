import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
     //SIZE
    public int width = 800;
     public int height = 600;

    public Frame(){
        ImageIcon image = new ImageIcon("C:\\java\\Calulator\\calc.jpg");
        JLabel label = new JLabel();
        label.setIcon(null);
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setIconImage(image.getImage());
        this.add(label);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
