import java.io.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Running Beginning");
        int numberOfPlayer = 3;
        Game mygame = new Game(numberOfPlayer);
        System.out.println("New game with "+numberOfPlayer+" players");
        mygame.Running();
        System.out.println("Running is over");
    }
}
