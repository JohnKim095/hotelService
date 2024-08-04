package com.pennstate.kimmyeonghwan.hotelServiceSystem.configuration;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.controller.HotelsController;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.controller.MvcController;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.controller.UsersController;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.dao.HotelDAO;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.dao.UserDAO;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.service.HotelService;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //annotation to define the class that has @Bean, Spring finds this annotation to use @bean
public class ApplicationConfig {
//by registering and define bean, I can use the object that needs the "bean" anywhere
//"bean can be called by @Autowired"
//register the "return" of the bean to the spring app context
//spring controls the call of bean method and return object
    @Bean
    public UserDAO userDAO(){
        return new UserDAO();
    }

    @Bean
    public HotelDAO hotelDAO(){
        return new HotelDAO();
    }
    //"hotelDAO" method returns the object HotelDAO() implemented by the interface "HotelDAO"

    @Bean
    public UserService userService(){
        return new UserService(userDAO());
    }
    //when creating UserService() object, call userDAO() method and put UserDAO object

    @Bean
    public HotelService hotelService(){
        return new HotelService(hotelDAO());
    }
    //same for UserService
//    @Bean
//    public HotelsController HotelsController(){
//        return new HotelsController();
//    }
    //get HotelDAO object/// hotelService > HotelService > hotelDAO > HotelDAO()
    @Bean
    public UsersController UsersController(){
        return new UsersController(userService());
    }
}
