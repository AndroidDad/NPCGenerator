
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.*;

public class AbilityScoreListener implements DocumentListener {
    
    private JTextField textField;
    private JFormattedTextField formattedTextField;
    
    
    public AbilityScoreListener(JTextField textField, JFormattedTextField formattedTextField){
        this.textField = textField;
        this.formattedTextField = formattedTextField;
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
        try{
            formattedTextField.setText("" + PCGUI.modCalculate( Integer.parseInt( textField.getText() )) );
        }
        catch (Exception ex){
            if (textField.getText().equals("")){
                formattedTextField.setText("");
            }
            else{
                formattedTextField.setText("N/A");
            }
        }
    }
    
}
