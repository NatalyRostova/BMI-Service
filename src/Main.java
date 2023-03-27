public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int myIndex = calculate.index(98, 1.87);

        System.out.println(myIndex);


    }
}