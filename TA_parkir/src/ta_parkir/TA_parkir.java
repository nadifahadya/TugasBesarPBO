package ta_parkir;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TA_parkir {
    public static void main(String[] args) {
        
        koneksi konek = new koneksi();
        konek.koneksi();
        try 
        {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) 
        {
        }
        new awal().setVisible(true);
    }
    
}
