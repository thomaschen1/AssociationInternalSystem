package cn.thomaschen.twoidea.service;

import cn.thomaschen.twoidea.dao.participateDao;
import cn.thomaschen.twoidea.entity.join_activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class ManageParticipationImpl {

    @Autowired
    private participateDao participateDao;

    public int addParticipate(@PathVariable("personnelid") long personnelid, @PathVariable("activityid") long activityid, @PathVariable("Achivements") String Achivements, @PathVariable("activityTime") String activityTime){
        int n = participateDao.addParticipate(personnelid,activityid,Achivements,activityTime);
        return n;
    }

    public void deleteParticipate(long id){
        participateDao.deleteParticipate(id);
    }

    public join_activity getById(long id){
        return participateDao.queryByidOnparticipate(id);
    }

    public List<join_activity> getAllData(int offet,int limit){
        return participateDao.queryAllOnparticipate(0,50);
    }
}
