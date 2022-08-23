import java.awt.*;
import java.util.Random;

public class Fruit {

    private int x = 200;
    private int y = 200;
    private int width = 20;
    private int height = 20;
    private Rectangle rect = new Rectangle(this.x, this.y, this.width, this.height);

    Random r = new Random();

    Fruit(){
        setRandPos();
    }

    public void setRandPos(){

        this.x = r.nextInt(400);
        this.y = r.nextInt(400);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }
}
