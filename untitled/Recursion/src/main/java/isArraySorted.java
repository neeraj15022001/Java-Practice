public class isArraySorted {
    public static boolean checkSorted(int input[]) {
        if (input.length <= 1) {
            return true;
        } else {
            int smallInput[] = new int[input.length - 1];
            for (int i = 1; i < input.length; i++) {
                smallInput[i - 1] = input[i];
            }
            boolean smallAns = checkSorted(smallInput);
            if (!smallAns) {
                return false;
            }
            if (input[0] <= input[1]) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean optimizedCheckSorted(int input[]) {
        if (input.length <= 1) {
            return true;
        }
        if (input[0] > input[1]) {
            return false;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = optimizedCheckSorted(smallInput);
        return smallAns;
    }

    public static boolean checkSortedBetter(int[] input, int startingIndex) {
        if(startingIndex == input.length - 1) {
            return true;
        } if(input[startingIndex] > input[startingIndex + 1]) {
            return false;
        }
        boolean smallAns = checkSortedBetter(input, startingIndex + 1);
        return smallAns;
    }
    public static void main(String[] args) {
        int input[] = {1, 2, 3, 0, 7};
        System.out.println(checkSortedBetter(input,0));
    }
}
