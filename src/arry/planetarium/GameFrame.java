package Javayxxm;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lenovo on 2017/6/6.
 */
public class GameFrame extends Frame{
    public void launchFrame(){
        setSize(300,300);
        setLocation(200,200);
        setVisible(true);
        addWindowListener(
            new WindowAdapter() {
              public void windowClosing(WindowEvent e){
                  System.exit(0);
              }
            }
        );

    }

    public static void main(String[] args) {
        GameFrame gf= new GameFrame();
        gf.launchFrame();
    }

}
