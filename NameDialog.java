import javax.swing.JOptionPane; // Import the class for GUI dialogs

public class NameDialog {
    
    public static void main(String[] args) {
        
       
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("welcome,%s",name);
        JOptionPane.showMessageDialog(null, message);

    }
}