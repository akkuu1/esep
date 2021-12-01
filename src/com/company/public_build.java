package com.company;

public class public_build implements build{
    int a[]=new int[4];
    int size=0;
    @Override
    public int Add (int v){
        return a[v];
    }
    @Override
    public boolean oryn_sany (int i) {
        if (size !=a.length) {
            a[size] = i;
            size++;
            return true;
        } else
            return false;
    }
}



