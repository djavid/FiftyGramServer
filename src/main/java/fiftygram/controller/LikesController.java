package fiftygram.controller;

import fiftygram.entity.Likes;
import fiftygram.repository.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/likes")
public class LikesController {

    @Autowired
    private LikesRepository likesRepository;


    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Likes> getAllLikes() {
        return likesRepository.findAll();
    }

    @RequestMapping(value = "/get/partyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Likes> getLikeByPartyId(@PathVariable("id") long partyId) {
        return likesRepository.findByPartyId(partyId);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public HttpStatus insertLikeByEntity(@RequestBody Likes like) {
        if (like != null) {
            try {
                likesRepository.save(like);
                likesRepository.flush();
            } catch (Throwable e) {
                System.out.println(e.toString());
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/insert/array", method = RequestMethod.POST)
    public HttpStatus insertLikesByArray(@RequestBody List<Likes> likes) {
        if (likes.size() != 0) {
            try {
                likesRepository.save(likes);
                likesRepository.flush();
            } catch (Throwable e) {
                System.out.println(e.toString());
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public HttpStatus deleteLikeByEntity(@RequestBody Likes like) {
        if (like != null) {
            try {
                likesRepository.delete(like);
            } catch (Throwable e) {
                System.out.println(e.toString());
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public HttpStatus deleteLikeById(@PathVariable("id") long id) {
        if (id > 0) {
            try {
                likesRepository.delete(id);
            } catch (Throwable e) {
                System.out.println(e.toString());
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

        return HttpStatus.OK;
    }
}
