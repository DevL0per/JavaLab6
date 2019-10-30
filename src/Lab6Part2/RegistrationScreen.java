package Lab6Part2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class RegistrationScreen extends Frame implements ActionListener, WindowListener {

    private TextField nameTextField;
    private TextField surnameTexField;
    private TextField emailTextField;
    private TextField passwordTextField;

    private List genderList;
    private TextArea aboutYourselfTextArea;

    private Button button;

    public RegistrationScreen() {
        super("Регистрация пользователя");
        setLayout(null);
        setSize(400, 600);
        addWindowListener(this);

        Label mainLabel = new Label("Регистрация");
        mainLabel.setBounds(160, 30, 100, 20);

        nameTextField = new TextField();
        surnameTexField = new TextField();
        passwordTextField = new TextField();
        emailTextField = new TextField();

        configureTextField(nameTextField, 60, "Имя");
        configureTextField(surnameTexField, 100, "Фамилия");
        configureTextField(passwordTextField, 140, "Пароль");
        configureTextField(emailTextField, 180, "Email");

        configureGenderList();
        configureTextArea();
        configureButton();

        add(mainLabel);
    }

    private void configureButton() {
        button = new Button("Зарегистрироваться");
        button.setBounds(125, 440, 140, 20);
        button.addActionListener(this);
        add(button);
    }

    private void configureGenderList() {
        Label genderLabel = new Label("Пол: ");
        genderLabel.setBounds(10, 220, 35, 20);
        add(genderLabel);

        genderList = new List(2);
        genderList.setBounds(72, 220, 80, 40);
        genderList.add("Жен.");
        genderList.add("Муж.");
        add(genderList);
    }

    private void configureTextArea() {
        Label aboutYourselfLabel = new Label("о себе");
        aboutYourselfLabel.setBounds(176, 285, 60, 20);
        add(aboutYourselfLabel);

        aboutYourselfTextArea = new TextArea();
        aboutYourselfTextArea.setBounds(50, 315, 300, 100);
        add(aboutYourselfTextArea);
    }

    private void configureTextField(TextField textField, int y, String text) {
        textField.setBounds(72, y, 300, 20);
        Label label = new Label(text);
        label.setBounds(10, y, 60, 20);
        add(textField);
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!(nameTextField.getText().trim().isEmpty()) && !(surnameTexField.getText().trim().isEmpty()) &&
                !(emailTextField.getText().trim().isEmpty()) && !(passwordTextField.getText().trim().isEmpty())) {
            System.out.println("kek");
        } else {
            MyDialog myDialog = new MyDialog(this, "Ошибка", true, "Данные заполнены некорректно");
            myDialog.setVisible(true);
        }

    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

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
