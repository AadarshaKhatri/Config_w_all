package models;

public class SmartPhone {
    boolean Screen_touch;
    boolean can_take_photos;
    boolean has_buttons;

    public boolean isScreen_touch() {
        return Screen_touch;
    }

    public void setScreen_touch(boolean screen_touch) {
        Screen_touch = screen_touch;
    }

    public boolean isCan_take_photos() {
        return can_take_photos;
    }

    public void setCan_take_photos(boolean can_take_photos) {
        this.can_take_photos = can_take_photos;
    }

    public boolean isHas_buttons() {
        return has_buttons;
    }

    public void setHas_buttons(boolean has_buttons) {
        this.has_buttons = has_buttons;
    }

    public void output(){
        System.out.println("SmartPhone takes Photos: "+ can_take_photos);
        System.out.println("SmartPhone has buttons: "+ has_buttons);
        System.out.println("SmartPhones has the feature of screen-touch: "+ Screen_touch);
    }
}
