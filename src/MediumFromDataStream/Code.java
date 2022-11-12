package MediumFromDataStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Code {

    private ArrayList<Integer> sortedList;
    private Double median;

    public Code() {
        sortedList = new ArrayList<>();
        median = null;
    }

    public void addNum(int num) {
    int index = Collections.binarySearch(sortedList, num, Comparator.comparing(Integer::intValue));
    if (index < 0) {
        index = -index - 1;
    }
    sortedList.add(index, num);
    }

    public double findMedian() {
        if(sortedList.size()<1)
            throw new ArrayIndexOutOfBoundsException("list is empty!");
        if(sortedList.size() == 1)
            return sortedList.get(0);
        if(sortedList.size() % 2 != 0){
            return sortedList.get(sortedList.size()/2);
        } else {
            return (sortedList.get(sortedList.size()/2-1).doubleValue()+sortedList.get(sortedList.size()/2))/2;
        }
    }

}
