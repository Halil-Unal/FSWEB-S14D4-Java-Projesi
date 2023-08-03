package com.work.java2model;

public class Chocolate extends ProductForSale{
private String color;
private boolean hasSugar;
    public Chocolate(String type, int price, String description,String color, boolean hasSugar) {
        super(type, price, description);
        this.color=color;
        this.hasSugar=hasSugar;
    }

    @Override
    public void showDetails() {
       String result= super.toString();
       StringBuilder builder=new StringBuilder();
       builder.append(("color: "  + color ));
       builder.append(("has sugar: " + hasSugar  ));
        System.out.println(result+builder.toString());
    }


}
