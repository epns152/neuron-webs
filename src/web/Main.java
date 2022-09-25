package web;

public class Main {

    public static void main(String[] args) {
        Perceptron firstTimeInNeuralNetworks = new Perceptron();
        int[][] inputData = new int[][]{
                {1, 0, 1, 0},
                {1, 1, 1, 1},
                {0, 1, 1, 1}};
        int[][] inputData2 = new int[100][4];
        for (int i = 0; i < inputData2.length; i++) {
            int first, second, third;
            first = (int) (Math.random() * 40) - 20;
            second = (int) (Math.random() * 40) - 20;
            third = (int) (Math.random() * 40) - 20;
            inputData2[i][0] = first;
            inputData2[i][1] = second;
            inputData2[i][2] = third;
            inputData2[i][3] = first + second - third;
        }
        for (int j = 0; j < 100000; j++) {
            for (int[] inputDatum : inputData2) {
                firstTimeInNeuralNetworks.education(inputDatum[0], inputDatum[1], inputDatum[2], inputDatum[3]);
            }
        }
        System.out.println(firstTimeInNeuralNetworks.weight_1);
        System.out.println(firstTimeInNeuralNetworks.weight_2);
        System.out.println(firstTimeInNeuralNetworks.weight_3);
        System.out.println(firstTimeInNeuralNetworks.work(3, 4, 1));

    }
}
