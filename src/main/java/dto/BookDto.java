package dto;

import entity.Branch;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class BookDto {
    private String id;
    private String title;
    private String author;
    private String Genre;
    private String status;
    private Branch branch;
}
