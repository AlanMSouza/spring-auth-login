package marketplace.api.dto;

import lombok.Getter;
import lombok.Setter;
import marketplace.api.user.Tipo;

@Getter
@Setter
public class UserRequest {

    private String nome;
    private String email;
    private String senha;
    private Tipo tipo;
}
