public class phoneKeypadSubsequence {
    char[] helper(int number) {
        switch (number) {
            case 2:
                return new char[]{'a','b','c'};
            case 3:
                return new char[]{'d','e','f'};
            case 4:
                return new char[]{'g','h','i'};
            case 5:
                return new char[]{'j','k','l'};
            case 6:
                return new char[]{'m','n','o'};
            case 7:
                return new char[]{'p','q','r','s'};
            case 8:
                return new char[]{'t','u','v'};
            case 9:
                return new char[]{'w','x','y','z'};
            default:
                return new char[]{' '};
        }
    }
    String[] phoneKeypadBrain(int number) {
        if(number == 0) {
            return new String[]{""};
        }
        String[] smallAns = phoneKeypadBrain(number/10);
        char[] numberCorrespondingArray = helper(number%10);
        String[] output = new String[smallAns.length * numberCorrespondingArray.length];
        int k = 0;
        for (int i = 0; i < numberCorrespondingArray.length; i++) {
            char ch = numberCorrespondingArray[i];
            for (int j = 0; j < smallAns.length; j++) {
                output[k] = ch + smallAns[j];
                k++;
            }
        }
        return output;
    }
    void printArray(String[] array) {
        for (String j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number = 234;
        phoneKeypadSubsequence pks = new phoneKeypadSubsequence();
        String[] ans = pks.phoneKeypadBrain(number);
        pks.printArray(ans);
    }
}
