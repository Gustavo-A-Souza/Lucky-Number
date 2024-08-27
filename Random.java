import java.util.Random;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorte = random.nextInt(100) + 1;
        
        System.out.println("╭━━╮╱╱╱╭━┳╮╱╱╱╱╱╱╭╮╱╱╱╱╭╮");
        System.out.println("╰╮╭╋┳┳╮╰╮┃┣━┳┳┳┳╮┃┃╭┳┳━┫┣┳┳╮");
        System.out.println("╱┃┃╭┫┃┃╭┻╮┃╋┃┃┃╭╯┃╰┫┃┃━┫━┫┃┃");
        System.out.println("╱╰┻╯┣╮┃╰━━┻━┻━┻╯╱╰━┻━┻━┻┻╋╮┃");
        System.out.println("╱╱╱╱╰━╯╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━╯");
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número da sorte entre 1 - 1000");
        System.out.println("Pressione Enter para começar...");
        
                try {
            System.in.read(); // Espera o usuário pressionar Enter
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.print("𝓓𝓲𝓰𝓲𝓽𝓮 𝓢𝓮𝓾 𝓝𝓸𝓶𝓮: ");
        String nomeCompleto = scanner.nextLine();
        
        int tentativasMaximas = 100;
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < tentativasMaximas) {
            
            System.out.print("Tentativa " + (tentativas + 1) + ": \nQual é o número da sorte?\n ");
            int tentativaUsuario = scanner.nextInt();
            
            tentativas++;
            
            if (tentativaUsuario == numeroSorte) {
                acertou = true;
                break;
            } else if (tentativaUsuario < numeroSorte) {
                System.out.println("O número da sorte é maior que " + tentativaUsuario + ". Tente novamente.");
            } else {
                System.out.println("O número da sorte é menor que " + tentativaUsuario + ". Tente novamente.");
            }
        }
        
        if (acertou) {
            System.out.println("Parabéns, " + nomeCompleto + "! Você acertou o número da sorte em " + tentativas + " tentativas.");
            System.out.println("________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶");
            System.out.println("¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶");
            System.out.println("¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶ ");
            System.out.println("¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶¶ ");
            System.out.println("¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶ ");
            System.out.println("_¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶____¶¶¶ ");
            System.out.println("_¶¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶__¶¶¶¶ ");
            System.out.println("___¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶ ");
            System.out.println("____¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶ ");
            System.out.println("______¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶ ");
            System.out.println("_______________¶¶¶¶¶¶¶¶¶¶¶¶");
            System.out.println("_________________¶¶¶¶¶¶¶¶ ");
            System.out.println("___________________¶¶¶¶ ");
            System.out.println("___________________¶¶¶¶ ");
            System.out.println("___________________¶¶¶¶ ");
            System.out.println("___________________¶¶¶¶ ");
            System.out.println("_______________¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
            System.out.println("_________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
            
        }
        
        scanner.close();
    }
}

