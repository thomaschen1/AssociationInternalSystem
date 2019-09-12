package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.join_activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface participateDao {

    /**
     * 插入数据
     * @param personnelid
     * @param activityid
     * @param Achivements
     * @param activityTime
     * @return
     */
    int addParticipate(@Param("personnelid") long personnelid,@Param("activityid") long activityid,@Param("Achivements") String Achivements,@Param("activityTime") String activityTime);

    /**
     * 根据id删除参与者数据
     * @param id
     * @return
     */
    void deleteParticipate(long id);

    /**
     * 根据id查找参与者参与的活动
     * @param id
     * @return
     */
    join_activity queryByidOnparticipate(long id);
    /**
     * 根据偏移量查找活动参与者列表
     * @param offet
     * @param limit
     * @return
     */
    List<join_activity> queryAllOnparticipate(@Param("offet") int offet,@Param("limit") int limit);
}
