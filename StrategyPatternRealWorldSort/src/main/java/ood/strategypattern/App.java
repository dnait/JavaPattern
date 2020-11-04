package ood.strategypattern;

public class App {
    public static void main(String[] args) {
        int[] nums = {5,4, 3, 1,2};
        Context ctx = new Context(new QuickSort());
        ctx.arrange(nums);
    }
}
