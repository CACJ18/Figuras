package figuras;

import java.util.Scanner;

public class Figuras {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        Perimetro perimetros = new Perimetro();
        Areas areas = new Areas();
        Heron heron = new Heron();
        
        int opcion = 0;
        
        while (opcion != 4) {   
            System.out.print("\n---------------------------------------------");
            System.out.println("\n\tMENÚ.");
            System.out.println("1. Áreas.");
            System.out.println("2. Perimetros.");
            System.out.println("3. Ley de Heron.");
            System.out.println("4. Salir.");
            System.out.print("Digite una opción: ");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("\n\tMENÚ DE ÁREAS.");
                    System.out.println("1. Área del Cuadrado.");
                    System.out.println("2. Área del Circulo.");
                    System.out.println("3. Área del Triángulo.");
                    System.out.println("4. Área del Rectangulo.");
                    System.out.print("Digite una opción: ");
                    int eleccionArea = teclado.nextInt();
                    
                    switch(eleccionArea){
                        case 1:
                            System.out.print("\nDigite un Lado: ");
                            float lado = teclado.nextFloat();
                            
                            float areaCuadrado = areas.calcularAreaCuadrado(lado);
                            System.out.println("\nEl Área del Cuadrado es: " + areaCuadrado);
                            
                            break;
                            
                        case 2:
                            System.out.print("\nDigite el Radio: ");
                            float radio = teclado.nextFloat();
                            
                            float areaCirculo = areas.calcularAreaCirculo(radio);
                            System.out.println("\nEl Área del Circulo es: " + areaCirculo);
                            
                            break;
                            
                        case 3:
                            System.out.println("\nDigite la Base: ");
                            float base = teclado.nextFloat();
                            System.out.println("Digite la Altura: ");
                            float altura = teclado.nextFloat();
                            
                            float areaTriangulo = areas.calcularAreaTriangulo(base, altura);
                            System.out.println("\nEl Área del Triangulo es: " + areaTriangulo);
                            
                            break;
                            
                        case 4:
                            System.out.println("\nDigite la Base: ");
                            float base1 = teclado.nextFloat();
                            System.out.println("Digite la Altura: ");
                            float altura1 = teclado.nextFloat();
                            
                            float areaRectangulo = areas.calcularAreaRectangulo(base1, altura1);
                            System.out.println("\nEl Área del Rectangulo es: " + areaRectangulo);
                            
                            break;
                            
                        default:
                            System.out.println("La opción no existe, vuelva a digitar: ");
                            break;
                    }
                    break;
                    
                case 2: 
                    System.out.println("\n\tMENÚ DE PERIMETROS.");
                    System.out.println("1. Perimetro del Cuadrado.");
                    System.out.println("2. Perimetro del Triangulo.");
                    System.out.println("3. Perimetro del Circulo.");
                    System.out.println("4. Perimetro del Rectangulo.");
                    System.out.print("Digite una opción: ");
                    int eleccionPerimetro = teclado.nextInt();
                    
                    switch(eleccionPerimetro){
                        case 1:
                            System.out.println("\nDigite un Lado: ");
                            float lado = teclado.nextFloat();
                            
                            float perimetroCuadrado = perimetros.calcularPerimetroCuadrado(lado);
                            System.out.println("\nEl Perimetro del Cuadrado es: " + perimetroCuadrado);
                            break;
                            
                        case 2:
                            System.out.print("\nDigite el Primer Lado: ");
                            float lado1 = teclado.nextFloat();
                            System.out.print("\nDigite el Segundo Lado: ");
                            float lado2 = teclado.nextFloat();
                            System.out.print("\nDigite el Tercer Lado: ");
                            float lado3 = teclado.nextFloat();
                            
                            float perimetroTriangulo = perimetros.calcularPerimetroTriangulo(lado1, lado2, lado3);
                            System.out.println("\nEl Perimetro del Triangulo es: " + perimetroTriangulo);
                            
                            break;
                            
                        case 3: 
                            System.out.print("\nDigite el Diametro: ");
                            float diametro = teclado.nextFloat();
                            
                            float perimetroCirculo = perimetros.calcularPerimetroCirculo(diametro);
                            System.out.println("\nEl Perimetro del Circulo es: " + perimetroCirculo);
                            
                            break;
                            
                        case 4:
                            System.out.println("\nDigite la Base: ");
                            float base = teclado.nextFloat();
                            System.out.println("Digite la Altura: ");
                            float altura = teclado.nextFloat();
                            
                            float perimetroRectangulo = perimetros.calcularPerimetroRectangulo(base, altura);
                            System.out.println("\nEl Perimetro del Rectangulo es: " + perimetroRectangulo);
                            
                            break;
                        
                        default:
                            System.out.println("La opción no existe, vuelva a digitar: ");
                            break;
                    }
                    break;
                    
                case 3:
                    System.out.println("\nDigite el Primer Lado: ");
                    float lado1 = teclado.nextFloat();
                    System.out.println("Digite el Segundo Lado: ");
                    float lado2 = teclado.nextFloat();
                    System.out.println("Digite el Tercer Lado: ");
                    float lado3 = teclado.nextFloat();
                            
                    float leyDeHeron = heron.calcularLeyDeHeron(lado1, lado2, lado3);
                    System.out.println("\nLa Ley de Heron es: " + leyDeHeron);
                    
                    break;
                    
                case 4:
                    opcion = 4;
                    System.out.println("\t¡¡¡Gracias por participar!!!");
                    break;
                    
                default:
                    System.out.println("\nOpción no disponible.");
                    break;
            }
        }
    }
}