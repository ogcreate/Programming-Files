import javax.swing.*;
import java.awt.*;

public class ResizableNotepad {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Notepad");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            
            JTextArea textArea = new JTextArea();
            textArea.setLineWrap(true);  // Enables line wrapping
            textArea.setWrapStyleWord(true);  // Wraps at word boundaries

            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
