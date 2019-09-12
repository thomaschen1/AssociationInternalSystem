package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.manage_activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class activityDaoTest {

    @Resource
    activityDao activityDao;
    @Test
    public void addActivity() {

        long activityID = 3;
        String name = "活动2";
        String type = "比赛2";
        String functionaary = "zhu";
        String phoneNumber = "15648923476";
        String starTime = "2019/06/22 19:00";
        String endTime = "2019/06/22 22:00";
        String location = "番职风操3";

        int n = activityDao.addActivity(activityID,name,type,functionaary,phoneNumber,starTime,endTime,location);
        System.out.println("插入" + n + "条数据");
    }

    @Test
    public void deleteActivity() {
    }

    @Test
    public void queryByIdOnActivity() {
        long id = 2;
        manage_activity activity = activityDao.queryByIdOnActivity(id);
        System.out.println(activity);
    }

    @Test
    public void queryAllOnActivity() {

        List<manage_activity> activityList = activityDao.queryAllOnActivity(0,10);
        for (manage_activity activity: activityList) {
            System.out.println(activity);
        }
    }
}