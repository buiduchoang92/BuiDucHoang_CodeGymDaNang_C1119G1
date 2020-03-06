package com.codegym.model;

import java.util.ArrayList;
import java.util.List;

public class Giohang {
    List<Product> list = new ArrayList<>();

    public Giohang() {
    }


    public List<Product> getList() {
        return list;
    }


    public void setList(List<Product> list) {
        this.list = list;
    }


    public void  add(Product product){list.add(product);}

    public void remove(Long id){
        for (Product p:list){
            if(p.getId()==id){
                list.remove(p);
                return;
            }
        }
    }
//    private int count = 0;
//    public void count(Giohang giohang){
//        for (int i =0;i<list.size();i++){
//            if (list[Product] == giohang){
//                count++;
//            }
//        }
//
//    }
}
