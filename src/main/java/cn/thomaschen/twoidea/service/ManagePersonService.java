package cn.thomaschen.twoidea.service;

import cn.thomaschen.twoidea.entity.manage_people;

import java.util.List;

public interface ManagePersonService {

    /**
     * 添加人员
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
    public int addPerson(String name, String IDcardNO, String PhoneNumber, String sex,
                         String Emailaddress, String schoolName, String address, String remarks);

    public void deletePerson(long id);

    public manage_people getById(long id);

    public List<manage_people> getAllList(int offet,int limit);

}
