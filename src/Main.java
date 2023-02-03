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
                    manager.createFile(takeFileNameAsInput());
                    break;
                case 3:
                    manager.deleteFile(takeFileNameAsInput());
                    break;
                case 4:
                    manager.searchForFile(takeFileNameAsInput());
                    break;
                case 5:
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

    private  static String takeFileNameAsInput() {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter the file name");
        return sc.nextLine();
    }
}