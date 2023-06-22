/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a2_panehala;

/**
 *
 * @author Nehal Patel
 */
public class Ques1 {

    public static void main(String[] args) {
        Animal[] list = new Animal[5];
        list[0] = new Chiken();
        list[0].setWeight(4.5);

        list[1] = new Tiger();
        list[1].setWeight(46.6);

        list[2] = new Chiken();
        list[2].setWeight(1.5);

        list[3] = (Animal) (list[0].clone());
        list[3].setWeight(7.5);

        list[4] = (Animal) (list[1].clone());

        java.util.Arrays.sort(list);

        for(int i = 0; i < list.length; i++) {
            if(list[i] instanceof Edible) {
                ((Edible) list[i]).howToEat();
            } else if (list[i] instanceof Animal) {
                System.out.println("Sound: " + list[i].sound());
            }

            System.out.println("Weight: " + list[i].getWeight());
        }
 }
}
