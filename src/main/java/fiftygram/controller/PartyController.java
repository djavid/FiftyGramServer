package fiftygram.controller;

import fiftygram.config.DatabaseConfig;
import fiftygram.entity.Party;
import fiftygram.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    private PartyRepository partyRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Party> getParty(ModelMap model) {
        List<Party> list = partyRepository.findAll();

        return list;
        //return party;
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    @ResponseBody
    public Party insertParty(ModelMap model) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

        //PartyDAO partyDAO = (PartyDAO) context.getBean("partyDAO");
        Party party = new Party(1, 1, "Party in da house!",
                "Best Party!", new Date(2016, 2, 17),
                 new Date(2016, 2, 18), 10, 25.3, 27.5,
                 "Dubki", "Private", "Party", 0);
        //partyDAO.insert(party);

        //Party party1 = partyDAO.findByPartyId(1);
        //System.out.println(party1);

        //return party1;
        return party;
    }
}
