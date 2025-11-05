package fr.eni.ludotheque.bo;

import lombok.*;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exemplaire {


    @NonNull
    private String codebarre;

    @NonNull
    private Boolean louable;

}
