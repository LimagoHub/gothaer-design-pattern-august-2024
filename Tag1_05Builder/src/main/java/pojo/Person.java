package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    @Builder.Default
    private String id= null;
    @Builder.Default
    private String vorname="Max";
    private String nachname="Mustermann";


}
