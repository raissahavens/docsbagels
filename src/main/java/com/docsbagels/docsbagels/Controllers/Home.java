package com.docsbagels.docsbagels.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @GetMapping("index")
    public String index() {
        return "Welcome";
    }

    @GetMapping("form")
    public String form() {
        return "form";
    }
}

// ADD in form html
// <div id = "clientProfile">
//    <h2>My Profile</h2>
//    <p th:text = "${client.skinType}"></p>
//</div>
