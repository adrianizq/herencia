public class Triangulo extends Figura{
    private double base;
    private double altura;
    public void verArea(){
        System.out.println("Area del Triangulo: " + getArea());
    }
    public void calcularArea(){
        double area = base * altura /2.0;
        setArea(area);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
