package irfan.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Long> datas = new ArrayList<>();

    public Stack(){};

    public Stack(List<Long> datas) {
        this.datas.addAll(datas);
    }

    public Long pop(){
        if (datas.isEmpty()) return null;
        int lastIndex = datas.size() - 1;
        Long data = datas.get(lastIndex);
        this.datas.remove(lastIndex);
        return data;
    }

    public void push(Long data) {
        this.datas.add(data);
    }

    public Integer size() {
        return this.datas.size();
    }

    public Long peek() {
        if (datas.isEmpty()) return null;

        int lastIndex = datas.size() - 1;
        return this.datas.get(lastIndex);
    }

    public void clear() {
        this.datas.removeAll(datas);
    }
}
