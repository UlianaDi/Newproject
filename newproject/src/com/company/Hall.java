package com.company;
    class Hall extends Podium{
   private int seat;
   private int personnel;
   private double square;

     Hall(int seat, int personnel, double square) {
        this.seat = seat;
        this.personnel = personnel;
        this.square = square;
    }

    void people (){
    int p; p = personnel + seat ;
    System.out.println("Кількість людей в приміщенні: " + p);    }

    double terutory() {
        double terutory1 =  square / (seat + personnel);
        return terutory1 ;
    }

    int terutory(int seat, int personnel, int square){
        int terutory1 = square / (seat + personnel);
        return terutory1 ;

    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getPersonnel() {
        return personnel;
    }

    public void setPersonnel(int personnel) {
        this.personnel = personnel;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    void s (Podium podium){
        System.out.println(square);
         System.out.println("Площа залу без подіуму: " + (square - (podium.getWidth() * podium.getLenght())) );
     }
     void backSeat (){
         len2x(1,3,23);
         System.out.println("Кількість місць: " + getSeat());
     }
}