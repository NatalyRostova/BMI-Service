public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int myIndex = calculate.index((int) 67.3, 1.65);

        //weight - вес в кг
        //height - рост в м

        System.out.println(myIndex);


    }
}