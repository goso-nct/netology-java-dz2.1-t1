public class Main {
    // Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
    // Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

    public static void main(String[] args) {
        int price = 23715;
        int step = 20;
        int bonus = price / step;
        System.out.println(bonus);
    }
}
