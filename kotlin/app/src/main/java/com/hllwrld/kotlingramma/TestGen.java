package com.hllwrld.kotlingramma;

class TestGen {

    static class Food {}
    static class Frute extends Food{}
    static class Apple extends Frute{}
    static class Hongfushi extends Apple{}

    static class GenericType<T> {
        T data;
        public void setData (T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    static void print(GenericType<? extends Frute> frute) {

   }

   static void print1(GenericType<? super Apple> apple)  {}


    public static void main(String[] args) {
       print(new GenericType<Apple>());
       //print(new GenericType<Food>());
       //print1(new GenericType<Hongfushi>());
       print1(new GenericType<Food>());

       GenericType<? extends Frute> frute = new GenericType<>();
      // frute.setData(new Apple());
        frute.setData(new Food());


        Apple apple = frute.getData();
        Frute frute1 = frute.getData();


        GenericType<? super Apple> apppleType = new GenericType<>();
        apppleType.setData(new Frute());
        Frute frute2 = apppleType.getData();

    }

}
