package ood.designpattern;

/*
  The volatile ensures that multiple thread handle the uniqueInstance variable correctly when it is being initialized to the Singleton instance;
 */
public class DoubleCheckLockSingleton { //with volatile
    private volatile static DoubleCheckLockSingleton doubleCheckLockSingleton;
    private DoubleCheckLockSingleton() {}
    public static DoubleCheckLockSingleton getInstance() {
        if (doubleCheckLockSingleton == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (doubleCheckLockSingleton == null) { //once in the lock, check again and if still null, create an instance;
                    doubleCheckLockSingleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return doubleCheckLockSingleton;
    }
}

