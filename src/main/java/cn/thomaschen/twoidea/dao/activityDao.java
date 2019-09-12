package cn.thomaschen.twoidea.dao;

import cn.thomaschen.twoidea.entity.manage_activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface activityDao {

    /**
     * 插入数据
     * @param activityID
     * @param name
     * @param type
     * @param functionaary
     * @param phoneNumber
     * @param starTime
     * @param endTime
     * @param location
     * @return
     */
    int addActivity(@Param("activityID") long activityID, @Param("name") String name, @Param("type") String type,
                    @Param("functionaary") String functionaary,@Param("phoneNumber") String phoneNumber,@Param("starTime") String starTime,@Param("endTime") String endTime,@Param("location") String location);

    /**
     * 删除活动
     * @param activityid
     * @return删除的成员个数
     */
    void deleteActivity(long activityid);

    /**
     * 根据id查询活动信息
     * @param activityid
     * @return
     */
    manage_activity queryByIdOnActivity(long activityid);

    /**
     * 根据偏移量查询活动数据列表
     * @param offet
     * @param limit
     * @return
     */
    List<manage_activity> queryAllOnActivity( @Param("offet") int offet, @Param("limit") int limit);
}
