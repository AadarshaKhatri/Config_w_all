package models;

public class Vechile {
    int number_plate;
    int no_of_wheels;
    String name;

    public int getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(int number_plate) {
        this.number_plate = number_plate;
    }

    public int getNo_of_wheels() {
        return no_of_wheels;
    }

    public void setNo_of_wheels(int no_of_wheels) {
        this.no_of_wheels = no_of_wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void overall_display(){
        System.out.println("Name of the car:"+ name);
        System.out.println("Car Number: "+number_plate);
        System.out.println("Type/ Number of wheels: "+ no_of_wheels);
    }
}
