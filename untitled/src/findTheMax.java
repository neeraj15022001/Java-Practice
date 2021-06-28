public class findTheMax {
    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 40, 50, 70};
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value of min is " + minValue + " current Index value is " + array[i]);
            if (array[i] < minValue) {
                minValue = array[i];
            }
            System.out.println("Value of max is " + minValue + " current Index value is " + array[i]);
        }
        System.out.println(minValue);
    }
}
