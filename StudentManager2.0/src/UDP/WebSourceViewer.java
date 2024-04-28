package UDP;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.net.*;

public class WebSourceViewer extends JFrame {
    private JTextField urlTextField;
    private JTextArea sourceTextArea;
    private JScrollPane scrollPane;

    public WebSourceViewer() {
        super("Web Source Viewer");
        initializeComponents();
        setUpLayout();
        addEventHandlers();
    }

    private void initializeComponents() {
        urlTextField = new JTextField(30);
        sourceTextArea = new JTextArea(20, 60);
        sourceTextArea.setEditable(false);
        scrollPane = new JScrollPane(sourceTextArea);
    }

    private void setUpLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(urlTextField, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null); // Center the window
        this.setVisible(true);
    }

    private void addEventHandlers() {
        // Listener for the text field to react when the Enter key is pressed
        urlTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadWebSource(urlTextField.getText());
            }
        });
    }

    // This method is called when the user presses Enter after entering a URL
    private void loadWebSource(String urlString) {
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                sourceTextArea.setText("");
                String line;
                while ((line = reader.readLine()) != null) {
                    sourceTextArea.append(line + "\n");
                }
            } catch (IOException ex) {
                sourceTextArea.setText("Error reading from URL: " + ex.getMessage());
            }
        } catch (MalformedURLException ex) {
            sourceTextArea.setText("Malformed URL: " + ex.getMessage());
        } catch (IOException ex) {
            sourceTextArea.setText("IOException: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WebSourceViewer();
            }
        });
    }
}

