import java.util.Scanner;

public class Main {

    // Print Hello World!
    public static void helloWorld(){
        System.out.println("Hello world!");
    }

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


    public static void main(String[] args) {
        helloWorld();
        beerWithUs();
    }
}
