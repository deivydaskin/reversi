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
    
    private Scanner keyboard = new Scanner(System.in);
        
    
    private int xCoord;
    private int yCoord;

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    
    public Command getInput(){
        String k = keyboard.nextLine();   
        return getCommand(k);
    }
    
    public Command getCommand(String k){           
            String[] parts = k.split(" ");
            xCoord = Integer.parseInt(parts[1])-1;
            yCoord = Integer.parseInt(parts[0])-1;

            String test = parts[2];
            
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
