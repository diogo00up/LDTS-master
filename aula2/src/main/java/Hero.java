import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Hero {

    public Position position = new Position();
    TextGraphics graphics;
    public Hero(int x1,int y1,TextGraphics graphics1){
            position.x=x1;
            position.y=y1;
            graphics=graphics1;
            //x=x1;
            //y=y1;
    }

    public void move_right(){
        position.x= position.x+1;
        //x=x+1;

    }

    public void pinta_hero(){
        graphics.setForegroundColor(TextColor.Factory.fromString("#BB5353"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.x, position.y), "X");
    }


    public void move_left(){
        position.x= position.x-1;
        //x=x-1;

    }

    public void move_up(){
        position.y= position.y+1;
        //y=y+1;

    }

    public void move_down(){
        position.y= position.y-1;
        //y=y-1;
    }


    public int getx(){
        return position.x;
    }

    public int gety(){return position.y;}

    public void setX(int x1){position.x=x1;}
    public void setY(int y1){position.y=y1;}
}
