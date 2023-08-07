package com.successdca.actions;

import com.successdca.objects.Grass;

public class SpawnGrassAction extends SpawnEntityAction<Grass> {

    public SpawnGrassAction() {
        spawnRate = 0.2;
    }

    @Override
    Grass createEntity() {
        return new Grass();
    }
}
