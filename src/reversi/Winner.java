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
public class Winner extends GameEnd {

    public Winner(Map map) {
        super(map);
    }
        private int white = getWhite();
        private int black = getBlack();

        public int getWinner(){
            if(white > black){
                    System.out.println("Laimejo 1 zaidejas: " + white + " - " + black);
                    return white;
            }
            if(black > white){
                System.out.println("Laimejo 2 zaidejas: " + black + " - " + white);
                return black;
            }
        return white;
        }
}
