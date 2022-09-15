package kg.megacom.finally_test.controllers;

import jdk.internal.org.jline.utils.Status;
import kg.megacom.finally_test.models.CheckStatusResponse;
import kg.megacom.finally_test.models.User;
import kg.megacom.finally_test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    private User save(@RequestBody User user){
        return userService.save(user);
    }
    @PostMapping("/add/file")
    private User addImageToUser(@RequestParam Long userId, @RequestPart MultipartFile file){
        User user = userService.getById(userId);
        return  userService.addUser(user, file);
    }

    @GetMapping("/get")
    private CheckStatusResponse getUsers(@RequestParam(required = false, defaultValue = "ONLINE") Status status,
                                         @RequestParam(required = false) Date date) {
        return null;
    }

}
