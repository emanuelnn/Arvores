public class Tree {

    private int Height;
    private int Width;
    private String Color;
    private String Type;

    private static int counter;
    public Tree(int Height, int Width, String Color, String Type) {
        this.Height = Height;
        this.Width = Width;
        this.Color = Color;
        this.Type = Type;
        counter++;
        System.out.println(counter);
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }


    @Override
    public String toString() {
        return "Tree (Height:" + Height + ", Width:" + Width + ", Color: " + Color +", Type:" + Type + ");";
    }
}
