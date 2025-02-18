import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            sc.nextLine();
            System.out.println("Insira a operação desejada (ou digite 'sair')");
            String operador = sc.nextLine();
            
            // condicao para sair do looping
            if (operador.equals("sair")){
                break;
            }

            System.out.println("Insira o primeiro valor: ");
            int num1 = sc.nextInt();

            System.out.println("Insira o segundo valor: ");
            int num2 = sc.nextInt();

            switch (operador) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Nao é possível dividir por zero");
                    } break;
                default:
                    System.out.println("Insira uma operação válida");
            }
        } while (true);
    }
}
