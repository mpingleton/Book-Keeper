package us.pinglesaur.BookKeeper;

import javax.swing.*;

public class BookKeeper {

    public static void main(String[] args) {
        
        JPanel tabSearch = new JPanel();
        JPanel tabCheckOut = new JPanel();
        JPanel tabCheckIn = new JPanel();
        
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
