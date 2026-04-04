package com.volunthero.volunthero_backend;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User signup(User user)
    {
        return userRepository.save(user);
    }

    public User login(String email, String password)
    {
        User user = userRepository.findByEmail(email).orElse(null);
        if (user != null && user.getPassword().equals(password))
        {
            return user;
        }
        return null;
    }
}
