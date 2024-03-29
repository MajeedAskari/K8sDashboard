package ir.ac.um.k8s.rest.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import ir.ac.um.k8s.beans.Welcome;

@Controller
public class WelcomeController {

private static final String welcomemsg = "Welcome Mr. %s!";

    @GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {

        return new Welcome(String.format(welcomemsg, name));

    }
}