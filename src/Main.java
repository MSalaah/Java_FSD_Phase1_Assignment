public class Main {
    public static void main(String[] args) {
        showWelcomeMessage();
        showDeveloperDetails();
        showTheAppLogic();
    }

    private static void showWelcomeMessage() {
        System.out.println("\n\n-----------Welcome To Lockers App--------------");
    }

    private static void showDeveloperDetails() {
        System.out.println("\n******* Developer Information *******");
        System.out.println("\nName: Mohamed Salah ");
        System.out.println("email: mohamed.salahhussein@vodafone.com");
    }

    private static void showTheAppLogic() {
        System.out.println("\n******* Application Menu *******");
        System.out.println("\n-----------Please choose an option--------------");
        MenuEnum[] options = MenuEnum.values();
        for (MenuEnum option : options) {
            System.out.println(option);
        }
    }
}