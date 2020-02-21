public class MyClass {
    private int a;

    public void setA(int a, String myPassword) {
        if (myPassword.equals("1111")) {
            this.a = a;
        } else {
            System.out.println("102 was called");
        }
    }

    /*public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }*/
}
