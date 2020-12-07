package com.progmatic.labyrinthproject;

import com.progmatic.labyrinthproject.enums.CellType;
import com.progmatic.labyrinthproject.enums.Direction;
import com.progmatic.labyrinthproject.exceptions.CellException;
import com.progmatic.labyrinthproject.exceptions.InvalidMoveException;
import com.progmatic.labyrinthproject.interfaces.Labyrinth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author pappgergely
 */
public class LabyrinthImpl implements Labyrinth {

    public LabyrinthImpl() {

    }

    char[][] maze;

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void loadLabyrinthFile(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            int width = Integer.parseInt(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            char[][] maze = new char[height][width];

            for (int hh = 0; hh < height; hh++) {
                String line = sc.nextLine();
                for (int ww = 0; ww < width; ww++) {
                    switch (line.charAt(ww)) {
                        case 'W':
                            Coordinate c1 = new Coordinate(ww, hh);
                            setCellType(c1, CellType.WALL);
                            maze[hh][ww] = line.charAt(ww);
                            break;
                        case 'E':
                            Coordinate c2 = new Coordinate(ww, hh);
                            setCellType(c2, CellType.EMPTY);
                            maze[hh][ww] = line.charAt(ww);
                            break;
                        case 'S':
                            Coordinate c3 = new Coordinate(ww, hh);
                            setCellType(c3, CellType.START);
                            maze[hh][ww] = line.charAt(ww);
                            break;
                    }
                }
            }
        } catch (FileNotFoundException | NumberFormatException | CellException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public CellType getCellType(Coordinate c) throws CellException {
        return null;
    }

    @Override
    public void setSize(int width, int height) {
    maze = new char[width][height];
    }

    @Override
    public void setCellType(Coordinate c, CellType type) throws CellException {

    }

    @Override
    public Coordinate getPlayerPosition() {
        return null;
    }

    @Override
    public boolean hasPlayerFinished() {
        return false;
    }

    @Override
    public List<Direction> possibleMoves() {
        return null;
    }

    @Override
    public void movePlayer(Direction direction) throws InvalidMoveException {

    }

}
