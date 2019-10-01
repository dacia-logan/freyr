package is.hi.hbv501g.freyr.Freyr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class homeController {
    @RequestMapping("/")
    public String Home(){
        return "home";
    }
    @RequestMapping("login")
    public String Login(){
        return "login";
    }
}
