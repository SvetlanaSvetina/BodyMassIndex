public class BmiService {
    public double calculate(int weight, double height) {
        double bmi = weight / (height * 2); // рассчитанный индекс массы тела
        return bmi; // возвращаем рассчитанный индекс
    }
}
