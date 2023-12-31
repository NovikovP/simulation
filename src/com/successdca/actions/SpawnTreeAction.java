package com.successdca.actions;

import com.successdca.objects.Tree;

public class SpawnTreeAction extends SpawnEntityAction<Tree> {

    public SpawnTreeAction() {
        this.spawnRate = 0.07;
    }

    @Override
    Tree createEntity() {
        return new Tree();
    }
}
