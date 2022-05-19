package com.company;
 class Podium extends Model{
   private double height;
   private double width;
   private double lenght;

     Podium(double height, double width, double lenght) {
         super();

         this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    public Podium(double i){
        width = height = i;
        // перевизначений конструктор
        // встановлена рівність сторін
    }

    public Podium(Podium first){
        height = first.height;
        width = first.width;
        lenght = first.lenght;
        // створення клону існуючого екземпляра класу
    }

    public Podium (){
        // не приймає жодного параметру
    }

     Podium(double height, double weight, int age) {
         super(height, weight, age);
     }

     void square (){
    double squ; squ = width * lenght;
    System.out.println("Площа подіуму: " + squ);
    }

    double len2x (){
       double len = lenght + lenght;
       return len;

    }

    int len2x (int height, int width, int lenght){
        int len =  lenght + lenght;
        return len;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
   //
    void backLenght (){
         imtf();
        System.out.println("Довжина подіуму: " + getLenght());
    }
}
