package com.mj.designpattern.decorator;

public class Shoes extends AbstractClothes {
    public Shoes(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public void show() {
        super.show();
        say();
    }

    private void say(){
        System.out.println( "我展示一双鞋子");
    }
}
