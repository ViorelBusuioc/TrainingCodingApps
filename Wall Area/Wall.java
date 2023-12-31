public class Wall {
    private double width;
    private double height;

    public Wall() {
        this.width = width;
        this.height = height;
    }

    public Wall (double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width < 0) {
            setWidth(0);
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            setHeight(0);
        } else {
            this.height = height;
        }
    }

    public double getArea () {
        return width * height;
    }
}
