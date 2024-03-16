package bo.custom.impl;

import bo.custom.UserBo;
import dao.DAOFactory;
import dao.custom.UserDao;
import dto.UserDto;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserBoImpl implements UserBo {
    UserDao userDao = (UserDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);
    @Override
    public List<UserDto> getAllUser() throws Exception {
        List<User> users = userDao.getAll();
        List<UserDto> userDto = new ArrayList<>();

        for(User user : users){
            userDto.add(new UserDto(
                    user.getId(),
                    user.getName(),
                    user.getAddress(),
                    user.getEmail(),
                    user.getPhone()
            ));
        }
        return userDto;
    }

    @Override
    public String generateNextUserId() throws Exception {
        return userDao.generateNextId();
    }

    @Override
    public boolean saveUser(UserDto userDto) throws Exception {
        return userDao.save(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    @Override
    public boolean DeleteUser(UserDto userDto) throws Exception {
        return userDao.delete(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    @Override
    public boolean updateUser(UserDto userDto) throws Exception {
        return userDao.update(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    @Override
    public UserDto SearchUser(String id) throws Exception {
        User user = userDao.search(id);

        return new UserDto(
                user.getId(),
                user.getName(),
                user.getAddress(),
                user.getEmail(),
                user.getPhone()
        );
    }
}
