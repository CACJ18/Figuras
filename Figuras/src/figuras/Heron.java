package figuras;
public class Heron {
    
    public float calcularLeyDeHeron(float a, float b, float c){
        float p = (a + b + c) /2;
        float resultado = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return resultado;
    }
}
