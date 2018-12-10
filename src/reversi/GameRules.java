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
public class GameRules {
 
    private Map map;    
    
    public GameRules(Map map){
        this.map = map;
    }
    
    
    public void processCommand(Command command, int xKord, int yKord) {
        switch (command){
            case NORTH:
                flipCoins(-1, 0, xKord, yKord);
                break;
            case NORTHEAST:
                flipCoins(-1, 1, xKord, yKord);
                break;
            case EAST:
                flipCoins(0, 1, xKord, yKord);
                break;
            case SOUTHEAST:
                flipCoins(1, 1, xKord, yKord);
                break;
            case SOUTH:
                flipCoins(1, 0, xKord, yKord);
                break;
            case SOUTHWEST:
                flipCoins(1, -1, xKord, yKord);
                break;
            case WEST:
                flipCoins(0, -1, xKord, yKord);
                break;
            case NORTHWEST:
                flipCoins(-1, -1, xKord, yKord);
                break;
            default: 
                break;
        }
    }
    
    private void flipCoins(int x, int y, int xKord, int yKord){
        
        int player = GameRenderer.player;
        
        for (int i = 1; i < map.getHeight(); i++){
            if(map.map[yKord][xKord] != player | map.map[yKord+(1*x)][xKord+(1+y)] == player | map.map[yKord+(1*x)][xKord+(1*y)] == 0){
                System.out.println("Neteisingas ejimas");
                break;
            }
            if(map.map[yKord+(i*x)][xKord+(i*y)] != player){
                if(map.map[yKord+(i*x)+x][xKord+(i*y)+y] == 0){
                    map.map[yKord+(i*x)+x][xKord+(i*y)+y] = player;
                            
                    //flip coins
                    for(int j = 1; j <= i; j++){
                        map.map[yKord+(j*x)][xKord+(j*y)] = player;
                    }
                    //Change player
                    if (player == 1) GameRenderer.player = 2;
                        else if (player == 2) GameRenderer.player = 1;
                    
                    break;
                }
            }
        }
    }
}
