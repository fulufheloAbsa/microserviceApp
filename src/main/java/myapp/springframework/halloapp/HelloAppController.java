package myapp.springframework.halloapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {
@RequestMapping
    private String halloApp(){
    return "Hallo world from spring boot, have fun!!";
 }
}