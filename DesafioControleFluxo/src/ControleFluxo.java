import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int contador1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int contador2 = scanner.nextInt();
        int controle = 1;

        if(contador1 > contador2) {
            throw new ParametrosInvalidosException();
        }

        for(int i = contador1; i < contador2; i++) {
            System.out.println(controle);
            controle++;
        }
        } catch (ParametrosInvalidosException e) {
            e.teste();
        }
    }
}
