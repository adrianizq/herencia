public class Figura {
 private Color color;
 private double area;
 public void verArea(){
     System.out.println("El area de la Figura " + area);
 }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Figura() {
        this.color=Color.NEGRO;
        this.area=0;
    }
    public Figura(Color color, double area) {
        this.color = color;
        this.area = area;
    }


}
