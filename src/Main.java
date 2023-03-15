import javax.swing.*;
import java.awt.*;
import static java.awt.Toolkit.getDefaultToolkit;
public class Main {
    public static void main(String[] args) {
        settingWindowForVariant7(new JFrame(), 600);
        new Window();
    }
    public static void settingWindowForVariant7(JFrame window) {
        settingWindowForVariant7(window, 0);
    }
    public static void settingWindowForVariant7(JFrame window, int leftField) {
        Dimension screenSize = getDefaultToolkit().getScreenSize();
        window.setTitle("Нижнє праве вікно");
        window.setSize(600, 700);
        window.setLocation(screenSize.width - window.getWidth() - leftField, screenSize.height - window.getHeight());
        window.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        window.setFocusableWindowState(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        Panel info = getInfoForVariant7(window);
        window.add(info);
        info.revalidate();
    }
    public static Panel getInfoForVariant7(JFrame window) {
        Dimension dimension = window.getSize();
        Point location = window.getLocation();
        Panel panel = new Panel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Location: x - " + location.x + " y - " + location.y));
        panel.add(new JLabel("Title: " + window.getTitle()));
        panel.add(new JLabel("State: " + window.getCursor().getName()));
        return panel;
    }
}