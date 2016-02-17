package fiftygram.controller;

import fiftygram.interfaces.PartyDAO;
import fiftygram.model.Party;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

@Controller
@RequestMapping("party")
public class PartyController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getParty(ModelMap model) {
        return "My party!";
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    @ResponseBody
    public Party insertParty(ModelMap model) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

        PartyDAO partyDAO = (PartyDAO) context.getBean("partyDAO");
        Party party = new Party(1, 1, "Party in da house!",
                "Best Party!", new Date(2016, 2, 17),
                 new Date(2016, 2, 18), 10, 25.3, 27.5,
                 "Dubki", "Private", "Party", 0);
        partyDAO.insert(party);

        Party party1 = partyDAO.findByPartyId(1);
        System.out.println(party1);

        return party1;
    }
}
