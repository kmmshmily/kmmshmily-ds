package com.kmmshmily.seqlist;

import java.util.Arrays;

/**
 * @program: datastructionstudy
 * @description: 线性表
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-08 15:32
 **/

public class SeqList {
    public int maxSize;
    public int[] data;
    public int len;

    public SeqList(int b) {
        this.len = 0;
        this.data = new int[b];
        this.maxSize = data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + "****,长度为：" + len;
    }

}   
