package com.kmmshmily.nohead;

import com.kmmshmily.LNode;

/**
 * @program: dsstudy
 * @description: 测试类
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-09 20:43
 **/

public class LNodeTest {
    public static void main(String[] args) {
        LNode<Integer> lnode = new LNode<>(2);
        LNode<Integer> lnode1 = new LNode<>(3);
        lnode.next = lnode1;
        System.out.println(lnode);
        System.out.println("*******");
        LNodeTools<Integer> tools = new LNodeTools<>();
        LNode<Integer> lNode = tools.init(2,1,3,4,8);
        System.out.println(tools.getLinkListByIndex(lNode, 5));
        System.out.println(tools.getLinkListByValue(lNode, 5));
        System.out.println(tools.insert(lNode, 1, 6));
    }
}   
