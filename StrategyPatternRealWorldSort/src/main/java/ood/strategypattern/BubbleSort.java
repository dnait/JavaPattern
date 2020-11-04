package ood.strategypattern;
import java.util.logging.Logger;
public class BubbleSort implements SortStrategy{
    final static Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());
    public void sort(int[] nums) {
        LOGGER.info("Start bubble sort");
    }
}
