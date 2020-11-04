package ood.strategypattern;
import java.util.logging.Logger;
public class InsertSort implements SortStrategy {
    final static Logger LOGGER = Logger.getLogger(InsertSort.class.getName());
    public void sort(int[] nums) {
        LOGGER.info("Start insertSort");
    }
}
