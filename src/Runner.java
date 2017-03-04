import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Asus on 11.02.2017.
 */
public class Runner {

    public static void main(String[] args) {

        final String FILE_PATH = "src/in.txt";    //константа - постоянная переменная

        List<Purchase> purchaseList = new ArrayList<>();

        Scanner scaner = null;
        try {
            scaner = new Scanner(new FileReader(FILE_PATH));
            int count = 6;

            for (int i = 0; i < count; i++) {
                String name = scaner.next();
                String nameProduct = scaner.next();
                int cost = scaner.nextInt();

                Purchase purchase = new Purchase(name, nameProduct, cost);

                purchaseList.add(purchase);
            }

            for (Purchase purchase: purchaseList) {
                System.out.println(purchase);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File " + FILE_PATH + " is not found");
        } finally {
            if (scaner != null) {
                scaner.close();
            }
        }
    }

}
