/**
 * Клас, що представляє тюльпан.
 */
public class Tulip extends Flower<String> {

    /**
     * Конструктор для створення об'єкта тюльпана.
     *
     * @param price           Ціна тюльпана.
     * @param freshnessLevel  Рівень свіжості тюльпана.
     * @param stemLength      Довжина стебла тюльпана.
     */
    public Tulip(double price, int freshnessLevel, int stemLength) {
        super("Тюльпан", price, freshnessLevel, stemLength);
    }
}