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
public class Map {
    int map [][] = new int [][] {
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,2,0,0,0,0},
                {0,0,0,0,2,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                
	};

/*int map [][] = new int [][] {
		{1,1,1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1,1,1},
                {2,2,2,2,2,0,2,1,1,1},
                {1,2,1,2,1,2,2,1,1,2},
                {1,1,1,1,2,1,1,2,2,2},
                {2,2,2,2,2,2,1,1,2,1},
                {2,2,2,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2},
                
	};*/
    
        public void printMap() {
        
        System.out.format("     ---------------------%n");
        System.out.format("     |1|2|3|4|5|6|7|8|9|10|%n");
        System.out.format("     ---------------------%n");
        
        for(int i = 0; i < map.length; i++){
            if(i == 9) System.out.format("|" + (i + 1) + "| ");
                else System.out.format("|" + (i + 1) + "|  ");
            for (int j = 0; j < map[0].length; j++){
                System.out.printf("|");
                switch (map[i][j]) {
                    case 1:
                        System.out.printf("W");
                        break;
                    case 2:
                        System.out.printf("B");
                        break;
                    default:
                        System.out.printf(" ");
                        break;
                }
            }
            System.out.printf("|");
            System.out.println("");
        }
    }
        
        public int getHeight() {
		return map.length;
	}
	
	public int getWidth() {
		return map[0].length;
	}
}
