package cn.thomaschen.twoidea.service;

import cn.thomaschen.twoidea.dao.PersonnelDao;
import cn.thomaschen.twoidea.entity.manage_people;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagePersonServiceImpl implements ManagePersonService{

    @Autowired
    private PersonnelDao personnelDao;

    @Override
    public int addPerson(String name, String IDcardNO, String PhoneNumber, String sex, String Emailaddress, String schoolName, String address, String remarks) {
        int n = personnelDao.addPersonnel(name,IDcardNO,PhoneNumber,sex,Emailaddress,schoolName,address,remarks);
        return n;
    }

    @Override
    public void deletePerson(long id) {
        personnelDao.deletePersonnel(id);
    }

    @Override
    public manage_people getById(long id) {
        return personnelDao.queryById(id);
    }

    @Override
    public List<manage_people> getAllList(int offet, int limit) {
        return personnelDao.queryAll(0,50);
    }
}
