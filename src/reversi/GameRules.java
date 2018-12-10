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
    
    
    public void processCommand(Command command, int xCoord, int yCoord) {
        switch (command){
            case NORTH:
                flipCoins(-1, 0, xCoord, yCoord);
                break;
            case NORTHEAST:
                flipCoins(-1, 1, xCoord, yCoord);
                break;
            case EAST:
                flipCoins(0, 1, xCoord, yCoord);
                break;
            case SOUTHEAST:
                flipCoins(1, 1, xCoord, yCoord);
                break;
            case SOUTH:
                flipCoins(1, 0, xCoord, yCoord);
                break;
            case SOUTHWEST:
                flipCoins(1, -1, xCoord, yCoord);
                break;
            case WEST:
                flipCoins(0, -1, xCoord, yCoord);
                break;
            case NORTHWEST:
                flipCoins(-1, -1, xCoord, yCoord);
                break;
            default: 
                break;
        }
    }
    
    private void flipCoins(int x, int y, int xCoord, int yCoord){
        
        int player = GameRenderer.player;
        
        
        for (int i = 1; i < map.getHeight(); i++){
            Boolean notPlayer = map.map[yCoord][xCoord] != player;
            Boolean nextWindowPlayer = map.map[yCoord+(1*x)][xCoord+(1+y)] == player;
            Boolean nextWindowEmpty = map.map[yCoord+(1*x)][xCoord+(1*y)] == 0;
            
            if(notPlayer | nextWindowPlayer | nextWindowEmpty){
                System.out.println("Neteisingas ejimas");
                break;
            }
            if(map.map[yCoord+(i*x)][xCoord+(i*y)] != player){
                if(map.map[yCoord+(i*x)+x][xCoord+(i*y)+y] == 0){
                    map.map[yCoord+(i*x)+x][xCoord+(i*y)+y] = player;
                            
                    //flip coins
                    for(int j = 1; j <= i; j++){
                        map.map[yCoord+(j*x)][xCoord+(j*y)] = player;
                    }
                    //Change player
                    if (player == 1) {
                        GameRenderer.player = 2;
                    }
                        else if (player == 2) {
                            GameRenderer.player = 1;
                        }
                    
                    break;
                }
            }
        }
    }
}
