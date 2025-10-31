import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Flappy Bird Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JButton playBtn = new JButton("Play Game");
        JButton exitBtn = new JButton("Exit");

        playBtn.addActionListener(e -> {
            dispose();
            App.main(null);
        });

        exitBtn.addActionListener(e -> System.exit(0));

        JPanel panel = new JPanel();
        panel.add(playBtn);
        panel.add(exitBtn);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
