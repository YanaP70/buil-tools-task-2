public class App {
    public static void main(String[] args) {
        System.out.println("Utils.isAllPositiveNumbers(\"12\", \"79\") = " + Utils.isAllPositiveNumbers("12", "79"));
        System.out.println("Utils.isAllPositiveNumbers(\"-12\", \"79\") = " + Utils.isAllPositiveNumbers("-12", "79"));
        System.out.println("Utils.isAllPositiveNumbers(\"12\", \"7.9\") = " + Utils.isAllPositiveNumbers("12", "7.9"));
    }
}
