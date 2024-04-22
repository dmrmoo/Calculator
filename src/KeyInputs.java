import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyInputs implements KeyListener{
    /* 
     * Frame frame = new Frame();
    */
    public static String ans = "";
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_0:
                ans+="0";
                Frame.relabel();
                break;
            case KeyEvent.VK_1:
                ans+="1";
                Frame.relabel();
                break;
            case KeyEvent.VK_2:
                ans+="2";
                Frame.relabel();
                break;
            case KeyEvent.VK_3:
                ans+="3";
                Frame.relabel();
                break;
            case KeyEvent.VK_4:
                ans+="4";
                Frame.relabel();
                break;
            case KeyEvent.VK_5:
                ans+="5";
                Frame.relabel();
                break;
            case KeyEvent.VK_6:
                ans+="6";                Frame.relabel();
                break;
            case KeyEvent.VK_7:
                ans+="7";
                Frame.relabel();
                break;
            case KeyEvent.VK_8:
                ans+="8";
                Frame.relabel();
                break;
            case KeyEvent.VK_9:
                ans+="9";
                Frame.relabel();
                break;
            case KeyEvent.VK_PLUS:
                ans+="+";
                Frame.relabel();
                break;
            case KeyEvent.VK_MINUS:
                ans+="-";
                Frame.relabel();
                break;
            case KeyEvent.VK_SLASH:
                ans+="/";
                Frame.relabel();
                break;
            case KeyEvent.VK_ASTERISK:
                ans+="*";
                Frame.relabel();
                break;
            case KeyEvent.VK_EQUALS:
                Frame.calculate();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

        }

}