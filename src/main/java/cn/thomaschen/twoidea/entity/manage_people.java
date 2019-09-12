package cn.thomaschen.twoidea.entity;

public class manage_people {
    //人员id
    private  long ID;
    //人员名
    private  String name;
    //身份证号
    private  String IDcardNO;
    //性别
    private String sex;
    //电话号码
    private String PhoneNumber;
    //邮箱地址
    private String Emailaddress;
    //在校学校名
    private String schoolName;
    //家庭地址
    private String address;
    //备注信息
    private String remarks;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDcardNO() {
        return IDcardNO;
    }

    public void setIDcardNO(String IDcardNO) {
        this.IDcardNO = IDcardNO;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        Emailaddress = emailaddress;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "manage_people{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", IDcardNO='" + IDcardNO + '\'' +
                ", sex='" + sex + '\'' +
                ", Phone_number='" + PhoneNumber + '\'' +
                ", Emailaddress='" + Emailaddress + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", remarks_news='" + remarks + '\'' +
                '}';
    }
}
