package com.kmmshmily.seqlist;

/**
 * @program: datastructionstudy
 * @description:
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-08 15:31
 **/

public class SeqListTest {
    public static void main(String[] args) {
        SeqListTools tools = new SeqListTools();
        SeqList seqList = tools.init(1,3,5,6,7,8,9);
        System.out.println(seqList);
        System.out.println(tools.convert(seqList));
        System.out.println("**********");
        SeqList a = tools.init(1,2,3);
        SeqList b = tools.init(4,5,6);
        System.out.println(tools.merge(a, b));
        System.out.println(tools.convert(tools.merge(a, b)));
    }
}   
