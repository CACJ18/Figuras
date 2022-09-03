package figuras;
public class Areas {
    
    public float calcularAreaCuadrado(float lado){
        float area = (float) Math.pow(lado, 2);
        return area;
    }
    
    public float calcularAreaCirculo(float radio){
        float area = (float) (Math.PI * (Math.pow(radio, 2)));
        return area;
    }
    
    public float calcularAreaTriangulo(float base, float altura){
        float area = (base * altura)/2;
        return area;
    }
    
    public float calcularAreaRectangulo(float base, float altura){
        float area = base * altura;
        return area;
    }
}
