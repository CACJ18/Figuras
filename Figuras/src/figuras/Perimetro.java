package figuras;
public class Perimetro {
    
    public float calcularPerimetroCuadrado(float lado){
        float perimetro = 4 * lado;
        return perimetro;
    }
    
    public float calcularPerimetroTriangulo(float lado1, float lado2, float lado3){
        float perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    
    public float calcularPerimetroCirculo(float diametro){
        float perimetro = (float) (diametro * Math.PI); //Se castea, o sea se convierte a datos flotantes (d*pi)
        return perimetro;
    }
    
    public float calcularPerimetroRectangulo(float base, float altura){
        float perimetro = 2*base + 2*altura; 
        return perimetro;
    }
}
