package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (customerType.equals("vip")) {
            return price*0.75;
        }
        return price;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (purchaseCount < 0) purchaseCount = 0;
        double discount = purchaseCount * 0.01;
        if (discount >= 0.5){
            discount =0.5;
        }
        return price * (1 - discount);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0;
        if (isFirstOrder) {
            discount += 0.1;
        }
        if ("SAVE20".equals(promoCode)) {
            discount += 0.2;
        }
        return price * (1 - discount);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = age*0.01;
        if ("winter".equals(season)) {
            discount += 0.1;
        }
        if (discount > 0.5){
            discount = 0.5;
        }
        return price * (1 - discount);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}
