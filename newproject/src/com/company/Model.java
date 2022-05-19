package com.company;

 class Model {
   private double height;
   private double weight;
   private int age;

     Model(double height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

     public Model() {
     }

     void age() {
        int ag;
        ag = age;
        System.out.println("Вік моделі : " + ag);
    }

    double imtf() {
        double imt = weight / Math.pow(height, 2);
        return imt;

    }

    int imtf(int height, int weight, int age) {
        int imt = weight / (height * height);
        return imt;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void ideal(){//ідеальна маса тіла
         double i = (getHeight() + 100) * 0.5;
        System.out.println("Ідеальна маса тіла: " + i );

    }
}
