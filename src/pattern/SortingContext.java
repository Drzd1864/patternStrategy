package pattern;

public class SortingContext {
    private Sorter sorter;

    public SortingContext(Sorter sorter){
        this.sorter = sorter;
    }
    public void execute(int[]arr){
        sorter.sort(arr);
    }

}
