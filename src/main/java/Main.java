import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Calculator Welcomes You ------");
        System.out.println("Input your command:");
        Calculator calculator = new Calculator();

        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.contains("add")){
                String one = input.split("\\s+")[1];
                String two = input.split("\\s+")[2];
                int result = calculator.add(Integer.parseInt(one),Integer.parseInt(two));
                System.out.println(result);
            }
            if (input.contains("subtract")){
                String one = input.split("\\s+")[1];
                String two = input.split("\\s+")[2];
                int result = calculator.subtract(Integer.parseInt(one),Integer.parseInt(two));
                System.out.println(result);
            }
            if (input.contains("multiply")){
                String one = input.split("\\s+")[1];
                String two = input.split("\\s+")[2];
                int result = calculator.multiply(Integer.parseInt(one),Integer.parseInt(two));
                System.out.println(result);
            }
            if (input.contains("divide")){
                String one = input.split("\\s+")[1];
                String two = input.split("\\s+")[2];
                int result = calculator.divide(Integer.parseInt(one),Integer.parseInt(two));
                System.out.println(result);
            }
            if (input.contains("fib")){
                String one = input.split("\\s+")[1];
                int result = calculator.fibonacciNumberFinder(Integer.parseInt(one));
                System.out.println(result);
            }
            if (input.contains("binary")){
                String one = input.split("\\s+")[1];
                String result = calculator.intToBinaryNumber(Integer.parseInt(one));
                System.out.println(result);
            }
        }



    }
}
