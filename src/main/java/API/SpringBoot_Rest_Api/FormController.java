package API.SpringBoot_Rest_Api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200/")
@RestController
public class FormController {
    @PostMapping("/register")
    public Boolean submitForm(@RequestBody FormVo vo)
    {
        System.out.println("User Name: "+vo.getName()+" User Email: "+vo.getEmail()+" User Number: "+vo.getPhone()+ " is Registered.");
        return true;
    }
}
