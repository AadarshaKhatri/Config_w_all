package models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Students {
    @Value("AADARSHA Khatri")
    String name;
    @Value("1")
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Value("88")
    int marks;
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Id: "+id);
        System.out.println("Marks"+marks);
    }


}
