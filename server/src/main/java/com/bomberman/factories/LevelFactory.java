package com.bomberman.factories;

import com.bomberman.constants.MapConst;
import com.bomberman.entities.Position;
import com.bomberman.entities.Wall;
import com.bomberman.game.GameState;

public class LevelFactory {

  private static final int WIDTH = 15;
  private static final int HEIGHT = 11;

  private final int[][] level = // 15x11
      new int[][] {
        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
      };

  public GameState createLevel() {
    final GameState gameState = new GameState();
    for (int y = 0; y < HEIGHT; y++) {
      for (int x = 0; x < WIDTH; x++) {
        final float height = HEIGHT - y - 1;
        final Position position =
            new Position(x * MapConst.TEXTURE_SIZE, height * MapConst.TEXTURE_SIZE);
        switch (level[y][x]) {
          case 1:
            gameState.getWalls().add(new Wall(position));
            break;
        }
      }
    }
    return gameState;
  }
}