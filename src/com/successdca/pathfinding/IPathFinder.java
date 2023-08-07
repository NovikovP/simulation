package com.successdca.pathfinding;

import com.successdca.util.Cell;
import com.successdca.util.CellMap;
import com.successdca.util.Entity;

import java.util.ArrayList;

public interface IPathFinder {
    public ArrayList<Cell> findPath(CellMap map, Cell startCell, Class<? extends Entity> target);
}
