package lab6;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyDialog extends Dialog implements WindowListener {

    Label label;

    public MyDialog(Frame parent, String title, boolean mode, String textForLabel) {
        super(parent, title, mode);
        setLayout(null);
        setSize(300, 220);
        addWindowListener(this);

        label = new Label(textForLabel);
        label.setBounds(10, 15, 280, 200);

        label.setText("<html>" + textForLabel + "</html>");
        add(label);
    }


    @Override
    public void windowOpened(WindowEvent windowEvent) { }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) { }

    @Override
    public void windowIconified(WindowEvent windowEvent) { }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) { }

    @Override
    public void windowActivated(WindowEvent windowEvent) { }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) { }
}
