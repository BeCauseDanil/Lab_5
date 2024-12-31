import java.util.ArrayList;
import java.util.Comparator;

/**
 * Клас, що представляє букет квітів.
 */
public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private double accessoryCost;

    /**
     * Конструктор класу Bouquet.
     *
     * @param accessoryCost Вартість аксесуарів
     */
    public Bouquet(double accessoryCost) {
        this.accessoryCost = accessoryCost;
    }

    /**
     * Додає квітку до букета.
     *
     * @param flower Об'єкт квітки
     */
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    /**
     * Обчислює загальну вартість букета (квіти + аксесуари).
     *
     * @return Загальна вартість букета
     */
    public double calculateTotalCost() {
        double total = accessoryCost;
        for (Flower flower : flowers) {
            total += flower.getPrice();
        }
        return total;
    }

    /**
     * Сортує квіти у букеті за рівнем свіжості.
     */
    public void sortFlowersByFreshness() {
        flowers.sort(Comparator.comparingInt(Flower::getFreshnessLevel));
    }

    /**
     * Повертає квіти, що відповідають заданому діапазону довжини стебла.
     *
     * @param minLength Мінімальна довжина стебла
     * @param maxLength Максимальна довжина стебла
     * @return Список квітів, що відповідають діапазону
     */
    public ArrayList<Flower> findFlowersByStemLength(int minLength, int maxLength) {
        ArrayList<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                matchingFlowers.add(flower);
            }
        }
        return matchingFlowers;
    }

    /**
     * Виводить інформацію про всі квіти у букеті.
     */
    public void printBouquetDetails() {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}