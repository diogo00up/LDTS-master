import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.ArrayList;
import java.util.List;

public class Walls {
    public int x;
    public int y;

    public Walls(int x1,int y1){
        x=x1;
        y=y1;
    }

    public void draw(TextGraphics graphics1){
        graphics1.setBackgroundColor(TextColor.Factory.fromString("#00C7FF"));
        graphics1.fillRectangle(new TerminalPosition(x, y), new TerminalSize(x+1, y+1), ' ');
        graphics1.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
    }
}
