import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showWelcomeMessage();
        showDeveloperDetails();

        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            FileManager manager = new FileManager();

            switch(choice) {
                case 1:
                    manager.getFilesInCurrentDir();
                    break;
                case 2:
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Please enter the file name you want to create");
                    String fileName = myObj.nextLine();  // Read user input
                    manager.createFile(fileName);
                    break;
                case 3:
                    manager.deleteFile("New");
                    break;
                case 4:
                    manager.searchForFile("New");
                    break;
                case 5:
                    System.out.println("Working Directory = " + System.getProperty("user.dir"));
                    System.exit(0);
                    break;
            }
        }
    }

    private static void showWelcomeMessage() {
        System.out.println("\n\n-----------Welcome To Lockers App--------------");
    }

    private static void showDeveloperDetails() {
        System.out.println("\n******* Developer Information *******");
        System.out.println("\nName: Mohamed Salah ");
        System.out.println("email: mohamed.salahhussein@vodafone.com");
    }

    private static void showMenu() {
        System.out.println("\n******* Application Menu *******");
        MenuEnum[] options = MenuEnum.values();
        for (MenuEnum option : options) {
            System.out.println(option);
        }

        System.out.println("\n-----------Please choose an option--------------");
    }

    private  static void listFiles() {
        String workingDir = System.getProperty("user.dir");
    }
}