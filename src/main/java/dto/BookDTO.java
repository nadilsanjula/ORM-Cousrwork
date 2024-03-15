package dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BookDTO {
    private String id;
    private String name;
    private String type;
}
