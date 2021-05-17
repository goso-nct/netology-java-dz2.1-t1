public class Main {
    // Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
    // Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.

    public static void main(String[] args) {
        int BONUS_STEP = 20;

        int price = 23715;
        int bonus = price / BONUS_STEP;

        System.out.println("bonus:" + bonus);
    }
}
