import javax.xml.transform.sax.SAXResult;

public class removeXFromString {
    public static String removeX(String str) {
        if(str.length() == 0) {
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x') {
            ans += str.charAt(0);
        }
        String smallAns = removeX(str.substring(1));
        return ans + smallAns;
    }
    public static void main(String[] args) {
        String str = "xanxx";
        System.out.println(removeX(str));
    }
}
