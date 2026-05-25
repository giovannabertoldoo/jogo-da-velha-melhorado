
import java.util.Scanner;

class JogoDaVelha {
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;

    public JogoDaVelha(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
    }

    public void iniciar() {
        Scanner scan = new Scanner(System.in);

        JogadorHumano jogadorHumano = new JogadorHumano('X');
        JogadorMaquina  jogadorMaquina = new JogadorMaquina('O');

        String nome = jogadorHumano.obterNome();

        char simboloEscolhido = jogadorHumano.obterSimbolo();

        char simboloNaoEscolhido = jogadorMaquina.obterSimbolo(simboloEscolhido);

        this.jogador1 = new JogadorHumano(simboloEscolhido);
        this.jogador2 = new JogadorMaquina(simboloNaoEscolhido);

        int linha = -1;
        int coluna = -1;

        String jogadorAtual = "";

        int partida = 1;

        while (!tabuleiro.acabouOJogo()) {
            System.out.println("Partida " + partida);
            System.out.print("\n");

            do {
                linha = jogadorHumano.obterLinha();
                coluna = jogadorHumano.obterColuna();

                jogadorAtual = nome;

            } while (!tabuleiro.jogar(jogador1, linha, coluna, nome, true));

            System.out.print("\n");

            if (tabuleiro.acabouOJogo()) {
                break;
            }

            do {
                linha = jogadorMaquina.obterLinha();
                coluna = jogadorMaquina.obterColuna();

                jogadorAtual = "Bot";

            } while (!tabuleiro.jogar(jogador2, linha, coluna, jogadorAtual, false));

            partida++;
        }

        if (tabuleiro.haUmVencedor()) {
            System.out.println(jogadorAtual + " Ganhou!");
        } else {
            System.out.println("O jogo terminou empatado.");
        }

        System.out.println("Giovanna Bertoldo");
    }

    public static void main(String[] args) {
        Jogador jogador1 = new JogadorHumano('X');
        Jogador jogador2 = new JogadorMaquina('O');
        Tabuleiro tabuleiro = new Tabuleiro();

        JogoDaVelha jogoDaVelha = new JogoDaVelha(jogador1, jogador2, tabuleiro);

        jogoDaVelha.iniciar();
    }
}
