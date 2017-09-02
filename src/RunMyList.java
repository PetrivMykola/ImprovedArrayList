import java.util.ArrayList;
import java.util.LinkedList;

public class RunMyList {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2, 6);
        myList.remove(2);

        System.out.println(myList);
        System.out.println("max value " + myList.findMaxValue());
        System.out.println("min value " + myList.findMinValue());
        System.out.println("sum " + myList.avarageSum());
        System.out.println("index " + myList.findIndexByValue(5));


    }
}
