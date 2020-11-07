package ood.designpattern;

public class LazySingleton {
    private static LazySingleton uniqueInstance;
    private LazySingleton(){};
    public static LazySingleton getInstance() {
        if (uniqueInstance == null){
            return new LazySingleton();
        }
        return uniqueInstance;
    }
}
