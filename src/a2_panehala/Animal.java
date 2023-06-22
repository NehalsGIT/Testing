/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package a2_panehala;

/**
 *
 * @author Nehal Patel
 */
public abstract class Animal implements Comparable<Animal>,Cloneable{

    public double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Or handle the exception accordingly
        }
    }
    
    @Override
    public int compareTo(Animal otherAnimal) {
        return Double.compare(this.weight, otherAnimal.getWeight());
    }
    
    public abstract String sound();
}
