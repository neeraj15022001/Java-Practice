public class Subsequences {
    String[] findSubsequence(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }
        String[] smallAns = findSubsequence(str.substring(1));
        String[] output = new String[2 * smallAns.length];
        for (int i = 0; i < smallAns.length; i++) {
            output[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            output[i + smallAns.length] = str.charAt(0) + smallAns[i];
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
        String str = "xyz";
        Subsequences sq = new Subsequences();
        String[] ans = sq.findSubsequence(str);
        sq.printArray(ans);
    }
}
