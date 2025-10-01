package objetosreferencia;

import objetosreferencia.model.Color;

public class Main {
    public static void main(String[] args) {
        // Crear colores personalizados
        Color rojo = new Color(255, 0, 0);
        Color azul = new Color(0, 0, 255);
        
        // Usar colores predefinidos
        System.out.println("Colores predefinidos:");
        System.out.println("Rojo: " + Color.ROJO);
        System.out.println("Verde: " + Color.VERDE);
        System.out.println("Azul: " + Color.AZUL);
        
        // Mostrar información de colores personalizados
        System.out.println("\nColores personalizados:");
        System.out.println("Mi rojo: " + rojo);
        System.out.println("Mi azul: " + azul);
        
        // Mezclar colores
        Color morado = rojo.mezclar(azul, 0.5);
        System.out.println("\nMezclando rojo y azul al 50%: " + morado);
        
        // Obtener código hexadecimal
        System.out.println("Código hexadecimal del morado: " + morado.getHex());
        
        // Probar igualdad de colores
        Color otroRojo = new Color(255, 0, 0);
        System.out.println("\nComparación de colores:");
        System.out.println("rojo.equals(otroRojo): " + rojo.equals(otroRojo));
        System.out.println("rojo.equals(azul): " + rojo.equals(azul));
    }
}
