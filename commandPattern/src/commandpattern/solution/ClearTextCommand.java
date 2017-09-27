/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

/**
 *
 * @author abdullah-fadhel
 */
public class ClearTextCommand extends AbstractCommand{

    private String undoText;
    public ClearTextCommand(TextEditor textEditor){
        super(textEditor);
    }
    @Override
    public void action(String text) {
        undoText = getTextEditor().getText();
        getTextEditor().setText(text);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
    
}
