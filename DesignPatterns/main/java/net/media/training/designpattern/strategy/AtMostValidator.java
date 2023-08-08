package net.media.training.designpattern.strategy;

public class AtMostValidator implements Validator<int[]>{
    public void validate(int[] valMax) {
        if (valMax[0] > valMax[1])
            throw new RuntimeException("at least check failed:" + valMax[0]);
    }
}