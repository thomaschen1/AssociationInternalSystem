package cn.thomaschen.twoidea.service;

import cn.thomaschen.twoidea.dao.activityDao;
import cn.thomaschen.twoidea.entity.manage_activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageActivityService{

    @Autowired
    private activityDao activityDao;

    public int addActivity(long activityID,String name,String type, String functionaary, String telephoneNumber,String startTime,String endTime,String location){
        int n = activityDao.addActivity(activityID,name,type,functionaary,telephoneNumber,startTime,endTime,location);
        return  n;
    }
    public void deleteData(long id){
        activityDao.deleteActivity(id);
    }
    public manage_activity getById(long id){
        return activityDao.queryByIdOnActivity(id);
    }
    public List<manage_activity> getAllData(int offer,int limit){
        return activityDao.queryAllOnActivity(0,50);
    }
}
