package bo.custom.impl;

import bo.custom.BranchBO;
import dao.DAOFactory;
import dao.custom.BranchDao;
import dto.BranchDto;
import entity.Book;
import entity.Branch;

import java.util.ArrayList;
import java.util.List;

public class BranchBoImpl implements BranchBO {
    BranchDao branchDao = (BranchDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BRANCH);

    @Override
    public String generateNextId() throws Exception{
        return branchDao.generateNextId();
    }

    @Override
    public List<BranchDto> getAllBranch()throws Exception {
        List<Branch> branches = branchDao.getAll();
        List<BranchDto> branchDto = new ArrayList<>();

        for(Branch branch : branches){
            branchDto.add(new BranchDto(
                    branch.getId(),
                    branch.getName()
                    ,branch.getLocation()
                    ,branch.getAddress()
                    ,branch.getAdmin()
            ));
        }
        return branchDto;
    }

    @Override
    public boolean save(BranchDto branchDto) throws Exception{

        return branchDao.save(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }

    @Override
    public boolean deleteBranch(BranchDto branchDto)throws Exception {
        return branchDao.delete(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }

    @Override
    public boolean updateBranch(BranchDto branchDto) throws Exception{
        return branchDao.update(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }
}
