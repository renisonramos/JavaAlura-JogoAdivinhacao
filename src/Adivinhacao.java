import java.util.Random;
import java.util.Scanner;

class Adivinhacao {
    public static void main(String[] args) {
        System.out.println("Jogo de Adivinhação");

        // Gera um número aleatório entre 0 e 99
        int numeroAleatorio = new Random().nextInt(100);

        // Convocando metodo Scanner para obter a tentativa do usuário.
        Scanner leitura = new Scanner(System.in);

        //Varialvel para controlar o numero de tentativas
        int tentativasRestantes = 5;

        while (tentativasRestantes > 0) {
            // Mensagem para o usuário
            System.out.println("Tente adivinhar o número (entre 0 e 100): ");

            // Variavel que guardar o que o usuário digita
            int tentativa = leitura.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("Você acertou! ");
                break; // Sai do loop se acertou
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número digitado é maior."); // Mensagem mais clara
            } else {
                System.out.println("O número digitado é menor."); // Mensagem mais clara
            }

            tentativasRestantes--;
        }

        // Verifica se o usuário não acertou após as 5 tentativas
        if (tentativasRestantes == 0) {
            System.out.println("Você não conseguiu adivinhar o número. O número era: " + numeroAleatorio);
        }
    }
}