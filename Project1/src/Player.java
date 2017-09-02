/*
    This class store the player's information:
    PlayerId, Money, Health Points, Score Points.
 */
public class Player {
    int playerId, money, healthPoints, scorePoints;
    boolean isDead;
    /* Constructor with initial player status */
    Player(int playerId){
        this.playerId = playerId;
        /* Write your code here */
    }
    /* Healing from dices, shouldn't excess 10 health points*/
    void Healing(int healthPoints){
        /* Write your code here */
    }
    /* Receive damage, return 0 for still alive, return -1 for dead */
    int Damaging(int attack){
        /* Write your code here */
    }
    /* Receive score points, return 1 for wining the game, otherwise return 0 */
    int Scoring(int scorePoints){
        /* Write your code here */
    }
}
