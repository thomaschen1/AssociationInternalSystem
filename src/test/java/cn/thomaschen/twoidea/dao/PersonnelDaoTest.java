package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.manage_people;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit加载启动时加载springIOC 容器
 * spring-test junit
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
//告诉junit spring配置文件
//@ContextConfiguration({ "classpath:spring/spring-dao.xml"})
public class PersonnelDaoTest {

    //注入Dao实现类依赖
    @Resource
    private PersonnelDao personnelDao;

    @Test
    public void addPersonnel() {
        String name = "chen";
        String card = "440524199901011475";
        String phoneNumber = "14725836952";
        String sex = "男";
        String Emailaddress = "qq@.com";
        String schoolName = "番职";
        String address = "广东省";
        String remarks = "";

        int n = personnelDao.addPersonnel(name,card,phoneNumber,sex,Emailaddress,schoolName,address,remarks);
        System.out.println("添加"+ n + "条记录");
    }

    @Test
    public void deletePersonnel() {
        long id = 1;
        personnelDao.deletePersonnel(id);
        System.out.println("成功删除信息");
    }

    @Test
    public void queryById() {
        long id = 3;
        manage_people personnel = personnelDao.queryById(id);
        System.out.println(personnel.getName());
        System.out.println(personnel.toString());
    }

    @Test
    public void queryAll() {
        List<manage_people> personnels = personnelDao.queryAll(0,3);
        for (manage_people personne : personnels){
            System.out.println(personne);
        }
    }
}