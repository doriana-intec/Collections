package be.intecbrussel.comparator_comparable;

public class Box  implements Comparable<Box>{

    private int length;
    private int height;
    private int width;

    public Box() {
    this(0,0,0);
    }

    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getVolume(){
        return height * width * length;
    }

    @Override
    public int compareTo(Box obj) {
        return this.getVolume() - obj.getVolume();
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
