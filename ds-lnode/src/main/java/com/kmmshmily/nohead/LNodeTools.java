package com.kmmshmily.nohead;

import com.kmmshmily.LNode;

/**
 * @program: dsstudy
 * @description: 单链表工具类
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-09 20:47
 **/

public class LNodeTools<T> {
    private static LNodeTools tools = new LNodeTools<>();

    public LNode<T> init(T... data){
        LNode<T> q;
        LNode<T> head = new LNode<>(data[0]);
        head.next = null;
        q = head;
        for (int i = 1; i < data.length; i++){
            LNode<T> p = new LNode<>(data[i]);
            q.next = p;
            q = p;
        }
        return head;
    }
    public LNode<T> add(T... data){
        return null;
    }
}   
