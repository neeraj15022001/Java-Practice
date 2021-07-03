public class printSubsequence {
    void printSub(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        printSub(input.substring(1), output);
        printSub(input.substring(1), output + input.charAt(0));
    }
    void printSub(String input) {
        printSub(input, "");
    }
    public static void main(String[] args) {
        printSubsequence ps = new printSubsequence();
        ps.printSub("xyz");
    }
}
