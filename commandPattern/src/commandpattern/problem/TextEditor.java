/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.problem;

/**
 *
 * @author abdullah-fadhel
 */
public class TextEditor {
    private String text;
    private String undoText;
    
    public TextEditor(String text){
        this.text = text;
    }
    public void addText(String text){
        this.undoText = this.text;
        this.text = text;
    }
    
    public void clearText()
    {
        this.undoText = text;
        this.text = "";
    }
    
    public String getText(){
        return this.text;
    }
    
    public void undo(){
        this.text = undoText;
    }
    
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor("");
        System.out.println(textEditor.getText());
        textEditor.addText("some Text");
        textEditor.undo();
        System.out.println(textEditor.getText());
    }
}
