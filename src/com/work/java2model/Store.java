package com.work.java2model;

public class Store {



            public static void main(String[] args) {
                ProductForSale[] products =new ProductForSale[5];
                products[0]=new Chocolate("sweet",15,"süper","black",true);
                listProducts(products);
            }

            public static void listProducts(ProductForSale[] products) {
                for(ProductForSale product:products){
                    if(product!=null){
                        product.showDetails();

                    }
                }
            }


}
