import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * Головний клас програми для роботи з квітковими букетами.
 */
public class FlowerShopApp {
    /**
     * Головний метод програми.
     *
     * @param args Аргументи командного рядка
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            // Введення даних від користувача
            System.out.print("Введіть кількість квітів у букеті: ");
            int flowerCount = scanner.nextInt();
            System.out.print("Введіть вартість аксесуарів: ");
            double accessoryCost = scanner.nextDouble();

            // Створюємо букет з аксесуарами
            Bouquet bouquet = new Bouquet(accessoryCost);

            // Встановлюємо фіксовані ціни для видів квітів
            double rosePrice = 10.0;
            double tulipPrice = 8.0;
            double lilyPrice = 12.0;

            // Генерація квітів
            for (int i = 0; i < flowerCount; i++) {
                int flowerType = random.nextInt(3); // 0 - Rose, 1 - Tulip, 2 - Lily
                int freshnessLevel = random.nextInt(10) + 1; // Свіжість від 1 до 10
                int stemLength = random.nextInt(41) + 20; // Довжина стебла від 20 до 60

                switch (flowerType) {
                    case 0:
                        bouquet.addFlower(new Rose(rosePrice, freshnessLevel, stemLength));
                        break;
                    case 1:
                        bouquet.addFlower(new Tulip(tulipPrice, freshnessLevel, stemLength));
                        break;
                    case 2:
                        bouquet.addFlower(new Lily(lilyPrice, freshnessLevel, stemLength));
                        break;
                }
            }

            // Вивід інформації про букет
            System.out.println("\nДеталі букета:");
            bouquet.printBouquetDetails();

            // Розрахунок загальної вартості
            System.out.println("\nЗагальна вартість: " + bouquet.calculateTotalCost());

            // Сортування за свіжістю
            bouquet.sortFlowersByFreshness();
            System.out.println("\nКвіти після сортування за свіжістю:");
            bouquet.printBouquetDetails();

            // Пошук квітів за довжиною стебла
            System.out.print("\nВведіть мінімальну довжину стебла: ");
            int minLength = scanner.nextInt();
            System.out.print("Введіть максимальну довжину стебла: ");
            int maxLength = scanner.nextInt();

            ArrayList<Flower> matchingFlowers = bouquet.findFlowersByStemLength(minLength, maxLength);
            System.out.println("\nКвіти, що відповідають заданому діапазону довжини:");
            if (matchingFlowers.isEmpty()) {
                System.out.println("Немає квітів, які відповідають заданим параметрам.");
            } else {
                for (Flower flower : matchingFlowers) {
                    System.out.println(flower);
                }
            }

        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
