import java.util.Scanner;

class JogadorHumano extends Jogador {

    Scanner scan = new Scanner(System.in);

    public JogadorHumano(char simbolo) {
        super(simbolo);
    }

    public String obterNome() {
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("\n");

        return nome;
    }

    public char obterSimbolo() {
        char simboloEscolhido = ' ';

        while (simboloEscolhido != 'X' && simboloEscolhido != 'O') {
            System.out.print("Digite qual simbolo ('X' ou 'O') quer usar: ");
            simboloEscolhido = scan.nextLine().charAt(0);

            if (simboloEscolhido != 'X' && simboloEscolhido != 'O') {
                System.out.println("Digite um simbolo válido");
            }

            System.out.print("\n");
        }

        return simboloEscolhido;
    }

    public int obterLinha() {
        int linha = -1;
        
        while (linha < 0 || linha > 2) {
            System.out.print("Digite a linha (0,1,2): ");
            linha = scan.nextInt();

            if (linha < 0 || linha > 2) {
                System.out.println("Digite um número válido");
            }

            System.out.print("\n");
        }

        return linha;
    }

    public int obterColuna() {
        int coluna = -1;
        
        while (coluna < 0 || coluna > 2) {
            System.out.print("Digite a coluna (0,1,2): ");
            coluna = scan.nextInt();

            if (coluna < 0 || coluna > 2) {
                System.out.println("Digite um número válido");
            }

            System.out.print("\n");
        }
        
        return coluna;
    }
}
