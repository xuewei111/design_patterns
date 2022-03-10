package com.xuewei.memento.game;

import java.util.List;
import java.util.Map;

// 守护者对象,保存游戏角色的状态
public class Caretaker {

    // 保存一次状态
    private Memento memento;

    // 保存多次状态
    private List<Memento> mementoList;

    // 对多个角色保存多个状态
    private Map<String,List<Memento>> map;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
