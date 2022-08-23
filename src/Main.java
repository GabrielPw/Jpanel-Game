import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentListener;

public class Main extends JPanel{


    Fruit fruit = new Fruit();
    Player player = new Player();

    Keyboard keyboard= new Keyboard();


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        g2.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());

        g2.setColor(Color.GREEN);
        g2.fillOval(fruit.getX(), fruit.getY(), fruit.getWidth(), fruit.getHeight());
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Teste");

        JFrame jf = new JFrame("Teste");
        Main g = new Main();

        jf.addKeyListener(g.keyboard);
        jf.add(g);
        jf.setSize(new Dimension(400, 400));
        jf.setVisible(true);

        boolean running = true;
        while (running){

            g.repaint();
            g.player.moveBall(g.keyboard);

            if (g.fruit.getRect().intersects(g.player.getRect())){
                g.fruit.setRandPos();
            }
            Thread.sleep(30);
        }
    }
}
