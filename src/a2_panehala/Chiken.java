/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a2_panehala;

/**
 *
 * @author Nehal Patel
 */
public class Chiken extends Animal implements Edible{
    
    @Override
    public String howToEat()
    {
        return "Cook It";
    }
    
    @Override
    public String sound()
    {
        return "Cluck Cluck";
    }

}
