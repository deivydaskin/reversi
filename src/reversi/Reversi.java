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
            
            gameRules.processCommand(command);
            
            if (player == 1) player = 2;
                else if (player == 2) player = 1;
        }
    }
   
}
