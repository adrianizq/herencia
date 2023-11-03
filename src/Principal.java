public class Principal {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        figura1.setColor(Color.AZUL);
        //crear un objeto de tipo Cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setColor(Color.AMARILLO);
        cuadrado1.setLado(7.0);
        cuadrado1.calcularArea();
        cuadrado1.verArea();

        //Crear un Triangulo
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setColor(Color.NEGRO);
        triangulo1.setBase(6.0);
        triangulo1.setAltura(7.0);
        triangulo1.calcularArea();
        triangulo1.verArea();

        //Crear un Circulo
        Circulo circulo1 = new Circulo();
        circulo1.setColor(Color.ROJO);
        circulo1.setRadio(8.5);
        circulo1.calcularArea();
        circulo1.verArea();

    }
}