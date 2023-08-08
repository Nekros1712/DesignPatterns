package net.media.training.designpattern.observer;

import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 9:06:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class SunTestClient {
    private final Person person;
    private final Cat cat;
    private final Dog dog;
    private final Robot robot;
    private Sun sun;

    public List<Character> characters;

    public List<Character> isOutDoors;

    public SunTestClient() {
        this.person = new Person();
        this.cat = new Cat();
        this.dog = new Dog();
        this.robot = new Robot();
        Collections.addAll(characters, robot, person, dog, cat);
        this.sun = new Sun(characters);
    }


    public void addToCharacters(Character character) {
        characters.add(character);
    }

    public void removeFromCharacters(Character character) {
        characters.remove(character);
    }

    public void aFewCharactersGoOutdoors() {
        person.goOutdoors();
        robot.goOutdoors();
    }

    public void aFewOtherCharactersGoOutdoors() {
        cat.goOutdoors();
        dog.goOutdoors();
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {

        for (Character character : characters) {
            if (!character.isFeelingTired() && character.isOutdoors())
                return false;
        }
        return true;
    }

    public boolean outdoorsCharactersFeelWarm() {

        for (Character character : characters) {
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }
        return true;
    }
}
