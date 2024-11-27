import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        double n1 = scanner.nextDouble();

        System.out.println("digite o segundo numero");
        double n2 = scanner.nextDouble();

        System.out.println("Digite qual sera a operacao: ");
        String operacao = scanner.next();  //simbolos vao entrar como string

        Operacao calculo = null;  //inicializando com null pq ainda "n existe"

        switch (operacao) {
            case "+":
                calculo = new Soma();
                break;
//instanciando dentro do swtich
            case"-":
                calculo = new Subtracao();
                break;

            case "/":
                calculo = new Divisao();
                break;

            case "*":
                calculo = new Multiplicacao();
                break;

            default:
                System.out.println("nao é valido");
        }

        double resultado = calculo.calcular(n1, n2);
        System.out.println("o resultado da operaçao é "+ resultado);
    }
}