import Vectors.*;

public class Main {
    public static void main(String[] args) {
        Vector2 v2a = new Vector2(2, 3);
        Vector2 v2b = new Vector2(3.5f, -3);
        System.out.println(Vectors.add(v2a, v2b));
        System.out.println(Vectors.add(v2b, v2a));
    }
}