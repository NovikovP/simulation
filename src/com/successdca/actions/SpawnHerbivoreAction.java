package com.successdca.actions;

import com.successdca.creatures.Herbivore;

public class SpawnHerbivoreAction extends SpawnEntityAction<Herbivore> {

    public SpawnHerbivoreAction() {
        this.spawnRate = 0.07;
    }

    @Override
    Herbivore createEntity() {
        return new Herbivore();
    }
}
