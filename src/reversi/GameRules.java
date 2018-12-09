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
    UserInput userInput = new UserInput();
    
    private Map map;    
    
    public GameRules(Map map){
        this.map = map;
    }
    
    
    public void processCommand(Command command) {
        switch (command){
            case NORTH:
                flipCoins(-1, 0);
                break;
            case NORTHEAST:
                flipCoins(-1, 1);
                break;
            case EAST:
                flipCoins(0, 1);
                break;
            case SOUTHEAST:
                flipCoins(1, 1);
                break;
            case SOUTH:
                flipCoins(1, 0);
                break;
            case SOUTHWEST:
                flipCoins(1, -1);
                break;
            case WEST:
                flipCoins(0, -1);
                break;
            case NORTHWEST:
                flipCoins(-1, -1);
                break;
            default: 
                break;
        }
    }
    
    private void flipCoins(int x, int y){
        
        int yKord = userInput.getyKord();
        int xKord = userInput.getxKord();
        int player = Reversi.player;
        System.out.println(yKord);
        System.out.println(xKord);
        
//        if(map.map[yKord][xKord] != player | map.map[yKord+(1*x)][xKord+(1+y)] == player | map.map[yKord+(1*x)][xKord+(1*y)] == 0){
 //           System.out.println("Neteisingas ejimas");
  //      }
        
        for (int i = 1; i < map.getHeight(); i++){
            if(map.map[yKord+(i*x)][xKord+(i*y)] != player){
                if(map.map[yKord+(i*x)+1][xKord+(i*y)-1] == 0){
                    map.map[yKord+(i*x)+1][xKord+(i*y)-1] = player;
                            
                    //flip coins
                    for(int j = 1; j <= i; j++){
                        map.map[yKord+(j*x)][xKord+(j*y)] = player;
                    }
                }
            }
        }
    }
}
