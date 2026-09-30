package ru.mtusi.rbpo.lab1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping(value = "/message", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage() {
        return "Задание выполнено, всё работает";
    }

    @GetMapping(value = "/number", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getNumber() {
        return 42;
    }
}
