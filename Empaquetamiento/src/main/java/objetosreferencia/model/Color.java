package objetosreferencia.model;

/**
 * Clase que representa un color en el modelo RGB (Red, Green, Blue).
 * Cada componente de color puede tener un valor entre 0 y 255.
 */
public class Color {
    // Constantes para colores comunes
    public static final Color ROJO = new Color(255, 0, 0);
    public static final Color VERDE = new Color(0, 255, 0);
    public static final Color AZUL = new Color(0, 0, 255);
    public static final Color NEGRO = new Color(0, 0, 0);
    public static final Color BLANCO = new Color(255, 255, 255);

    // Atributos
    private int rojo;
    private int verde;
    private int azul;

    /**
     * Constructor que crea un color con los valores RGB especificados.
     * 
     * @param rojo Valor del componente rojo (0-255)
     * @param verde Valor del componente verde (0-255)
     * @param azul Valor del componente azul (0-255)
     * @throws IllegalArgumentException si algún valor está fuera del rango 0-255
     */
    public Color(int rojo, int verde, int azul) {
        setRojo(rojo);
        setVerde(verde);
        setAzul(azul);
    }

    // Getters y Setters con validación
    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        if (rojo < 0 || rojo > 255) {
            throw new IllegalArgumentException("El valor de rojo debe estar entre 0 y 255");
        }
        this.rojo = rojo;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        if (verde < 0 || verde > 255) {
            throw new IllegalArgumentException("El valor de verde debe estar entre 0 y 255");
        }
        this.verde = verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        if (azul < 0 || azul > 255) {
            throw new IllegalArgumentException("El valor de azul debe estar entre 0 y 255");
        }
        this.azul = azul;
    }

    /**
     * Devuelve la representación en hexadecimal del color.
     * @return String con el color en formato #RRGGBB
     */
    public String getHex() {
        return String.format("#%02X%02X%02X", rojo, verde, azul);
    }

    /**
     * Mezcla este color con otro color en la proporción especificada.
     * @param otroColor El color con el que mezclar
     * @param proporcion Proporción de mezcla (0.0 a 1.0)
     * @return Nuevo color resultante de la mezcla
     */
    public Color mezclar(Color otroColor, double proporcion) {
        if (proporcion < 0 || proporcion > 1) {
            throw new IllegalArgumentException("La proporción debe estar entre 0.0 y 1.0");
        }
        
        int r = (int) (this.rojo * (1 - proporcion) + otroColor.getRojo() * proporcion);
        int g = (int) (this.verde * (1 - proporcion) + otroColor.getVerde() * proporcion);
        int b = (int) (this.azul * (1 - proporcion) + otroColor.getAzul() * proporcion);
        
        return new Color(r, g, b);
    }

    @Override
    public String toString() {
        return String.format("Color[RGB=(%d, %d, %d), HEX=%s]", rojo, verde, azul, getHex());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Color color = (Color) obj;
        return rojo == color.rojo && 
               verde == color.verde && 
               azul == color.azul;
    }

    @Override
    public int hashCode() {
        return 31 * rojo + 17 * verde + azul;
    }
}
