package sqa.jf.interfaces.creatures;

import java.util.*;

/**
 * File Name: Bear.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Dec 5, 2015
 * Bear //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Bear extends Animal implements IAnimal, ICrawlingCreature {

    /**
     * Default constructor
     */
    public Bear() {
    }

    /**
     * 
     */
    private int hibernateDaysCount;

    /**
     * 
     */
    public void Bear() {
        // TODO implement here
    }

    /**
     * @param name 
     * @param gender 
     * @param age 
     * @param weight 
     * @param hibernateDaysCount
     */
    public void Bear(String name, String gender, int age, double weight, int hibernateDaysCount) {
        // TODO implement here
    }

    /**
     * @see com.sqa.jf.interfaces.creatures.ICrawlingCreature#crawl()
     * @return
     */
    public void crawl() {
        // TODO implement here
        return null;
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
    public int getHibernateDaysCount() {
        // TODO implement here
        return 0;
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
     * @param hibernateDaysCount 
     * @return
     */
    public void setHibernateDaysCount(int hibernateDaysCount) {
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

    /**
     * @return
     */
    public abstract void crawl();

}