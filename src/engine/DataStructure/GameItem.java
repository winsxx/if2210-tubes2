/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine.DataStructure;

/**
 *
 * @author Winson
 */
public class GameItem {
    private final String name;
    protected GameItem(String itemName){
        name = itemName;
    }
    public String getName(){
        return name;
    }
}