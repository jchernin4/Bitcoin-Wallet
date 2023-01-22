package BitcoinWallet;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import BitcoinWallet.listeners.CreateWalletListener;

public class FileManager {
    private static File saveDir = new File(System.getProperty("user.home") + "\\Local Settings\\Application Data" + "\\InfiniumWallet");

    public static File openWalletDialog() {
        if (!saveDir.exists()) saveDir.mkdir();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(saveDir);
        FileFilter walletFileFilter = new FileFilter() {
            public String getDescription() {
                return "Wallet Files (*.wallet)";
            }
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(".wallet");
            }
        };
        fileChooser.setFileFilter(walletFileFilter);
        int result = fileChooser.showOpenDialog(fileChooser);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public static void openCreateWalletDialog() {
        JFrame frame = new JFrame("Create Wallet");
        frame.setSize(200, 200);

        JLabel nameLabel = new JLabel("Wallet Name:");
        JTextField nameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(10);

        JButton createButton = new JButton("Create Wallet");
        createButton.setActionCommand("CREATE WALLET");
        createButton.addActionListener(new CreateWalletListener());

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("CANCEL");
        cancelButton.addActionListener(new CreateWalletListener());
    }

    public static void createWalletFile(File wallet) {

    }

    public static void saveWalletFile(File wallet) {

    }

    public static void openWalletFile(File wallet) {
        
    }
}