/**
 * Клас, що представляє лілію.
 */
public class Lily extends Flower<String> {

    /**
     * Конструктор для створення об'єкта лілії.
     *
     * @param price           Ціна лілії.
     * @param freshnessLevel  Рівень свіжості лілії.
     * @param stemLength      Довжина стебла лілії.
     */
    public Lily(double price, int freshnessLevel, int stemLength) {
        super("Лілія", price, freshnessLevel, stemLength);
    }
}
