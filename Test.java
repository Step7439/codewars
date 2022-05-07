public class Test {
    public static void main(String[] args) {
        String name = "Step";
        System.out.println(greet(name));
    }
    public static String greet(String name)
    {
        String str = "Hello, " + name + " how are you doing today?";
        return str;
    }
}
