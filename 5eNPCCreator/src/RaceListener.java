
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.*;

public class RaceListener implements DocumentListener {
    private JTextField textField1;
    private JTextField textField2;
    
    
    public RaceListener(JTextField textField, JTextField textField2) {
        this.textField1 = textField;
        this.textField2 = textField2;
    }

    public void insertUpdate(DocumentEvent e) {
        updateAb(e);
    }
    public void removeUpdate(DocumentEvent e) {
        updateAb(e);
    }
    public void changedUpdate(DocumentEvent e) {
        updateAb(e);
    }

    public void updateAb(DocumentEvent e) {
        //TODO: Add all races.
        try{
            if (textField1.getText().equals("Human")){
                //Set speed
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Elf")){
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Dwarf")){
                textField2.setText("  25");
            }
            else if (textField1.getText().equals("Gnome")){
                textField2.setText("  25");
            }
            else if (textField1.getText().equals("Half-Elf")){
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Half-Orc")){
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Dragonborn")){
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Tiefling")){
                textField2.setText("  30");
            }
            else if (textField1.getText().equals("Halfling")){
                textField2.setText("  30");
            }
            else{
                textField2.setText("N/A");
            }
        }
        catch (Exception ex){
            if (textField1.getText().equals("")){
                textField2.setText("");
            }
            else{
                textField2.setText("N/A");
            }
        }
    }
}
