import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coins {
    public Position position = new Position();
    TextGraphics graphics;
    public Coins(int x1,int y1,TextGraphics graphics1){
        position.x=x1;
        position.y=y1;
        graphics=graphics1;

    }
    public void pinta_coin(){
        graphics.setForegroundColor(TextColor.Factory.fromString("#ffff00"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.x, position.y), "O");
    }

}
