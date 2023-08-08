package net.media.training.designpattern.strategy;

public class AtLeastValidator implements Validator<int[]> {
    public void validate(int[] valMin) {
        if (valMin[0] < valMin[1])
            throw new RuntimeException("at least check failed:" + valMin[0]);
    }
}