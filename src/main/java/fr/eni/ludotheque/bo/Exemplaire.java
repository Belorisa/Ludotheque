package fr.eni.ludotheque.bo;

import lombok.*;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exemplaire {

    @Id
    private String id;

    @NonNull
    private String codebarre;

    @NonNull
    private Boolean louable;

}
