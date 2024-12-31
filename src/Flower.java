/**
 * Абстрактний базовий клас, що представляє квітку.
 *
 * @param <T> Тип імені квітки (наприклад, String, Integer тощо).
 */
public abstract class Flower<T> {
    private T name; // Тип имени цветка теперь параметризован
    private double price;
    private int freshnessLevel;
    private int stemLength;

    /**
     * Конструктор для створення об'єкта квітки.
     *
     * @param name            Ім'я квітки (тип T).
     * @param price           Ціна квітки.
     * @param freshnessLevel  Рівень свіжості (1-10).
     * @param stemLength      Довжина стебла (в сантиметрах).
     */
    public Flower(T name, double price, int freshnessLevel, int stemLength) {
        this.name = name;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
    }

    /**
     * Повертає ім'я квітки.
     *
     * @return Ім'я квітки.
     */
    public T getName() {
        return name;
    }

    /**
     * Повертає ціну квітки.
     *
     * @return Ціна квітки.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Повертає рівень свіжості квітки.
     *
     * @return Рівень свіжості квітки.
     */
    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    /**
     * Повертає довжину стебла квітки.
     *
     * @return Довжина стебла квітки (в сантиметрах).
     */
    public int getStemLength() {
        return stemLength;
    }

    /**
     * Перевизначений метод toString для представлення інформації про квітку у вигляді рядка.
     *
     * @return Рядок з інформацією про квітку.
     */
    @Override
    public String toString() {
        return String.format("%s: Ціна=%.2f, Свіжість=%d, Довжина стебла=%d",
                name.toString(), price, freshnessLevel, stemLength);
    }
}





