package marketplace.api.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import marketplace.api.dto.LoginRequest;
import marketplace.api.user.User;
import marketplace.api.user.UserRepository;

@Service
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository repository, PasswordEncoder passwordEncoder){
        this.repository =  repository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean authenticate(LoginRequest loginRequest){
        User user = repository.findByEmail(loginRequest.getEmail()).orElse(null);

        if(user == null){
            return false;
        }

        return passwordEncoder.matches(loginRequest.getSenha(), user.getSenha());
    }
}
