package fr.eni.ludotheque.bo;

import jakarta.annotation.Nullable;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Document("Client")
public class Client {
    @Id
    private ObjectId _id;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String email;

    @NonNull
    private String telephone;

    @NonNull
    private Adresse adresse;

    @Nullable
    private Set<Location>  locations;
}
