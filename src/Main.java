public class Main {
    public static void main(String[] args) throws Exception {

        int[] sales1 = {1, 2, 5, 586, 0, 56, -8};
        SalesManager manager1 = new SalesManager(sales1);

        System.out.println("Максимальная продажа - " + manager1.max());
    }
}