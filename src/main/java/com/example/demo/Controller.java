package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    //Json 응답
    @ResponseBody
    @GetMapping("/json-test")
    public User jsonTest() {
        return new User("유명한", 24, "19991013", "남자");
    }

    //Json 리스트 응답
    @ResponseBody
    @GetMapping("/json-list-test")
    public List<User> jsonListTest() {

        List<User> users = new ArrayList<>();
        users.add(new User("유명한", 24, "19991013", "남자"));
        users.add(new User("함현준", 24, "19991231", "남자"));
        users.add(new User("한상범", 24, "19991312", "여자"));
        users.add(new User("홍찬의", 24, "19996549", "여자"));

        return users;
    }
}
