package ood.strategypattern;
import java.util.logging.Logger;
public class Context {
    final static Logger LOGGER = Logger.getLogger(Context.class.getName());
    private final SortStrategy strategy;
    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void arrange(int[] nums) {
        strategy.sort(nums);
    }
}
