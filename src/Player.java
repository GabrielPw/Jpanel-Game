import java.awt.*;
import java.util.Random;

public class Player {
    private int x = 100;
    private int y = 100;
    int speed = 3;
    private int width = 20;
    private int height = 20;
    private Rectangle rect = new Rectangle(this.x, this.y, this.width, this.height);


    public void moveBall(Keyboard keyboard){

        if (keyboard.up){
            y -= speed;
        }

        if (keyboard.down){
            y += speed;
        }

        if (keyboard.left){
            x -= speed;
        }

        if (keyboard.right){
            x += speed;
        }
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
