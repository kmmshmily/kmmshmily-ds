package com.kmmshmily.seqlist;

/**
 * @program: datastructionstudy
 * @description: 线性表工具类
 * @author: kmmshmily--cuiyong
 * @date: 2019-09-08 15:31
 **/

public class SeqListTools {
    private SeqList seqList;
    private static SeqListTools tools = new SeqListTools();

    SeqList init(int... array) {
        this.seqList = new SeqList(array.length);
        return tools.add(seqList, array);
    }

    public synchronized SeqList add(SeqList seqList, int... initArray) {
        for (int a : initArray) {
            if (seqList.len < seqList.maxSize) {
                seqList.data[seqList.len] = a;
                seqList.len++;
            } else {
                System.out.println("数组空间已满,元素：" + a + " 被丢弃");
            }
        }
        return seqList;
    }

    public SeqList convert(SeqList seqList) {
        SeqList seqListConvert = new SeqList(seqList.len);
        tools.add(seqListConvert, seqList.data);
        for (int i = 0; i < seqListConvert.len / 2; i++) {
            int x = seqListConvert.data[i];
            seqListConvert.data[i] = seqListConvert.data[seqListConvert.len - i - 1];
            seqListConvert.data[seqListConvert.len - i - 1] = x;
        }
        return seqListConvert;
    }

    public SeqList merge(SeqList A, SeqList B){
        SeqList C = new SeqList(A.len + B.len);
        int i = 0;
        int j = 0;
        while (i <  A.len && j < B.len){
            if(A.data[i] < B.data[j]){
                tools.add(C, A.data[i++]);
            }else {
                tools.add(C, B.data[j++]);
            }
        }
        while (i < A.len){
            tools.add(C, A.data[i++]);
        }
        while (j < B.len){
            tools.add(C, B.data[j++]);
        }
        return C;
    }
}   
