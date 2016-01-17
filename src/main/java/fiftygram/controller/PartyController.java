package fiftygram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("party")
public class PartyController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getParty(ModelMap model) {
        return "My party!";
    }
}
