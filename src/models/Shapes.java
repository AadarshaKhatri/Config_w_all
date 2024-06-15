package models;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Shapes {
    @Value("5")
    int sides;
    @Value("3 ")
    int length;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void pr(){
        System.out.println("Total number of sides:"+sides);
        System.out.println("Length: "+ length);
    }
}
