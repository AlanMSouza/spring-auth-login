package marketplace.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marketplace.api.dto.UserRequest;
import marketplace.api.service.UserService;
import marketplace.api.user.User;

@RestController
@RequestMapping("/users")
public class UserController {
    

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<User> cadastrar(@RequestBody UserRequest userRequest){
        User user = service.cadastrarUser(userRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
