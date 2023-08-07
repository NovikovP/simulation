package com.successdca.actions;

import com.successdca.util.Cell;
import com.successdca.util.CellMap;
import com.successdca.util.Entity;

public abstract class SpawnEntityAction<T extends Entity> extends Action {
    // класс абстрактного действия по созданию новой сущности
    double spawnRate;

    @Override
    public void doAction(CellMap map) {

        double rateDelta = 1.0 / (map.getHeight() * map.getWidth());
        double rate = 0;

        while (rate < spawnRate) {
            Cell cell = map.getRandomEmptyCell();

            if (cell == null) {
                System.out.println("Impossible to spawn entity");
                break;
            }

            map.add(cell, createEntity());
            rate += rateDelta;
        }
    }

    abstract T createEntity();
}
