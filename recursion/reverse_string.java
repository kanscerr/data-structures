package recursion;
public class reverse_string {
    static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(reverse(str));
    }
}