package Spring.boot.Activity3.Controller;

import Spring.boot.Activity3.Object.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {

    @GetMapping (value = "/user")
    public User getUser(){
        User user = new User();
        user.setName("Ngoc");
        user.setEmail("ngocngo12a@gmail.com");
        return  user;
    }
}
