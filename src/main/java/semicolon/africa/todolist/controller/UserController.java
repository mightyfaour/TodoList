package semicolon.africa.todolist.controller;

import org.springframework.web.bind.annotation.*;
import semicolon.africa.todolist.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("/users")//http://localhost:8080/users
public class UserController{

    @GetMapping("/getUsers")
    public String getUser(){
        return "get user was called";
    }

    @PostMapping("/createUsers")
    public String createUser(@RequestBody UserDetailsRequestModel userDetails){
        return "create user was called";
    }

    @PutMapping("/updateUsers")
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping("/deleteUsers")
    public String deleteUser(){
        return "delete user was called";
    }

}
