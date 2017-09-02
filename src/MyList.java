import java.util.ArrayList;
import java.util.Collections;

public class MyList extends ArrayList<Integer> {

    public MyList() {
        super();
    }

    public MyList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Integer value) {
        if (value == null) throw new NullPointerException("Value can't be null: " + value);
        else {
            for (int i = 0; i < size(); i++) {
                set(i, get(i) + value);
            }
            return super.add(value);
        }
    }

    @Override
    public void add(int index, Integer element) {
        if (element == null) throw new NullPointerException("Value can't be null: " + element);
        else {
            for (int i = 0; i < size(); i++) {
                set(i, get(i) + element);
            }
            super.add(index, element);
        }
    }

    @Override
    public boolean remove(Object value) {
        if (value == null) throw new NullPointerException("Value can't be null: " +
                value);
        else {
            for (int i = 0; i < size(); i++) {
                set(i, ((int) get(i) - (int) value));
            }
            return super.remove(value);
        }
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    public int findIndexByValue(Integer value) {
        int findedIndex = 0;
        if (value == null) throw new NullPointerException("Value can't be null: " +
                value);
        else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).equals(value)) findedIndex = i;
            }
        }
        return findedIndex;
    }

    @Override
    public Integer get(int index) {
        return super.get(index);
    }

    @Override
    public Integer remove(int index) {
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












