package emergon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//This is a bean that will be saved into the Spring Container
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    
    
    @RequestMapping(value="/info", method = RequestMethod.GET)
    public String infoPage(){
        return "info";
    }
    
}
