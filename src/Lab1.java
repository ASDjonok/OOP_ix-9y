public class Lab1 {
    public static void main(String[] args) /*throws Exception*/ {
        double S = 0;
        int a = 1;
        int n = 2;
        int b = 1;
        int m = 2;
        final int C = 1;
//        char i = (char)a;
//        char j = (char)b;
        /*try {

        } catch */
        if (a <= C && C <= n || b <= 0 && 0 <= m) {
            System.out.println(":( Division by Zero");
            /*try {
                throw new Exception("!!!");
//                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
//            throw new RuntimeException("!!!");
//            return;
        }

        for (char i = (char)a; i <= n; i++) {
            for (char j = (char)b; j <= m; j++) {
                S += ((double)(i/j)/(i-C));
            }
        }
        System.out.println(S);

    }
}
