package cn.thomaschen.twoidea.service;

import cn.thomaschen.twoidea.dao.PersonnelDao;
import cn.thomaschen.twoidea.entity.manage_people;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private PersonnelDao personnelDao;

    public manage_people get(long id) {
        manage_people managepeople = personnelDao.queryById(id);
        return managepeople;
   }
}
