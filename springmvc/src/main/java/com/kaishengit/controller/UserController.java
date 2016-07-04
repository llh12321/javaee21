package com.kaishengit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String list(){

        return "users/list";
    }

    @RequestMapping(value = "/{id:\\d+}",method = RequestMethod.GET)
    public String showUser(@PathVariable Integer id){

        logger.debug("Id:{}",id);
        return "users/photo";

    }



    @RequestMapping(value = "/{userId:\\d+}/photo/catalog/{catalogId:\\d+}",method = RequestMethod.GET)
    public String showUserPhoto(@PathVariable Integer userId,@PathVariable Integer catalogId){

        logger.debug("userId : {} catalogId :{}",userId,catalogId);
        return "users/photo";
    }
}
