package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.join_activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class participateDaoTest {

    @Resource
    participateDao participateDao;

    @Test
    public void addParticipate() {
        long personnelId = 2;
        long activityId = 2;
        String Achivements = "";
        String ActivityTime = "2019/04/15";

        int n = participateDao.addParticipate(personnelId,activityId,Achivements,ActivityTime);
        System.out.println("添加" + n + "条数据");
    }

    @Test
    public void deleteParticipate() {
        long id = 3;
        participateDao.deleteParticipate(id);
        System.out.println("成功删除数据");
    }

    @Test
    public void queryByidOnparticipate() {
        long id = 3;
        join_activity participate = participateDao.queryByidOnparticipate(id);
        System.out.println(participate);
    }

    @Test
    public void queryAllOnparticipate() {
        List<join_activity> list = participateDao.queryAllOnparticipate(0,2);
        for (join_activity list1 : list){

            System.out.println(list1);
        }
    }
}