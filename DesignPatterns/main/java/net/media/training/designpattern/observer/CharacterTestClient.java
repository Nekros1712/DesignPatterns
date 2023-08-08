package net.media.training.designpattern.observer;

import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 12:26:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTestClient {
    private Cat cat;
    private Person person;
    private Dog dog;
    private Robot robot;

    public List<Character> characters;

    public CharacterTestClient() {
        robot = new Robot();
        dog = new Dog();
        person = new Person();
        cat = new Cat();
        Collections.addAll(characters, robot, dog, person, cat);
    }
    public void addToCharacters(Character character) {
        characters.add(character);
    }

    public void removeFromCharacters(Character character) {
        characters.remove(character);
    }
    public boolean testOutdoors() {
        for(Character character : characters) {
            character.goOutdoors();
            if (!character.isOutdoors())
                return false;
        }
        return true;
    }

    public boolean testSunRose() {
        for (Character character : characters) {
            character.notifySunSet();
            if (!character.isFeelingWarm())
                return false;
        }
        return true;
    }

    public boolean testSunSet() {

        for (Character character : characters) {
            character.notifySunSet();
            if (character.isFeelingWarm())
                return false;
        }
        return true;
    }

    public boolean testIndoors() {

        for (Character character : characters) {
            character.goIndoors();
            if (character.isOutdoors())
                return false;
        }
        return true;
    }
}
