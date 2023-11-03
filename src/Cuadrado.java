public class Cuadrado extends Figura{
    private double lado;

    public void calcularArea(){
        double area = lado * lado;
        setArea(area);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
