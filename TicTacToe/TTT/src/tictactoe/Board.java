/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yingge
 * Board class to store functions for board
 */
public class Board {
    private List<List<Integer>> board = new ArrayList<>();

    /**
     * create the board to play
     */
    public Board() {
        List<Integer> row = new ArrayList<>();
        row.add(0);
        row.add(0);
        row.add(0);
        this.board.add(row);
        this.board.add(row);
        this.board.add(row);
    }

    /**
     * get the board
     */
    public List<List<Integer>> getBoard() {
        return board;
    }
    
    /**
     * input row, col, and player, if player is computer count as -1 for the step position
     * if player is real player, count as 1 for the step position
     * check validation with row, col and player
     */
    public void nextStep(int row, int col, String curPlayer){
        validRowAndCol(row, col);
        if(curPlayer == "player"){
            List<Integer> curRow = board.get(row);
            if(this.getValue(row, col) != 0){
                return;
            }
            curRow.set(col, 1);
            System.out.println(curRow);
            board.set(2, curRow);
        }
        else if(curPlayer == "computer"){
            List<Integer> curRow = board.get(row);
            if(this.getValue(row, col) != 0){
                return;
            }
            curRow.set(col, -1);
            board.set(row, curRow);
        }  
    }
    
    /**
     * check if player is computer or player
     */
    public void validplayer(String player){
        if(player.equals("computer") || player.equals("player")){
        }
        else{
            throw new IllegalArgumentException("player is not valid input");
        }
    }
    
    /**
     * check if row and column is validate input
     */
    public void validRowAndCol(int row, int col){
        if(row >= 0 && row <=2 && col >= 0 && col <=2){
        }
        else{
            throw new IllegalArgumentException("row or col is not valid input");
        }
    }
    
    /**
     * get value for the position of board
     */
    public int getValue(int row, int col){
        validRowAndCol(row, col);
        List<Integer> curRow = board.get(row);
        return curRow.get(col);
    }
    
    /**
     * get total values sort by from rows, columns,and tilt rows
     */
    public List<Integer> checkValues(){
        List<Integer> values = new ArrayList<>();
        for(List<Integer> row : board){
            int value = 0;
            for(int index : row){
                value += index;
            }
            values.add(value);
        }
        
        for(int col=0; col < board.size(); col++){
            int value = 0;
            for(int row=0; row < board.get(0).size(); row++){
                value += this.getValue(row,col);
            }
            values.add(value);
        }
        
        int value = 0;
        for(int row=0; row < board.get(0).size(); row++){
            value += this.getValue(row,row);
        }
        values.add(value);
        
        value = 0;
        for(int row=0; row < board.get(0).size(); row++){
            value += this.getValue(row,board.get(0).size() - row);
        }
        values.add(value);
        
        return values;
    }
    
    /**
     * check if no steps can be taken anymore
     */
    public boolean allFilled(){
        for(List<Integer> row : board){
            for(int index : row){
                if(index == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * get all available postions which can take step
     */
    public List<List<Integer>> availablePos(){
        List<List<Integer>> positions = new ArrayList<>();
        List<Integer> availablePlace = new ArrayList<>();
        for(int row=0; row < board.get(0).size(); row++){
            for(int col=0; col < board.size(); col++){
                if(this.getValue(row, col) == 0){
                    availablePlace.add(row);
                    availablePlace.add(col);
                    positions.add(availablePlace);
                    availablePlace.clear();
                }
            }
        }
        return positions;
    }
    
    /**
     * fresh the board
     */
    public void newBoard(){
        this.board =  new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(0);
        row.add(0);
        row.add(0);
        this.board.add(row);
        this.board.add(row);
        this.board.add(row);
    }
}
