package fiftygram.controller;

import fiftygram.repository.*;
import fiftygram.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private ChatRepository chatRepository;
    private CommentsRepository commentsRepository;
    private FilesRepository filesRepository;
    private FollowersRepository followersRepository;
    private GuestsRepository guestsRepository;
    private LikesRepository likesRepository;
    private PartyRepository partyRepository;
    private UserRepository userRepository;


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Party> getParty(ModelMap model) {
        List<Party> list = partyRepository.findAll();

        return list;
        //return party;
    }
}
