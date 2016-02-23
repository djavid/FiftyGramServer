package fiftygram.controller;

import fiftygram.entity.User;
import fiftygram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser(ModelMap model) {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/get/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable("id") Long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(value = "/get/login/{login}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByLogin(@PathVariable("login") String login) {
        return userRepository.findByLogin(login);
    }
}
