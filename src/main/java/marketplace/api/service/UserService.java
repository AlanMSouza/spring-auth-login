package marketplace.api.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import marketplace.api.dto.UserRequest;
import marketplace.api.user.User;
import marketplace.api.user.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public User cadastrarUser(UserRequest userRequest){
        User user = new User();
        user.setNome(userRequest.getNome());
        user.setEmail(userRequest.getEmail());
        user.setSenha(passwordEncoder.encode(userRequest.getSenha()));
        user.setTipo(userRequest.getTipo());
        
        return repository.save(user);
    }
}
