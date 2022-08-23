import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {



        int key = e.getKeyCode();

        if(key == KeyEvent.VK_UP){
            up = true;
            down = false;
            left = false;
            right = false;
            System.out.println("UPP");
        }
        if(key == KeyEvent.VK_DOWN){
            up = false;
            down = true;
            left = false;
            right = false;
        }
        if(key == KeyEvent.VK_LEFT){
            up = false;
            down = false;
            left = true;
            right = false;
        }
        if(key == KeyEvent.VK_RIGHT){
            up = false;
            down = false;
            left = false;
            right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

