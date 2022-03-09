package com.xuewei.memento.theory;

public class Originator {

    /**
     * 状态信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 编写一个方法,可以保存一个状态对象 Memento
     * 因此写一个方法 返回Memento
     * @return
     */
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
