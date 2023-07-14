import java.util.Scanner;

public class modeluas {
    private double Rating;
    private static void displayData(modeluas[] laptops) {
        for (modeluas laptop : laptops) {
            System.out.println(laptop);
        }
        System.out.println();
    }

    private static void selectionSort(modeluas[] laptops) {
        int n = laptops.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (laptops[j].getRating() < laptops[minIndex].getRating()) {
                    minIndex = j;
                }
            }
            modeluas temp = laptops[minIndex];
            laptops[minIndex] = laptops[i];
            laptops[i] = temp;
        }
    }

    private double getRating() {
        return 0;
    }

    private static double getUserInput() {
        System.out.print("Masukkan rating yang ingin Anda cari: ");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    private static modeluas searchData(modeluas[] laptops, double searchRating) {
        for (modeluas laptop : laptops) {
            if (laptop.getRating() == searchRating) {
                return laptop;
            }
        }
        return null;
    }
}
