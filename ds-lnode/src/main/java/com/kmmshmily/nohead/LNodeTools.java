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
    public int getLNodeLength(LNode<T> head){
        int i = 1;
        while (head.next != null){
            head = head.next;
            i++;
        }
        return i;
    }

    public LNode<T> getLinkListByIndex(LNode<T> head, int i){
        if(i > this.getLNodeLength(head)){
            System.out.println("索引超出了单链表的长度");
            return null;
        }
        int j = 1;
        LNode<T> p = head;
        while (p.next != null && j < i){
            p = p.next;
            j++;
        }
        return p;
    }

    public LNode<T> getLinkListByValue(LNode<T> head, T data){
        LNode<T> p = head;
        while (p != null && p.data != data){
            p = p.next;
        }
        return p;
    }

    public LNode<T> insert(LNode<T> head, int i, T data){
        LNode<T> m = head;
        if(i == 1){
            LNode<T> toInsert = new LNode<>(data);
            toInsert.next = m;
            return toInsert;
        }
        LNode<T> p = this.getLinkListByIndex(m, i-1);
        LNode<T> q = p.next;
        LNode<T> toInsert = new LNode<>(data);
        toInsert.next = q;
        p.next = toInsert;
        return m;
    }

}   
