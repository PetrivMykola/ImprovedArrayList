import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyList extends ArrayList<Integer> {

    Scanner in = new Scanner(System.in);

    public MyList() {
        super();
    }

    public MyList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Integer value) {
        try {
            if (value == null) throw new NullPointerException("Value can not be null");

        }catch (NullPointerException e ) {
            System.out.println("Please enter value not null");
            value = in.nextInt();
        }
            for (int i = 0; i < size(); i++) {
                    set(i, get(i) + value);
                }
            return super.add(value);
        }


    @Override
    public void add(int index, Integer element) {
        try {
            if (element == null) throw new NullPointerException("Element can not be null");

        }catch (NullPointerException e ) {
            System.out.println("Please enter value not null");
            element = in.nextInt();
        }
            for (int i = 0; i < size(); i++) {
                set(i, get(i) + element);
                }
            super.add(index, element);
        }

    @Override
    public boolean remove(Object value) {
        try {
            if (value == null) throw new NullPointerException("Value can't be null: " +
                    value);
        }catch (NullPointerException e) {
            System.out.println("Please enter value not null");
            value = in.nextInt();
        }
                for (int i = 0; i < size(); i++) {
                    set(i, ((int) get(i) - (int) value));
                }
        return super.remove(value);
        }


    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    public int findIndexByValue(Integer value) {
        int findedIndex = 0;
        try {
            if (value == null) throw new NullPointerException("Value can't be null: " +
                    value);
        }catch (NullPointerException e) {
            System.out.println("Please enter value not null");
            value = in.nextInt();
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(value)) findedIndex = i;
        }
        return findedIndex;
    }

    @Override
    public Integer get(int index) {
        try {
            if (index == -1) throw new MyException("uncorrect index");
        } catch (MyException e) {
            System.out.println("Please enter correct index > 0 ");
            index = in.nextInt();
        }
        return super.get(index);
    }

    @Override
    public Integer remove(int index){
        try {
            if (index == -1) throw new MyException("uncorrect index -1");
        } catch (MyException e) {
            System.out.println("Please enter correct index > 0 ");
            index = in.nextInt();
        }
        Integer el = get(index);

        for (int i = 0; i < size(); i++) {
            set(i,  get(i) - el);
        }
        return super.remove(index);
    }

    public Integer findMaxValue() {
        return Collections.max(this);
    }

    public Integer findMinValue() {
        return Collections.min(this);

    }

    public int avarageSum() {
        int sum = 0;

        for (int i = 0; i < size(); i++) {
            sum += this.get(i);
        }
        return sum / size();
    }
}












