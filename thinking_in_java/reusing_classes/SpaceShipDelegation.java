package org.fmz.reuse;

import org.fmz.reuse.SpaceShipControls;

public class SpaceShipDelegation{
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String s){
        name = s;
    }

    public void up(int velocity){
        controls.up(velocity);
    }

    public static void main(String args[]){
        SpaceShipDelegation ss = new SpaceShipDelegation("Sun");
        ss.up(100);
    }
}
