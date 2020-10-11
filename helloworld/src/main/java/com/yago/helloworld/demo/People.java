package com.yago.helloworld.demo;

public class People {

    public  String name;
    public String surname;
    public String work;

    private  int energy = 100;

    public boolean isTired(){
        if (energy < 50){
            return true;
        }else{
            return false;
        }
    }
    public void reloadEnergy(int energyReceived){
        energy = energyReceived + energy;
    }
    public void run (int spendEnergy){
        energy = energy - spendEnergy;
    }
    public int getEnergy(){
        return energy;
    };
}

