import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> opcoes = Arrays.asList("Pedra", "Papel", "Tesoura");
        
        while (true) {
            
            System.out.println("""
                ------------------------     
               | --------JOKENPO-------- |
                -------------------------
               |0- PEDRA                 |  
               |1- PAPEL                 |  
               |2- TESOURA               |
                ------------------------
            """);
            
            var leitura = new Scanner(System.in);
            var random = new Random();
            var indexJogadaPc = random.nextInt(opcoes.size() );
            var jogadaPc = opcoes.get(indexJogadaPc);
            
            System.out.print("->");
            var escolha = leitura.nextInt(opcoes.size());
            var indexEscolha = opcoes.get(escolha);
            
            if (escolha == indexJogadaPc){
                System.out.println("o computado jogou " + jogadaPc);
                System.out.println("vocé escolheu " + indexEscolha);
                System.out.println("Empate");
            }
            if (escolha == 0 && indexJogadaPc == 2 || escolha == 1 && indexJogadaPc == 0 || escolha == 2 && indexJogadaPc == 1){
                System.out.println("o computado jogou " + jogadaPc);
                System.out.println("vocé escolheu " + indexEscolha);
                System.out.println("Vitoria");

            }else if (escolha == 2 && indexJogadaPc == 0 || escolha == 0 && indexJogadaPc == 1 || escolha == 1 && indexJogadaPc == 2){
                System.out.println("o computado jogou " + jogadaPc);
                System.out.println("vocé escolheu " + indexEscolha);
                System.out.println("Derrota");

            }
            
            var leitura2 = new Scanner(System.in);
            System.out.print("[1 SAIR] [2 JOGAR]-> ");
            var fim = leitura2.nextInt();

            if (fim == 1){
                System.out.println("Obrigado por jogar");
                break;
            }  
            
        }
    } 
}
