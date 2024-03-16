package bo.custom;

import bo.SuperBO;
import dto.UserDto;

import java.util.List;

public interface UserBo extends SuperBO {
    List<UserDto> getAllUser() throws Exception ;

    String generateNextUserId() throws Exception;

    boolean saveUser(UserDto userDto) throws Exception;

    boolean DeleteUser(UserDto userDto) throws Exception ;

    boolean updateUser(UserDto userDto) throws Exception ;

    UserDto SearchUser(String id) throws Exception;
}
