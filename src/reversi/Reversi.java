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
     */  
    public static int player = 1;
    
    public static void main(String[] args) {
        
        Map map = new Map();    

        
        gameRenderer renderer = new gameRenderer(map);
        
        GameRules gameRules = new GameRules(map);
        
        UserInput userInput = new UserInput();
        
        
        
        

        
        
        
        while(true){
            
            renderer.render();
            
            Command command = userInput.getInput();
            int xKord = userInput.getxKord();
            int yKord = userInput.getyKord();
            
            gameRules.processCommand(command, xKord, yKord);
            
            
        }
    }
   
}
