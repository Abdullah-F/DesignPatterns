/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

/**
 *
 * @author abdullah-fadhel
 * 
 */
public interface Command {

    void action(String text);

    void undo();
}
