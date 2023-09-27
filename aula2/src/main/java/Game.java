import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.List;


public class Game {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        TextGraphics graphics = screen.newTextGraphics();


        private int fecha=0;
        Arena arena = new Arena(100,50,graphics);

    public Game() throws IOException {
        screen.setCursorPosition(null); // we don't need a
        screen.startScreen(); // screens must be


    }

    private void processKey(KeyStroke key) throws IOException {
        System.out.println(key);

        if(key.getKeyType() == KeyType.ArrowUp){
            System.out.println("IF FUNCIONA");
            if (arena.hero.gety()-1 > 0)
                arena.hero.move_down();  //estou aquiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii

        }
        if(key.getKeyType() == KeyType.ArrowDown){
            System.out.println("IF FUNCIONA");
            if (arena.hero.gety()+1+1 < arena.height)
                arena.hero.move_up();
        }
        if(key.getKeyType() == KeyType.ArrowLeft){
            System.out.println("IF FUNCIONA");
            if (arena.hero.getx()-1 > 0)
                arena.hero.move_left();

        }
        if(key.getKeyType() == KeyType.ArrowRight){
            System.out.println("IF FUNCIONA");
            if (arena.hero.getx()+2 < arena.width)
                arena.hero.move_right();

        }
        if (key.getKeyType() == KeyType.Character &&
                key.getCharacter() == 'q'){
                screen.close();
                fecha=1;
        }


    }



    private void draw() throws IOException {
        screen.doResizeIfNecessary(); // resize screen
        screen.clear();
        arena.pinta();
        arena.hero.pinta_hero();
        //arena.coin.pinta_coin();







        screen.refresh();
        KeyStroke key = screen.readInput();
        processKey(key);
    }

    public void run() throws IOException {
        while(true){
            draw();
            System.out.println("loop");
            if(fecha==1){
                System.out.println(" \"Process\n" +
                        "finished with exit code 0");
                break;
            }
        }


    }

    public static void main(String[] args) throws IOException {
        Game game1 = new Game();
        game1.run();

    }
}
