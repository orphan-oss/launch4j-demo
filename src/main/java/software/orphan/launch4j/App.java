package software.orphan.launch4j;

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
        String name = System.getProperty("name");
        if (name == null) {
            name = "world";
        }
        JOptionPane.showMessageDialog(this, String.format("Hello %s!", name), "Hello", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

}
