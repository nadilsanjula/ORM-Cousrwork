package bo.custom;

import bo.SuperBO;
import dto.AdminDto;

import java.util.List;

public interface AdminBo extends SuperBO {
    boolean saveCustomer(AdminDto adminDto) throws Exception;

    boolean check(AdminDto adminDto) throws Exception ;

    List<AdminDto> getAllAdmin() throws Exception ;


    String genarateNextAdminId() throws Exception;
}
