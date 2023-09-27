import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Vector;

public class Arena {
    private List<Walls> walls;
    public List<Coins> coins;
    public int width;
    public int height;
    TextGraphics graphics1;
    Hero hero;

    public Arena(int largura,int altura,TextGraphics graphics){
        width=largura;
        height=altura;
        graphics1=graphics;
        hero = new Hero(15, 15,graphics1);

        this.walls = createWalls();
        this.coins = createCoins();
    }

    private List<Coins> createCoins() {
        ArrayList<Coins> coins = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 5; i++){
            coins.add(new Coins(rand.nextInt(width), rand.nextInt(height), graphics1));
        }
        return coins;
    }

    private List<Walls> createWalls() {
        List<Walls> walls = new ArrayList<>();
        for (int c = 0; c < width+5; c++) {
            walls.add(new Walls(c, 0));
            walls.add(new Walls(c, height - 1));
        }
        for (int r = 1; r < height - 1+5; r++) {
            walls.add(new Walls(0, r));
            walls.add(new Walls(width - 1, r));
        }
        return walls;
    }




    public void pinta(){
        graphics1.setBackgroundColor(TextColor.Factory.fromString("#1a1a00"));
        graphics1.fillRectangle(new TerminalPosition(1, 1), new
                TerminalSize(width+1, height+1), ' ');
        for (Walls wall : walls)
            wall.draw(graphics1);
        for (Coins coin : coins)
            coin.pinta_coin();
    }
}
