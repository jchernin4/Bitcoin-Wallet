package BitcoinWallet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import BitcoinWallet.listeners.MenuListener;

public class Driver {
    private static JPanel panel;
    private static JFrame f;

    private static JMenuBar menuBar;

    private static JMenu fileMenu;
    private static JMenuItem newWalletItem;
    private static JMenuItem openWalletItem;
    private static JMenuItem quitItem;

    public static void main(String[] args) {
        panel = new JPanel();
        f = new JFrame();
        f.setSize(900, 600);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        fileMenu.getAccessibleContext().setAccessibleDescription("File Menu");
        menuBar.add(fileMenu);

        newWalletItem = new JMenuItem("New Wallet");
        fileMenu.add(newWalletItem);
        newWalletItem.addActionListener(new MenuListener());

        openWalletItem = new JMenuItem("Open Wallet");
        fileMenu.add(openWalletItem);
        openWalletItem.addActionListener(new MenuListener());

        quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.setActionCommand("QUIT");
        quitItem.addActionListener(new MenuListener());

        f.add(panel);
        f.setJMenuBar(menuBar);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
