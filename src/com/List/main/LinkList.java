package com.List.main;

public class LinkList {
    private Link first;//ссылка на первый элемент списка
    public LinkList(){
        first=null;
    }
    //вставка элемента в начало списка
    public void AddFirst(int Data){
        Link vremmennie=new Link(Data);
        vremmennie.next=first;
        first=vremmennie;
    }
    //удаление
    public void deletedFirst(){
        Link temp=first;
        first=first.next;
    }
}
