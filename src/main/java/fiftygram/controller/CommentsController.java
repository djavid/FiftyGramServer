package fiftygram.controller;

import fiftygram.entity.Comments;
import fiftygram.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsRepository commentsRepository;


    @RequestMapping(value = "/get/partyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Comments> getCommentsByPartyId(@PathVariable("id") long partyId) {
        return commentsRepository.findByPartyId(partyId);
    }
}
