public class Lab3 {
    public static void main(String[] args) {
        String string1 = "ASD";
        String string2 = string1;
        string1 = string1 + "C";
        System.out.println(string1);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        int a = 1;
        char c = 'a';
    }
}
