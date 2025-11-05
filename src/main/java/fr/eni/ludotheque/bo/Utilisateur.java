package fr.eni.ludotheque.bo;



import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Document("Utilisateur")
public class Utilisateur {

    @Id
    private ObjectId _id;

    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String  role;
}
