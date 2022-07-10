public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 63; // вес человека (в кг)
        double height = 1.73; // рост человека (в см)

        double bmi = service.calculate (weight, height);

        String bmiResult = String.format("%.2f",bmi);
        System.out.println("Ваш вес " +  weight + " кг");
        System.out.println("Ваш рост " + height + " см");
        System.out.println("Ваш Индекс массы тела " +  bmiResult );
    }
}

