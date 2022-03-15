import java.util.Scanner;

public class RleProgram {
    public static void main(String[] args) {
        //1. Display welcome message
        System.out.println("Welcome to the RLE image encoder!");

        //2. Display color test with the message
        System.out.println("Displaying Spectrum Image:");
        ConsoleGfx.displayImage(ConsoleGfx.testRainbow);

        Scanner scanner = new Scanner(System.in);     //callingScanner

        byte[] imageData = null; // int playerHand = 0;
        int option = 1; // initialize option
        while (option > 0){


        //3. Display the menu = Part A: while loop or if-else chains
        System.out.println("RLE Menu");
        System.out.println("--------");
        System.out.println("0. Exit");
        System.out.println("1. Load File");
        System.out.println("2. Load Test Image");
        System.out.println("3. Read RLE String");
        System.out.println("4. Read RLE Hex String");
        System.out.println("5. Read Data Hex String");
        System.out.println("6. Display Image");
        System.out.println("7. Display RLE String");
        System.out.println("8. Display Hex RLE Data");
        System.out.println("9. Display Hex Flat Data");

        System.out.print("Select a Menu Option: ");
        option = scanner.nextInt(); //input new option int


        if (option == 1) {
            //3.1 - option 1
            //load file using ConsoleGfx.loadFile(userInput) and you want to store the return byte[] into imageData
            System.out.print("Enter name of file to load: ");
            String userInput = scanner.next(); //input file
            byte[] testImage = ConsoleGfx.loadFile(userInput);
            continue;
        } else if (option == 2) {
            //3.2 - option 2
            //store ConsoleGfx.testImage to the imageData array
            //ConsoleGfx.testImage


        } else if (option == 6) {
            //3.6 - option 6
            //display image stored inside of imageData array
            ConsoleGfx.displayImage(ConsoleGfx.testImage);
        }else{
            System.out.println("Error! Invalid input.");

        }
            //user might first enter 1->6 or 2->6

            //complete all the other options later in project 2B and 2C

            //4. Prompt for user input
    }
    }
}