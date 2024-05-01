import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroAutomovilesApp app = new RegistroAutomovilesApp();
        app.iniciar();
    }
}

class RegistroAutomovil {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String numeroChasis;
    private String color;

    // Constructor
    public RegistroAutomovil(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    // Getters y Setters
    // Métodos para obtener y establecer los valores de los atributos
}

class RegistroAutomoviles {
    private List<RegistroAutomovil> registros;

    public RegistroAutomoviles() {
        registros = new ArrayList<>();
    }

    // Métodos para agregar, buscar y editar registros de automóviles
}

class RegistroAutomovilesApp {
    private Scanner scanner;
    private RegistroAutomoviles registro;

    public RegistroAutomovilesApp() {
        scanner = new Scanner(System.in);
        registro = new RegistroAutomoviles();
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    crearRegistro();
                    break;
                case 2:
                    buscarRegistro();
                    break;
                case 3:
                    editarRegistro();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa una opción válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("----- Menú Principal -----");
        System.out.println("1. Crear un nuevo registro");
        System.out.println("2. Buscar un registro");
        System.out.println("3. Editar un registro");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private void crearRegistro() {
        System.out.println("Ingrese los datos del nuevo registro:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Año: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Número de Chasis: ");
        String numeroChasis = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();

      
    }

    private void buscarRegistro() {
        System.out.print("Ingrese el ID del registro a buscar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        
    }

    private void editarRegistro() {
        System.out.print("Ingrese el ID del registro a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        
    }
}

