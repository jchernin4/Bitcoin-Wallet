package BitcoinWallet.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CreateWalletListener implements ActionListener {
    public CreateWalletListener() {

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CANCEL")) {
            JButton button = (JButton) e.getSource();
            button.getParent().setEnabled(false);;
        }
    }
}