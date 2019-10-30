package lab6;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class myList extends Frame implements ItemListener, WindowListener {

    private List list;
    private Label listLabel;
    private MyDialog myDialog = null;

    public myList(String[] items) {
        super("Часть 1");
        setLayout(null);
        setSize(600, 400);
        addWindowListener(this);

        list = new List(4, true);
        list.addItemListener(this);
        list.setBounds(250, 250, 100, 120);
        addElementsInList(items);

        listLabel = new Label();
        listLabel.setBounds(250, 100, 100, 40);

        add(list);
        add(listLabel);

    }

    private void addElementsInList(String[] items) {
        for (int number = 0; number < items.length; number++) {
            list.add(items[number]);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        String[] items = list.getSelectedItems();
        listLabel.setText("");
        for (int number = 0; number < items.length; number++) {
            listLabel.setText(listLabel.getText() + " " + items[number]);
        }

        if (listLabel.getText().length() > 100 && myDialog == null) {
            myDialog = new MyDialog(this, "диалоговое окно", false, listLabel.getText());
            myDialog.setVisible(true);
        }
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
