package week6;

/**
 * Instance - static -object
 * static - static - Direct
 * static - instance - Direct
 * Instance - instance - direct
 */
public class Pro4_Programme {
    int b = 10;
    boolean z = false;
    static float c = 1.5F;
    static String name = "AshBrook";

    // Declare instance method
    public void m1() {
        System.out.println(b);
        System.out.println(z);
        System.out.println(c);
        System.out.println(name);
    }

    public static void m2() {
        System.out.println(c);
        System.out.println(name);
        Pro4_Programme k = new Pro4_Programme();
        System.out.println(k.b);
        System.out.println(k.z);
    }

    public static void main(String[] args) {
        Pro4_Programme d = new Pro4_Programme();
        d.m1();
        m2();
    }
}
