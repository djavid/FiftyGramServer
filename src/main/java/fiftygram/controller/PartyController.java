package fiftygram.controller;

import com.sun.deploy.net.HttpResponse;
import fiftygram.config.DatabaseConfig;
import fiftygram.entity.*;
import fiftygram.repository.PartyRepository;
import fiftygram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Date;


@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    private PartyRepository partyRepository;


    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Party> getParty(ModelMap model) {
        return partyRepository.findAll();
    }

    @RequestMapping(value = "/get/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Party getPartyById(@PathVariable("id") Long id) {
        System.out.println("id: " + id);
        return partyRepository.findOne(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public HttpStatus insertParty(@ModelAttribute Party party) {
        if (party != null) {
            try {
                partyRepository.save(party);
                partyRepository.flush();
            } catch (Throwable e) {
                System.out.println(e.toString());
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

        return HttpStatus.OK;
    }
}
