import java.util.Scanner;

public class Main {

    // Clear the screen
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Print Hello World!
    public static void helloWorld(){
        System.out.println("Hello world!");
    }

    // Print Hello World! and ask for name and age
    public static void beerWithUs(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name: ");
        String name = sc.nextLine();

        System.out.println("Write your age: ");
        int age = sc.nextInt();


        System.out.println("Hello " + name + ", your age is " + age);

        if (age >= 18){
            System.out.println("You can drink with us!");
        } else{
            System.out.println("You can't drink with us!, you are too young");
        }
    }

    // Ask for numbers and calculate the average
    public static void averageFunc(Scanner sc){
        clearScreen();
        System.out.println("Ok, let's start!");
        System.out.println("How many numbers do you want to divide?");
        int x = sc.nextInt();

        System.out.println("So give me " + x + " numbers:");

        float[] numbers = new float[x];

        for(int i = 0; i < x; i++){
            numbers[i] = sc.nextFloat();
        }

        float sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        float average = sum / numbers.length;

        System.out.println("The average is: " + average);

        System.out.println("Press enter to continue...");
        sc.nextLine();
        sc.nextLine();

    }

    // Mini menu with 2 options
    public static void miniMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, what's your name?");
        String username = sc.nextLine();

        int option;

        do{
            clearScreen();
            System.out.println("Hi, " + username + "!");
            System.out.println("What do you want to do today?\n");
            System.out.println("1. Calculate the average of a set of numbers");
            System.out.println("2. Exit\n");
            System.out.print("Choose an option: ");

            option = sc.nextInt();

            switch (option){
                case 1:
                    averageFunc(sc);
                    break;
                case 2:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Invalid option");
                    sc.nextLine();
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    break;
            }
        }while(option != 2);

        sc.close();
    }

    // Ask for number of employees and create an array of employees
    public static void inputTrabajadores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de trabajadores de tu empresa:");
        int x = sc.nextInt();
        sc.nextLine();

        Trabajador[] trabajadores = new Trabajador[x];


        for(int i=0; i<x; i++){
            clearScreen();
            System.out.println("Ingresa el nombre de cada trabajador:");
            System.out.println("Trabajador " + (i+1));

            System.out.println("nombre:");
            String nombre = sc.nextLine();

            System.out.println("edad:");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("carrera:");
            String carrera = sc.nextLine();

            System.out.println("empresa:");
            String empresa = sc.nextLine();

            System.out.println("salario:");
            double salario = sc.nextDouble();
            sc.nextLine();

            trabajadores[i] = new Trabajador(nombre, edad, carrera, empresa, salario);
        }

        for(int i=0; trabajadores.length > i; i++){
            trabajadores[i].saludar();
        }

        // podria tener un try y catch tmb
        System.out.println("Te gustaria seleccionar un trabajador en particular? (s/n)");
        String decision =  sc.nextLine();

        if(decision.equals("s")){
            try{
                clearScreen();
                System.out.println("Ingresa el numero del trabajador que deseas seleccionar:");
                int numTrabajador = sc.nextInt();
                sc.nextLine();

                System.out.println("Trabajador seleccionado: " + trabajadores[numTrabajador-1].nombre);
                trabajadores[numTrabajador-1].saludar();
            }catch(Exception e){
                System.out.println("Error: Seleccionaste un numero que no existe en el arreglo.");
            }
        } else{
            System.out.println("Adios!");
        }
    }

    public static void main(String[] args) {
        inputTrabajadores();
    }
}
