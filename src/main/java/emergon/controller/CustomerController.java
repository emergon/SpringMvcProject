

package emergon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    
    @RequestMapping("/list")//   /customers/list
    public String listCustomer(){
        return "customer/list";// this will return /WEB-INF/view/customer/list.jsp
    }
}
