/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author abdullah-fadhel
 */
public class TextEditor {
    private String text = "empty";
    private Queue<Command> commandsQueue = new LinkedList<Command>();
    
    private void executeAction(Command command, String text){
        command.action(text);
        commandsQueue.add(command);
    }
    
    private void undo()
    {
        Command command = commandsQueue.poll();
        if(command != null){
            command.undo();
        }
    }

    public String getText() {
        return text;
    }

    public Queue<Command> getCommandsQueue() {
        return commandsQueue;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCommandsQueue(Queue<Command> commandsQueue) {
        this.commandsQueue = commandsQueue;
    }
    
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();

        ClearTextCommand clearTextCommand = new ClearTextCommand(textEditor);
        textEditor.executeAction(clearTextCommand, "some text");
        System.out.println(textEditor.getText());
        
        textEditor.undo();
        System.out.println(textEditor.getText());
    }
    
    
}
