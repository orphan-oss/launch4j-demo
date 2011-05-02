package pl.org.lenart.launch4j;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public static void main(String[] args) {
        App app = new App();
        app.sayHello();
    }

    public App() throws HeadlessException {
        setVisible(false);
    }

    private void sayHello() {
        JOptionPane.showMessageDialog(this, "Hello world!", "Hello", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

}
