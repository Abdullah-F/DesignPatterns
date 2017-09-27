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
public abstract class AbstractCommand implements Command{
    private TextEditor textEditor;
    public AbstractCommand(TextEditor textEditor)
    {
        this.textEditor = textEditor;
    }
    
    public TextEditor getTextEditor()
    {
        return this.textEditor;
    }
    
}
