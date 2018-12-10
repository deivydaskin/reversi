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
public class GameRenderer {
    
    private final Map map;
    public static int player = 1;
    
    public GameRenderer(Map map){
        this.map = map;
    }
    
    
    public void render(){
        
        System.out.format("     ---------------------%n");
        System.out.format("     |1|2|3|4|5|6|7|8|9|10|%n");
        System.out.format("     ---------------------%n");
        
        for(int i = 0; i < map.getHeight(); i++){
            if(i == 9) System.out.format("|" + (i + 1) + "| ");
                else System.out.format("|" + (i + 1) + "|  ");
            for (int j = 0; j < map.getWidth(); j++){
                System.out.printf("|");
                switch (map.map[i][j]) {
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
        
        System.out.println("Pasirinkti nuo kurio langelio pradeti ejima ('yKord xKord veiksmas'):\n" +
                                "Veiksmai:\n" +
                                "'n'  // north\n" +
                                "'ne' // north-east\n" +
                                "'e'  // east\n" +
                                "'se' // south-east\n" +
                                "'s'  // south\n" +
                                "'sw' // south-west\n" +
                                "'w'  // west\n" +
                                "'nw' // north-west\n" +
                                player + " zaidejas\n");
        
        
    }
}
