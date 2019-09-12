package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.manage_people;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonnelDao {

    /**
     * 插入成员
     * @param name
     * @param IDcardNO
     * @param PhoneNumber
     * @param sex
     * @param Emailaddress
     * @param schoolName
     * @param address
     * @param remarks
     * @return
     */
    int addPersonnel(@Param("name") String name, @Param("IDcardNO") String IDcardNO, @Param("PhoneNumber") String PhoneNumber, @Param("sex") String sex,
                     @Param("Emailaddress") String Emailaddress, @Param("schoolName") String schoolName,@Param("address") String address,@Param("remarks") String remarks);

    /**
     * 删除成员
     *
     * @param personnelid
     * @return删除的成员个数
     */
    void deletePersonnel(long personnelid);

    /**
     * 根据id查询成员信息
     *
     * @param personnelid
     * @return
     */
    manage_people queryById(long personnelid);

    /**
     * 根据偏移量查询成员数据列表
     *
     * @param offet
     * @param limit
     * @return
     */
    List<manage_people> queryAll(@Param("offet") int offet, @Param("limit") int limit);
}
