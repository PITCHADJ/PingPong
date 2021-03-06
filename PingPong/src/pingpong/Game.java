/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pingpong;

/**
 *
 * @author dep_p
 */
public class Game {

    public static final int MAX_TURNS = 10;

    public static void main(String[] args) {
        Player player1 = new Player("ping");
        Player player2 = new Player("pong");
        player1.setNextPlayer(player2);
        player2.setNextPlayer(player1);
        System.out.println("Game starting...!");
        player1.play();
        System.out.println("Game finished!");
    }
}