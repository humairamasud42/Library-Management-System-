
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(1, "Classic Shakespeare", true, "Jackson Mike", 100);
        System.out.println("Initial Details");
        b1.getDetails();

        System.out.println("\nChecking Out Book");
        b1.setIsAvailable(false);
        b1.getDetails();

        System.out.println("\nReturning Book");
        b1.setIsAvailable(true);
        b1.getDetails();
    }
}

