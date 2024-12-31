/**
 * Клас, що представляє троянду.
 */
public class Rose extends Flower<String> {

    /**
     * Конструктор для створення об'єкта троянди.
     *
     * @param price           Ціна троянди.
     * @param freshnessLevel  Рівень свіжості троянди.
     * @param stemLength      Довжина стебла троянди.
     */
    public Rose(double price, int freshnessLevel, int stemLength) {
        super("Троянда", price, freshnessLevel, stemLength);
    }
}