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
    public static translate translate = new translate();
    public static JLabel label = new JLabel("0",SwingConstants.CENTER);

    
     //SIZE
    public int width = 200;
    public int height = 250;
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
        one.addActionListener(e -> {
            translate.calculate("1");
        });
        two.addActionListener(e -> {
            translate.calculate("2");
        });
        three.addActionListener(e -> {
            translate.calculate("3");
        });
        four.addActionListener(e -> {
            translate.calculate("4");
        });
        five.addActionListener(e -> {
            translate.calculate("5");
        });
        six.addActionListener(e -> {
            translate.calculate("6");
        });
        seven.addActionListener(e -> {
            translate.calculate("7");
        });
        eight.addActionListener(e -> {
            translate.calculate("8");
        });
        nine.addActionListener(e -> {
            translate.calculate("9");
        });
        zero.addActionListener(e -> {
            translate.calculate("0");
        });
        plus.addActionListener(e -> {
            translate.calculate("+");
        });
        minus.addActionListener(e -> {
            translate.calculate("-");
        });
        divide.addActionListener(e -> {
            translate.calculate("/");
        });
        multiply.addActionListener(e -> {
            translate.calculate("*");
        });
        equals.addActionListener(e -> {
            System.out.println(translate.ans());
            Frame.relabel();
        });


        
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
        double result = translate.ans();
        label.setText(String.valueOf(result));

    }


}
