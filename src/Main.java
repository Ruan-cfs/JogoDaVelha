import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Campo[][] velha = new Campo[3][3];
        char AtualSimbolo = 'x';
        boolean game = true;
        char vitoria = ' ';
        Scanner scan = new Scanner(System.in);
        iniciarJogo(velha);
        while (game){
            desenhaJogo(velha);
            vitoria=verificarVitoria(velha);
            if(vitoria != (' ')){
                System.out.printf("o jogador %c venceu a partida",vitoria);
                break;
            }
            try {
                if (verificarJogada(velha,Jogar(scan,AtualSimbolo),AtualSimbolo)){
                    if (AtualSimbolo == 'x'){
                        AtualSimbolo = 'o';
                    }else {
                        AtualSimbolo = 'x';
                    }
                }
            }catch (Exception e){
                System.out.print("Erro");
            }
        }
        System.out.print("\nFim do Jogo!");
    }
    public static int[] Jogar(Scanner scan,char AtualSimbolo){
        int p[] = new int[2];
        System.out.printf("%s %c%n","Quem joga: ",AtualSimbolo);
        System.out.print("Informe a Linha: ");
        p[0]= scan.nextInt();
        System.out.print("Informe a Coluna: ");
        p[1]= scan.nextInt();
        return p;
    }
    public static boolean verificarJogada(Campo[][] velha, int p[], char AtualSimbolo){
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(AtualSimbolo);
            return  true;
        }else {
            return false;
        }
    }
    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.println(" 0   1   2");
        System.out.printf("0 %c | %c | %c%n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.print(" -----------\n");
        System.out.printf("1 %c | %c | %c%n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.print(" -----------\n");
        System.out.printf("2 %c | %c | %c%n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }
    public static void limparTela(){
        for (int i = 0; i < 200; i++) {
            System.out.print("\n");
        }
    }
    public static void iniciarJogo(Campo[][] velha){
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                velha[l][c] = new Campo();
            }
        }
    }
    public static char verificarVitoria(Campo[][] velha){
        for(int l=0;l<3;l++) {
            if (velha[l][0].getSimbolo() == velha[l][1].getSimbolo() &&
                    velha[l][1].getSimbolo() == velha[l][2].getSimbolo() &&
                    velha[l][0].getSimbolo() != ' ') {

                return velha[l][0].getSimbolo();
            }
        }

        for (int c=0;c<3;c++){
            if (velha[0][c].getSimbolo() == velha[1][c].getSimbolo() &&
                    velha[1][c].getSimbolo() == velha[2][c].getSimbolo() &&
                    velha[0][c].getSimbolo() != ' '){
                return velha[0][c].getSimbolo();
            }
        }
            //diaginal principal
        if (velha[0][0].getSimbolo() == velha[1][1].getSimbolo() &&
                velha[1][1].getSimbolo() == velha[2][2].getSimbolo() &&
                velha[0][0].getSimbolo() != ' ') {

                return velha[0][0].getSimbolo();
        }
            // diagonal secundaria
        if (velha[0][2].getSimbolo() == velha[1][1].getSimbolo() &&
                    velha[1][1].getSimbolo() == velha[2][0].getSimbolo() &&
                    velha[0][2].getSimbolo() != ' ') {

                return velha[0][2].getSimbolo();
        }
        return ' ';
    }


}
