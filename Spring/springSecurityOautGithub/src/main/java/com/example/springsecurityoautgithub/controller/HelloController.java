package com.example.springsecurityoautgithub.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientId;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controlador MVC
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index"; //This returns the index.html in the package resources/templates
    }

    @GetMapping("/page1")
    public String page1(Model model) {
        model.addAttribute("message", "Hola mundo desde spring MVC");
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient client,
                        @AuthenticationPrincipal OAuth2User user) {
        //System.out.println( client );
        model.addAttribute("clientName", client.getClientRegistration().getClientName());
        model.addAttribute("username", user.getName() );
        model.addAttribute("userAttributes", user.getAttributes() );
        model.addAttribute("message", "Hola mundo desde spring MVC");
        return "page2";
    }

}
