public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.facts(50, 1.6);
        System.out.println("Индекс массы тела:");
        System.out.println();
        System.out.println(index);
    }
}
