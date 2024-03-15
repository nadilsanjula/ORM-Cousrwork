package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Book {
    @Id
    private String id;
    private String name;
    private String type;
}
