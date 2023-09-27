import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Application {
        public static void main(String[] args) {
            //System.out.println("Hello Worldwiiiiiiiiiiiiiiiiiii!");
            try {

                Terminal terminal = new DefaultTerminalFactory().createTerminal();
                Screen screen = new TerminalScreen(terminal);
                screen.setCursorPosition(null); // we don't need a
                screen.startScreen(); // screens must be

                screen.doResizeIfNecessary(); // resize screen
                screen.clear();
                screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')[0]);
                screen.refresh();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

