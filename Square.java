import java.awt.*;

public class Square {
    int xPos, yPos, size;
    String color;
    public Square(int xPos, int yPos, int size, String color) {
        xPos = this.xPos;
        yPos = this.yPos;
        size = this.size;
        color = this.color;
    }

    private Color colorChooser() {
        if (color == "green")
            return Color.GREEN;
        else if (color == "blue")
            return Color.BLUE;
        else
            return Color.WHITE;
    }

    public void paint(Graphics g) {
        g.setColor(colorChooser());
        g.fillRect(xPos,yPos,size,size);
    }
}
