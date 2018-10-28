/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversi;

import java.util.Scanner;

/**
 *
 * @author Deivydas
 */
public class Reversi {

    /**
     * @param args the command line arguments
     */    
    /*public static int map [][] = new int [][] {
		{1,1,1,1,1,1,1,1,1,1},
		{1,1,1,2,1,2,2,2,1,1},
		{2,2,1,2,2,2,1,2,1,2},
                {2,2,2,2,2,1,1,1,1,1},
                {1,1,1,1,1,2,2,2,2,2},
                {1,1,1,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2,2,2},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,2},
                {1,1,1,1,1,1,1,1,1,0},
                
	};*/
    public static int map [][] = new int [][] {
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
    public static void main(String[] args) {
        
        int player = 1;
        
        printMap();
        Scanner klava = new Scanner(System.in);
        while(true){
            System.out.println("Pasirinkti nuo kurio langelio pradeti ejima ('yKord xKord veiksmas'):\n" +
                                player + " zaidejas\n"+
                                "'n'  // north\n" +
                                "'ne' // north-east\n" +
                                "'e'  // east\n" +
                                "'se' // south-east\n" +
                                "'s'  // south\n" +
                                "'sw' // south-west\n" +
                                "'w'  // west\n" +
                                "'nw' // north-west\n");
                        
            String k = klava.nextLine();
            String[] dalys = k.split(" ");
            
            int yKord = Integer.parseInt(dalys[0])-1;
            int xKord = Integer.parseInt(dalys[1])-1;
            String test = dalys[2];
            
            switch(test){
                case "n":
                        if(map[yKord][xKord] != player | map[yKord-1][xKord] == player | map[yKord-1][xKord] == 0){
                            System.out.println("Neteisingas ejimas");
                            break;
                        }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord-i][xKord] != player){
                            if(map[yKord-i][xKord] == player) break;
                            if(map[yKord-i-1][xKord] == 0){
                                map[yKord-i-1][xKord] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord-j][xKord] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "ne":
                    if(map[yKord][xKord] != player | map[yKord-1][xKord+1] == player | map[yKord-1][xKord+1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord-i][xKord+i] != player){
                            if(map[yKord-i-1][xKord+i+1] == 0){
                                map[yKord-i-1][xKord+i+1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord-j][xKord+j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "e":
                    if(map[yKord][xKord] != player | map[yKord][xKord+1] == player | map[yKord][xKord+1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord][xKord+i] != player){
                            if(map[yKord][xKord+i+1] == 0){
                                map[yKord][xKord+i+1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord][xKord+j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "se":
                    if(map[yKord][xKord] != player | map[yKord+1][xKord+1] == player | map[yKord+1][xKord+1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord+i][xKord+i] != player){
                            if(map[yKord+i+1][xKord+i+1] == 0){
                                map[yKord+i+1][xKord+i+1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord+j][xKord+j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "s":
                    if(map[yKord][xKord] != player | map[yKord+1][xKord] == player | map[yKord+1][xKord] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord+i][xKord] != player){
                            if(map[yKord+i+1][xKord] == 0){
                                map[yKord+i+1][xKord] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord+j][xKord] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "sw":
                    if(map[yKord][xKord] != player | map[yKord+1][xKord-1] == player | map[yKord+1][xKord-1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord+i][xKord-i] != player){
                            if(map[yKord+i+1][xKord-i-1] == 0){
                                map[yKord+i+1][xKord-i-1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord+j][xKord-j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "w":
                    if(map[yKord][xKord] != player | map[yKord][xKord-1] == player | map[yKord][xKord-1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord][xKord-i] != player){
                            if(map[yKord][xKord-i-1] == 0){
                                map[yKord][xKord-i-1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord][xKord-j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
                case "nw":
                    if(map[yKord][xKord] != player | map[yKord-1][xKord-1] == player | map[yKord-1][xKord-1] == 0){
                        System.out.println("Neteisingas ejimas");
                        break;
                    }
                    //check for move legallity
                    for (int i = 1; i < map.length; i++){
                        if(map[yKord-i][xKord-i] != player){
                            if(map[yKord-i-1][xKord-i-1] == 0){
                                map[yKord-i-1][xKord-i-1] = player;
                            
                                //flip coins
                                for(int j = 1; j <= i; j++){
                                    map[yKord-j][xKord-j] = player;
                                }
                            
                                //print map
                                printMap();
                            
                                //change players
                                if (player == 1) player = 2;
                                else if (player == 2) player = 1;

                                break;
                            }
                        }                     
                    }
                    break;
            }    
            int quit = 0;
            int white = 0;
            int black = 0;
            for(int i = 0; i < map.length; i++){
                for (int j = 0; j < map[0].length; j++){
                    if (map[i][j] > 0) quit++;
                    if (map[i][j] == 1) white++;
                    if (map[i][j] == 2) black++;
                }
            }
            if(quit == 100){
                if(white > black){
                  System.out.println("Laimejo 1 zaidejas: " + white + " - " + black);  
                }
                if(black > white){
                    System.out.println("Laimejo 2 zaidejas: " + black + " - " + white);
                }
                break;
            }
        }
        
    }
    

    private static void printMap() {
        
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
    
}
