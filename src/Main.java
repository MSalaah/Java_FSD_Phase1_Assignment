import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showWelcomeMessage();
        showDeveloperDetails();

        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            try {
                int choice = sc.nextInt();
                FileManager manager = new FileManager();
                switch (choice) {
                    case 1:
                        manager.getFilesInCurrentDir();
                        break;
                    case 2:
                        showSubMenu(manager);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            } catch (Exception ex) {
                String badInput = sc.next();
                System.out.println(badInput + " is not a valid number, Please enter a valid number");
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

    private static void showSubMenu(FileManager manager) {
        SubMenu[] options = SubMenu.values();
        for (SubMenu option : options) {
            System.out.println(option);
        }

        System.out.println("\n-----------Sub Menu--------------");
        Scanner sc = new Scanner(System.in);
        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.createFile(takeFileNameAsInput());
                    break;
                case 2:
                    manager.deleteFile(takeFileNameAsInput());
                    break;
                case 3:
                    manager.searchForFile(takeFileNameAsInput());
                    break;
                case 4:
                    //back
                    System.out.println("\nNavigating back to the main menu");
                    break;
            }
        } catch (Exception e) {
            String badInput = sc.next();
            System.out.println(badInput + " is not a valid number, Please enter a valid number");
        }
    }

    private static String takeFileNameAsInput() {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter the file name");
        return sc.nextLine();
    }
}