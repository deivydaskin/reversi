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
public class GameEnd {
            
            private Map map; 
            private int quit = 0;
            private int white = 0;
            private int black = 0;
    
            public GameEnd(Map map){
                this.map = map;
                           
            }
            
            public boolean isGameOver(){
                for(int i = 0; i < map.getHeight(); i++){
                    for (int j = 0; j < map.getWidth(); j++){
                        if (map.map[i][j] > 0) quit++;
                        if (map.map[i][j] == 1) white++;
                        if (map.map[i][j] == 2) black++;
                    }
                }
                if(quit < 100){
                    quit = 0;
                    white = 0;
                    black = 0;
                }
                return quit == 100;
            }
            
            public void exit(){
                System.exit(0);
            } 

            public void getWinner(){          
                    if(white > black){
                    System.out.println("Laimejo 1 zaidejas: " + white + " - " + black);  
                    }
                    if(black > white){
                        System.out.println("Laimejo 2 zaidejas: " + black + " - " + white);
                    }
            }
}
