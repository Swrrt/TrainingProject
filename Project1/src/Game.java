
/*
    This class simulates the game.
 */
public class Game {
    int numberOfPlayer;
    int whoOnHill; /* the player id of player on the hill, -1 for no one */
    int whoWin; /* the player id of the winner, -1 for no one */
    Player players[];
    /*
            Constructor of the game, set the initial status of the game and initial the player's status
     */
    Game(int numberOfPlayer){
        this.numberOfPlayer = numberOfPlayer;
        /* Write your code here */
    }
    /*
            Function for rolling dice, return a int array as rolling result.
     */
    int[] Dice(){
        int dice[] = new int[6];
        for(int i=0;i<6;i++){
            dice[i] = Math.abs(((int)Math.random())%6)+1;
        }
        return dice;
    }
    /*
        Simulate the action in each turn
     */
    int Turns(int turn){
        System.out.println("Turn "+turn+" Start");
        for(int player = 0; player<numberOfPlayer; player++)
            if(!players[player].isDead){
                int dice[] = Dice();
                /* Write your code here */
            }

        return -1;
    }
    /*
        Simulate the game
     */
    void Running(){
        System.out.println("Game start!");
        int turn = 0,winner = -1;
        while(true){
            turn++;
            winner = Turns(turn);
            if(winner>0)break;
        }
        System.out.println("Game over, winner is "+ winner);
    }
}
