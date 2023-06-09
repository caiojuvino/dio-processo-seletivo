import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        while (true) {

            try {
                System.out.print("Digite o primeiro parâmetro: ");
                parametroUm = terminal.nextInt();
                terminal.nextLine();

                System.out.print("Digite o segundo parâmetro: ");
                parametroDois = terminal.nextInt();
                terminal.nextLine();
            } catch (Exception e) {
                System.out.printf("%n%s%n%n","Informe um inteiro válido!");
                terminal.nextLine();
                continue;
            }

            try {
                contar(parametroUm, parametroDois);
                break;
            } catch (ParametrosInvalidosException e) {
                System.out.printf("%n%s%n%n", e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        System.out.println();
        int contagem = parametroDois - parametroUm;

        for (int i = 1; contagem >= i; i++ ) {
            System.out.println("Imprimindo do número: " + i);
        }
    }
}