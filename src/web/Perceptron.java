package web;

public class Perceptron {
    double weight_1 = Math.random() * 0.6 - 0.3;
    double weight_2 = Math.random() * 0.6 - 0.3;
    double weight_3 = Math.random() * 0.6 - 0.3;
    double normal = 0.000001;

    public double work(int param_1, int param_2, int param_3) {
        return weight_1 * param_1 + weight_2 * param_2 + weight_3 * param_3;
    }

    public void education(int param_1, int param_2, int param_3, int result) {
        double deviation = result - work(param_1, param_2, param_3);
        double deltaWeight_1 = deviation * normal * param_1;
        weight_1 += deltaWeight_1;
        double deltaWeight_2 = deviation * normal * param_2;
        weight_2 += deltaWeight_2;
        double deltaWeight_3 = deviation * normal * param_3;
        weight_3 += deltaWeight_3;
    }
}
