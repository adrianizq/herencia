public class Circulo extends Figura{
    private double radio;
    public void verArea(){
        System.out.println("Area Circulo " + this.getArea());
    }

    public void calcularArea(){
        double area = 2*Math.PI * Math.pow(radio,2);
        this.setArea(area);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
