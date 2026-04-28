// Classe abstrata com o método template
abstract class Game {
    public final void play() {
        start();
        playTurn();
        end();
    }

    abstract void start();
    abstract void playTurn();
    abstract void end();
}

// Implementação concreta: Futebol
class Football extends Game {
    void start() {
        System.out.println("Iniciando o jogo de Futebol!");
    }
    void playTurn() {
        System.out.println("Jogando Futebol...");
    }
    void end() {
        System.out.println("Finalizando o jogo de Futebol!");
    }
}

// Implementação concreta: Xadrez
class Chess extends Game {
    void start() {
        System.out.println("Iniciando o jogo de Xadrez!");
    }
    void playTurn() {
        System.out.println("Jogando Xadrez...");
    }
    void end() {
        System.out.println("Finalizando o jogo de Xadrez!");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        System.out.println();

        Game chess = new Chess();
        chess.play();
    }
}