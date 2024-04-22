import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame extends JFrame{
     //SIZE
    public int width = 200;
    public int height = 250;
    JLabel label = new JLabel("0",SwingConstants.CENTER);
    KeyInputs inputs = new KeyInputs();
    JPanel panel = new JPanel();
    public Frame(){
        panel.setLayout(new FlowLayout());
        //label buttons
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton zero = new JButton("0");
        JButton equals = new JButton("=");
        //add button effects


        
        this.add(label,BorderLayout.PAGE_START);
        this.add(panel);
        panel.add(one);
        panel.add(two);
        panel.add(three);
            panel.add(plus);
        panel.add(four);
        panel.add(five);
        panel.add(six);
            panel.add(minus);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
            panel.add(divide);
            panel.add(equals);
        panel.add(zero);
        panel.add(multiply);



        ImageIcon image = new ImageIcon("C:\\java\\Calculator\\calc.jpg");
        label.setIcon(null);
        this.addKeyListener(inputs);
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setIconImage(image.getImage());
        relabel();
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void relabel() {
        //label.setText(KeyInputs.ans);
        System.out.println(KeyInputs.ans);
    }

    public static void calculate() {
        // turn string to math equation and calculate
        int equation = 0;
        System.out.println(equation);
    }
}
