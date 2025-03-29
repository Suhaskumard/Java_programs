public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
