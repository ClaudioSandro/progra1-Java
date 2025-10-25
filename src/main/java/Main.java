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

    public static void main(String[] args) {
        averageFunc(new Scanner(System.in));
    }
}
