package marketplace.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marketplace.api.dto.LoginRequest;
import marketplace.api.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service){
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        boolean autenticado = service.authenticate(loginRequest);

        if(autenticado){
            return ResponseEntity.ok("Login bem-sucedido!");
        }else{
            return ResponseEntity.status(401).body("Credenciais inválidas");
        }
    }
}
