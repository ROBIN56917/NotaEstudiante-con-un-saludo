package umanizales.edu.co;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de 3 vehículos
        Vehiculo[] vehiculos = new Vehiculo[3];
        
        // Inicializar los vehículos usando el constructor
        vehiculos[0] = new Vehiculo("Toyota", "Corolla", 2022, "Sedán");
        vehiculos[1] = new Vehiculo("Ford", "Ranger", 2023, "Camioneta");
        vehiculos[2] = new Vehiculo("Honda", "CBR600RR", 2023, "Moto");
        
        // Recorrer el arreglo usando for-each
        System.out.println("=== Lista de Vehículos ===");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnio());
            System.out.println("Tipo: " + vehiculo.getTipo());
            System.out.println("----------------------------");
        }
        
        // También podemos usar el método toString() que sobreescribimos
        System.out.println("\n=== Lista usando toString() ===");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
