import java.util.Random;

class JogadorMaquina extends Jogador {
     Random random = new Random();


    public JogadorMaquina(char simbolo) {
        super(simbolo);
    }

    public char obterSimbolo(char simboloEscolhido) {
       
        if (simboloEscolhido == 'X') {
            return 'O';
        }

        return 'X';
    }

    public int obterLinha(){
        int linha = random.nextInt(0, 3);

        return linha;
    }

     public int obterColuna(){
        int coluna = random.nextInt(0, 3);

        return coluna;
    }
}
