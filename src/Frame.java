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
    static String equation = "";
    
     //SIZE
    public int width = 200;
    public int height = 200;
    //KeyInputs inputs = new KeyInputs();
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
            equation("1");
            label.setText(equation);
        });
        two.addActionListener(e -> {
            translate.calculate("2");
            equation("2");
            label.setText(equation);
        });
        three.addActionListener(e -> {
            translate.calculate("3");
            equation("3");
            label.setText(equation);
        });
        four.addActionListener(e -> {
            translate.calculate("4");
            equation("4");
            label.setText(equation);

        });
        five.addActionListener(e -> {
            translate.calculate("5");
            equation("5");
            label.setText(equation);
        });
        six.addActionListener(e -> {
            translate.calculate("6");
            equation("6");
            label.setText(equation);
        });
        seven.addActionListener(e -> {
            translate.calculate("7");
            equation("7");
            label.setText(equation);
        });
        eight.addActionListener(e -> {
            translate.calculate("8");
            equation("8");
            label.setText(equation);
        });
        nine.addActionListener(e -> {
            translate.calculate("9");
            equation("9");
            label.setText(equation);
        });
        zero.addActionListener(e -> {
            translate.calculate("0");
            equation("0");
            label.setText(equation);
        });
        plus.addActionListener(e -> {
            translate.calculate("+");
            equation("+");
            label.setText(equation);
        });
        minus.addActionListener(e -> {
            translate.calculate("-");
            equation("-");
            label.setText(equation);
        });
        divide.addActionListener(e -> {
            translate.calculate("/");
            equation("/");
            label.setText(equation);
        });
        multiply.addActionListener(e -> {
            translate.calculate("*");
            equation("*");
            label.setText(equation);
        });
        equals.addActionListener(e -> {
            equation("= ");
            label.setText(equation+translate.ans());
            equation="";
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



        ImageIcon image = new ImageIcon("C:\\coding\\java\\Calculator\\calc.jpg");
        label.setIcon(null);
        //this.addKeyListener(inputs);
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("C");
        this.setIconImage(image.getImage());
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void equation(String x){
        equation += x;
    }


}
