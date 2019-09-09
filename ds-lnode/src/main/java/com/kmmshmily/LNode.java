package com.kmmshmily;

/**
 * @program: dsstudy
 * @description: 单链表节点
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-09 20:40
 **/

public class LNode<T> {
    public T data;
    public LNode<T> next;

    public LNode() { }

    public LNode(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (this.next == null) {
            return "" + this.data;
        }
        return "" + this.data + ","+this.next.toString();
    }
}   
