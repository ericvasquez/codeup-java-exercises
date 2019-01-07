import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        //uses two lines of code to print message on  a single line instead of one
        System.out.print("Hello, ");
        System.out.println("World!");

        //prints message in popup
        JOptionPane.showMessageDialog(null, "Hello, World!");
    }
}
