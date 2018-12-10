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
                {2,2,2,2,2,0,0,1,1,1},
                {1,2,1,2,1,2,2,1,1,2},
                {1,1,1,1,2,1,1,2,2,2},
                {2,2,2,2,2,2,1,1,2,1},
                {2,2,2,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2},
    };*/
    
        
        public int getHeight() {
		return map.length;
	}
	
	public int getWidth() {
		return map[0].length;
	}
}
