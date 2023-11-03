import java.util.Scanner;

public class Userinterface {
    FileHandler fileHandler = new FileHandler();

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        fileHandler.parseData();
        System.out.println("Velkommen til Covid-19 databasen\nHvordan vil du sortere?");

        do {

            System.out.println("(1) efter region\n(2) efter aldersgruppe\n(3) sorter først efter alder, så region\n(4) sorter først efter region, så alder\n(5) EXIT");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fileHandler.compareforRegion();
                    fileHandler.printData();
                    System.out.println("\nSorter igen?");
                    break;
                case 2:
                    fileHandler.compareForAlder();
                    fileHandler.printData();
                    System.out.println("\nSorter igen?");
                    break;
                case 3:
                    fileHandler.compareForAlderRegion();
                    fileHandler.printData();
                    System.out.println("\nSorter igen?");
                    break;
                case 4:
                    fileHandler.compareForRegionAlder();
                    fileHandler.printData();
                    System.out.println("\nSorter igen?");
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Ugyldigt input");
            }

        }
        while (true);
    }
}
