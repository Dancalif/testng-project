package sqa.jf.interfaces.creatures;

import java.util.*;

/**
 * File Name: Animal.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Dec 5, 2015
 * Animal //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Animal implements IAnimal {

    /**
     * Default constructor
     */
    public Animal() {
    }

    /**
     * 
     */
    private int age;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private double weight;

    /**
     * 
     */
    Scanner scanner;


    /**
     * 
     */
    public void Animal() {
        // TODO implement here
    }

    /**
     * @param name 
     * @param gender 
     * @param age 
     * @param weight
     */
    public void Animal(String name, String gender, int age, double weight) {
        // TODO implement here
    }

    /**
     * @see com.sqa.jf.interfaces.creatures.IAnimal#getAbilities()
     * @return
     */
    public Set<String> getAbilities() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getAge() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getGender() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public double getWeight() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @see com.sqa.jf.interfaces.creatures.IAnimal#makeNoise()
     * @return
     */
    public void makeNoise() {
        // TODO implement here
        return null;
    }

    /**
     * @see com.sqa.jf.interfaces.creatures.IAnimal#move()
     * @return
     */
    public void move() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void requestAnimalDetails() {
        // TODO implement here
        return null;
    }

    /**
     * @param age 
     * @return
     */
    public void setAge(int age) {
        // TODO implement here
        return null;
    }

    /**
     * @param gender 
     * @return
     */
    public void setGender(String gender) {
        // TODO implement here
        return null;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param weight 
     * @return
     */
    public void setWeight(double weight) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public abstract Set<String> getAbilities();

    /**
     * @return
     */
    public abstract void makeNoise();

    /**
     * @return
     */
    public abstract void move();

}