package us.pinglesaur.BookKeeper;

import java.awt.*;
import javax.swing.*;

public class BookKeeper {

    public static void main(String[] args) {
        
        // Search Tab.
        JPanel tabSearch = new JPanel();
        
        // Check Out Tab.
        JPanel tabCheckOut = new JPanel();
        
        // Check In Tab.
        JButton barcodeEnter = new JButton("Enter");
        JTextField barcodeInput = new JTextField();
        
        JPanel layoutCheckInBarcodeInput = new JPanel();
        layoutCheckInBarcodeInput.setLayout(new BoxLayout(layoutCheckInBarcodeInput, BoxLayout.X_AXIS));
        layoutCheckInBarcodeInput.add(barcodeInput);
        layoutCheckInBarcodeInput.add(barcodeEnter);
        
        JList<String> listCheckIn = new JList<String>();
        
        JPanel tabCheckIn = new JPanel();
        tabCheckIn.setLayout(new BorderLayout(5, 5));
        tabCheckIn.add(layoutCheckInBarcodeInput, BorderLayout.NORTH);
        tabCheckIn.add(listCheckIn, BorderLayout.CENTER);
        
        // Set up the tab selector and main window.
        JTabbedPane tabLayout = new JTabbedPane();
        tabLayout.add("Search", tabSearch);
        tabLayout.add("Check Out", tabCheckOut);
        tabLayout.add("Check In", tabCheckIn);
        
        JFrame mainWindow = new JFrame("Book Keeper");
        mainWindow.add(tabLayout);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(1000, 600);
        mainWindow.setVisible(true);
    }
}
