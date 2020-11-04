package ood.strategypattern;
import java.util.logging.Logger;
public class QuickSort implements SortStrategy {
    final static Logger LOGGER = Logger.getLogger(QuickSort.class.getName());
    public void sort(int[] nums) {
        LOGGER.info("Quick Sort");
    }
}
