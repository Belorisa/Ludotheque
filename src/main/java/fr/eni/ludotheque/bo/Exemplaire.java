package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Exemplaire {
    private Integer id;
    @NonNull
    private String codebarre;
    @NonNull
    private Boolean louable;
    @NonNull
    private LocalDate debut;
}
