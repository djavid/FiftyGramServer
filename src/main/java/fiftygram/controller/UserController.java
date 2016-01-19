package fiftygram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(ModelMap model) {
        return "Java krasava";
    }
}
