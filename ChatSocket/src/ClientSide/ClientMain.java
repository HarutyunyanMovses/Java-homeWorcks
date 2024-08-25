package ClientSide;

import javax.swing.*;

public class
ClientMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingClient("localhost", 3030));
        SwingUtilities.invokeLater(() -> new SwingClient("localhost", 3030));

    }
}
