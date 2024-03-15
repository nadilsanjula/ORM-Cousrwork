package bo.custom;

import bo.SuperBO;

import java.util.List;

public interface BranchBO extends SuperBO {

    String generateNextId() throws Exception;

    List<BranchDto> getAllBranch()throws Exception;

    boolean save(BranchDto branchDto) throws Exception;

    boolean deleteBranch(BranchDto branchDto)throws Exception ;

    boolean updateBranch(BranchDto branchDto) throws Exception;
}
