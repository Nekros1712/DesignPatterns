package net.media.training.designpattern.strategy;

public interface Validator<T> {
    void validate(T input);
}