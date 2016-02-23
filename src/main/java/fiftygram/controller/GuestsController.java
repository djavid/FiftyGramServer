package fiftygram.controller;

import fiftygram.entity.Guests;
import fiftygram.repository.GuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    private GuestsRepository guestsRepository;


    @RequestMapping(value = "/get/partyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Guests> getGuestsByPartyId(@PathVariable("id") long partyId) {
        return guestsRepository.findByPartyId(partyId);
    }
}
