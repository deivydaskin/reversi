/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversi;
/**
 *
 * @author Deivydas
 */
public class Reversi {

    /**
     * @param args
     */  
    
    public static void main(String[] args) {
        
        Map map = new Map();    
        
        GameRenderer renderer = new GameRenderer(map);        
        GameRules gameRules = new GameRules(map);        
        UserInput userInput = new UserInput();
        GameEnd gameEnd = new GameEnd(map);
        
        while(true){
            
            renderer.render();
            
            if(gameEnd.isGameOver()){
                gameEnd.getWinner();
                gameEnd.exit();
            }
            
            Command command = userInput.getInput();
            int xKord = userInput.getxKord();
            int yKord = userInput.getyKord();
            
            gameRules.processCommand(command, xKord, yKord);
            
            
        }
    }
   
}
