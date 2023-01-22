package BitcoinWallet.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import BitcoinWallet.FileManager;

public class MenuListener implements ActionListener {
    public MenuListener() {

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("QUIT")) {
            System.exit(0);
        } else if (e.getActionCommand().equals("OPEN WALLET")) {
            File walletFile = FileManager.openWalletDialog();
        } else if (e.getActionCommand().equals("NEW WALLET")) {
            FileManager.openCreateWalletDialog();
            File walletFile = FileManager.createWalletFile(wallet);
        }
    }
}