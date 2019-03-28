package upgrad.service;

import org.springframework.stereotype.Service;
import upgrad.model.User;

@Service
public class UserService {

    public boolean login(User user){
        String username = user.getUsername();
        if(username.equals("validUser")){
            return true;
        }else {
            return false;
        }
    }

}
