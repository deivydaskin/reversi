/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversi;

import static reversi.Reversi.player;

/**
 *
 * @author Deivydas
 */
public class gameRenderer {
    
    private final Map map;
    
    public gameRenderer(Map map){
        this.map = map;
    }
    
    
    public void render(){
        map.printMap();
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
        
        
    }
}
