package irfan.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {

    private List<E> datas = new ArrayList<>();

    public Stack(){};

    public Stack(List<E> datas) {
        this.datas.addAll(datas);
    }

    public E pop(){
        if (datas.isEmpty()) return null;
        int lastIndex = datas.size() - 1;
        E data = datas.get(lastIndex);
        this.datas.remove(lastIndex);
        return data;
    }

    public void push(E data) {
        this.datas.add(data);
    }

    public Integer size() {
        return this.datas.size();
    }

    public E peek() {
        if (datas.isEmpty()) return null;

        int lastIndex = datas.size() - 1;
        return this.datas.get(lastIndex);
    }

    public void clear() {
        this.datas.removeAll(datas);
    }
}
