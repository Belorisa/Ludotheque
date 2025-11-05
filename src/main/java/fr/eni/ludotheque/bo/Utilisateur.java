package fr.eni.ludotheque.bo;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Document("utilisateur")
public class Utilisateur {

    @Id
    private Integer id;

    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String  role;
}
