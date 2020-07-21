package exercicio02;

public class Triangulo {

    private double baseTriangulo;
    private double alturaTriangulo;

    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public double area() {
        return (this.baseTriangulo * this.alturaTriangulo) / 2;
    }
}
