/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author admin
 */
public class testOn {
    public static void main(String [] args){
        Board a = new Board();
        System.out.println(a.getBoard());
        
        a.nextStep(1, 0, "player");
        System.out.println(a.getBoard());
    }
}
