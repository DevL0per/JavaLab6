package Lab6Part2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyDialog extends Dialog implements WindowListener, ActionListener {

    Label label;
    Button button;

    public MyDialog(Frame parent, String title, boolean mode, String textForLabel) {
        super(parent, title, mode);
        setLayout(null);
        setSize(300, 220);
        addWindowListener(this);

        label = new Label("<html>" + textForLabel + "</html>");
        label.setBounds(100, 80, 130, 30);
        label.setAlignment(Label.CENTER);
        add(label);

        button = new Button("Ok");
        button.setBounds(130, 140, 50, 30);
        button.addActionListener(this);
        add(button);
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

    @Override
    public void actionPerformed(ActionEvent actionEvent) { this.dispose(); }
}

