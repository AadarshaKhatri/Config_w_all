package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfigFile {
    @Bean
    public SmartPhone features(){
        SmartPhone iphone = new SmartPhone();
        iphone.setHas_buttons(false);
        iphone.setScreen_touch(true);
        iphone.setCan_take_photos(true);
        return iphone;
    }


}
