package pkg;

import java.awt.*;
import java.awt.event.*;

public class Start {

    public static void main(String[] args) {
        final Frame f = new Frame("Window Adapter");//make it final
        f.setSize(300, 250);//width, height
        f.setVisible(true);//show
        //adapter class, unlike interface, no need to define all methods.
        WindowAdapter wa = new WindowAdapter() {//annonymous adapter class
            //frame's x-close button was clicked
            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Closing frame ...");
                f.dispose();//destroy frame object/instance
            }

            //frame instance/object being destroyed
            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("Frame closed ...");
            }
        };
        f.addWindowListener(wa);//attach window adapter handler to frame
    }
}
