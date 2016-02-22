package fiftygram.controller;

import fiftygram.entity.Likes;
import fiftygram.repository.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/likes")
public class LikesController {
    @Autowired
    private LikesRepository likesRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Likes> getLikes() {
        List<Likes> list = likesRepository.findAll();

        return list;
    }
}
