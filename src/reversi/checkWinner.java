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
public class checkWinner {
            
            Map map = new Map();
            
            int quit = 0;
            int white = 0;
            int black = 0;
            
            public void getWinner(){
            for(int i = 0; i < map.getHeight(); i++){
                for (int j = 0; j < map.getWidth(); j++){
                    if (map.map[i][j] > 0) quit++;
                    if (map.map[i][j] == 1) white++;
                    if (map.map[i][j] == 2) black++;
                }
            }
            if(quit == 100){
                if(white > black){
                  System.out.println("Laimejo 1 zaidejas: " + white + " - " + black);  
                }
                if(black > white){
                    System.out.println("Laimejo 2 zaidejas: " + black + " - " + white);
                }
            }
}
}
