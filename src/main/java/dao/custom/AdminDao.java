package dao.custom;

import dao.CrudDAO;
import entity.Admin;

public interface AdminDao extends CrudDAO<Admin> {
    boolean check(Admin admin)throws Exception;
}
