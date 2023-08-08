package net.media.training.designpattern.observer;

import java.util.Collections;
import java.util.List;


/*
* GameTestClient- everyoneGoesOut, everyoneComesIn, outDoorsFeelWarm
* SunTestClient- aFewCharactersGoOutdoors, aFewOtherCharactersGoOutdoors, charactersWhoWereOutAreFeelTired,
* Characters- outdoors, feelingWarm, feelingTired. Methods- goIndoors/outdoors, notifySunset/sunRise, isFeelingWarm
* * */

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public List<Character> characters;

    public List<Character> isInDoors;

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();

        Collections.addAll(characters, robot, person, dog, cat);
        sun = new Sun(characters);
        game = new Game(sun);
    }

    public void addToCharacters(Character character) {
        characters.add(character);
    }

    public void removeFromCharacters(Character character) {
        characters.remove(character);
    }

    public void everyoneGoesOut() {
        for (Character character : characters) {
            if (character.isIndoors())
                character.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {

        for (Character character : characters) {
            if (character.isOutdoors()) {
                character.goIndoors();
            }
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        for (Character character : characters) {
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }
        return true;
    }

    public boolean allFeelCold() {
        for (Character character : characters) {
            if (character.isFeelingWarm())
                return true;
        }
        return false;
    }



}