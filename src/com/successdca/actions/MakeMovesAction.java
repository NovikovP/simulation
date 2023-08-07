package com.successdca.actions;

import com.successdca.util.CellMap;
import com.successdca.util.Entity;
import com.successdca.creatures.Creature;

public class MakeMovesAction extends Action {
    @Override
    public void doAction(CellMap map) {
        Entity[] entities = map.getCells().values().toArray(new Entity[0]);
        for (Entity entity : entities) {
            if (entity instanceof Creature)
                ((Creature) entity).makeMove(map);
        }
    }
}
