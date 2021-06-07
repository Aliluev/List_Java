package com.List.main;

public class Link {
    public int Data;
    public Link next;//ссылка на след элемент
    public Link(int Data_t){
        Data=Data_t;
    }
    public void posmotret() {
        System.out.println(Data);
        System.out.println("-----");
    }
}
