
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.*;

public class ClassListener implements DocumentListener {
    private JTextField textField;
    private JFormattedTextField formattedTextField;
    
    
    public ClassListener(JTextField textField, JFormattedTextField formattedTextField) {
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
            if (textField.getText().equals("Barbarian")){
                //Set levels in the map
                
                //Todo: Levels up to 20
            }
            else if(textField.getText().equals("Bard")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Cleric")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Druid")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Fighter")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Monk")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Paladin")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Ranger")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Rogue")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Sorcerer")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Warlock")){
                //Set levels in the map
            }
            else if(textField.getText().equals("Wizard")){
                //Set levels in the map
            }
            else{
                //Set map lvls to N/A
                for (int key : PCGUI.profMap.keySet()){
                    PCGUI.profMap.put(key, "N/A");
                }
            }
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
