package tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserTm {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
}
