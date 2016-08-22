package org.fmz.reuse;

public class SpaceShip{
    private String name;
    public SpaceShipControls controls = new SpaceShipControls();
    public SpaceShip(String s){
        name = s;
    }

    public static void main(String args[]){
        SpaceShip ss = new SpaceShip("Sun");
        ss.controls.up(100);
    }
}
