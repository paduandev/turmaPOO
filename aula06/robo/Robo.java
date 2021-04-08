package robo;

public class Robo {
    private int x, y;
    private int maxX, maxY;

    public Robo(int x, int y, int maxX, int maxY) {
        if (maxX > 0) {
            this.maxX = maxX;
        } else {
            this.maxX = 10;
        }
        if (maxY > 0) {
            this.maxY = maxY;
        } else {
            this.maxY = 10;
        }
        if (Math.abs(x) <= this.maxX) {
            this.x = x;
        }
        if (Math.abs(y) <= this.maxY) {
            this.y = y;
        }
    }

    public void moverNorte() {
        if (y < maxY) {
            y++;
        }
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }

}
