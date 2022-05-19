package com.company;

public class Models extends Model {

    Models(double height, double weight, int age) {
        super(height, weight, age);
    }
   void height (){
        age();
       System.out.println("Ріст моделі: " + getHeight());
   }
   void test (){
        FirstModel olena = new FirstModel();
        olena.methodModel();

   }
   class FirstModel {
        void methodModel(){
            System.out.println("Вага моделі: " + getWeight());
            height();
        }
   }

   void backAge (){
        imtf();
       System.out.println("Вік моделі: " + getAge());
    }
}
