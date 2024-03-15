package bo.custom.impl;

import bo.custom.AdminBo;
import dao.DAOFactory;
import dao.custom.AdminDao;
import dto.AdminDto;
import entity.Admin;
import entity.Branch;

import java.util.ArrayList;
import java.util.List;

public class AdminBoImpl implements AdminBo {

    AdminDao adminDao = (AdminDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ADMIN);

    @Override
    public boolean saveCustomer(AdminDto adminDto) throws Exception {
        return adminDao.save(new Admin(adminDto.getId(),adminDto.getName(),adminDto.getPassword(),new ArrayList<Branch>()));
    }

    @Override
    public boolean check(AdminDto adminDto) throws Exception {
        System.out.println("cheak "+adminDto.getName());
        return adminDao.check(new Admin(adminDto.getName(),adminDto.getPassword(),new ArrayList<Branch>()));
    }
    @Override
    public List<AdminDto> getAllAdmin() throws Exception {
        List<Admin> admins = adminDao.getAll();

        List<AdminDto> adminDtoList = new ArrayList<>();

        for(Admin admin :admins){
            adminDtoList.add(new AdminDto(admin.getId(),admin.getName(),admin.getPassword()));
        }
        return adminDtoList;
    }

    @Override
    public String genarateNextAdminId() throws Exception {
        return adminDao.generateNextId();
    }
}
