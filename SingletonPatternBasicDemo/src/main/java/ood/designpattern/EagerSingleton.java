package ood.designpattern;

public class EagerSingleton {
    private static EagerSingleton uniqueEagerSingleton = new EagerSingleton();

    private EagerSingleton() {}
    private static EagerSingleton getInstance() {
        return uniqueEagerSingleton;
    }
}
