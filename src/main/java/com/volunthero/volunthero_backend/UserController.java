package com.volunthero.volunthero_backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final AuthService authService;

    public UserController(AuthService authService)
    {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user)
    {
        return authService.signup(user);
    }
    
    @PostMapping("/login")
    public User login(@RequestBody User user)
    {
        return authService.login(user.getEmail(), user.getPassword());
    }
}
