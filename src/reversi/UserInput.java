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
public class UserInput {
    
    
    Map map = new Map();
    
    private Scanner klava = new Scanner(System.in);
        
    
    private int xKord;
    private int yKord;

    public int getxKord() {
        return xKord;
    }

    public int getyKord() {
        return yKord;
    }

    
    public Command getInput(){
        String k = klava.nextLine();   
        return getCommand(k);
    }
    
    public Command getCommand(String k){           
            String[] dalys = k.split(" ");
            xKord = Integer.parseInt(dalys[1])-1;
            yKord = Integer.parseInt(dalys[0])-1;

            String test = dalys[2];
            
            switch(test){
                case "n":
                    return Command.NORTH;    
                case "ne":
                    return Command.NORTHEAST;
                case "e":
                    return Command.EAST;
                case "se":
                   return Command.SOUTHEAST;
                case "s":
                    return Command.SOUTH;
                case "sw":
                    return Command.SOUTHWEST;
                case "w":
                    return Command.WEST;
                case "nw":
                    return Command.NORTHWEST;
                default:
                    return Command.NOTHING;
            }    
    }
}
