package cn.thomaschen.twoidea.cortorller;

import cn.thomaschen.twoidea.base.BaseEntity;
import cn.thomaschen.twoidea.base.JsonResponse;
import cn.thomaschen.twoidea.entity.join_activity;
import cn.thomaschen.twoidea.entity.manage_activity;
import cn.thomaschen.twoidea.entity.manage_people;
import cn.thomaschen.twoidea.service.ManageActivityService;
import cn.thomaschen.twoidea.service.ManageParticipationImpl;
import cn.thomaschen.twoidea.service.ManagePersonServiceImpl;
import cn.thomaschen.twoidea.service.TestService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/twoidea/managepeople")
public class TestCortorller<R extends BaseEntity> {

    @Autowired
    private TestService testService;

    @Autowired
    private ManagePersonServiceImpl managePersonService;

    @Autowired
    private ManageParticipationImpl manageParticipation;

    @Autowired
    private ManageActivityService manageActivityService;

    @RequestMapping(value = "/getperson/{id}",method = RequestMethod.GET)
    public manage_people queryById(@PathVariable Long id,Model model){
        manage_people managepeople = testService.get(id);
        model.addAttribute("managepeople",managepeople);
        return managepeople;
   }
@RequestMapping(value = "/addPerson",method = RequestMethod.POST)
   //public JsonResponse addPerson(String name, String IDcardNO, String PhoneNumber, String sex, String Emailaddress, String schoolName, String address, String remarks){
     public JsonResponse addPerson(@RequestBody Map<String,String> data,HttpServletRequest request){
        String name = data.get("userName");
        String sex = data.get("sex");
        String IDcardNO = data.get("shenfenzheng");
        String PhoneNumber = data.get("phoneNumber");
        String Emailaddress = data.get("emailaddress");
        String schoolName = data.get("school");
        String address = data.get("address");
        String remarks = data.get("comment");
        int i = managePersonService.addPerson(name,IDcardNO,PhoneNumber,sex,Emailaddress,schoolName,address,remarks);
    if(i == 1){
        return JsonResponse.newOk("success!");
    }
    else
        return JsonResponse.newError("插入记录出错");

   }
   @RequestMapping(value = "/deletePersonData/{id}")
   public void deleteData(@PathVariable Long id,Model model){
        managePersonService.deletePerson(id);

   }
   @RequestMapping(value = "/getByIdOfPerson/{id}" ,method = RequestMethod.GET)
   public manage_people getById(@PathVariable long id){
        return managePersonService.getById(id);
   }

   @RequestMapping(value = "/getAllOfPerson",method = RequestMethod.GET)
    public List<manage_people> getAll(HttpServletRequest request){
        List<manage_people> list = managePersonService.getAllList(0,10);

        return list;
   }
    /* -------------------------------- 活动表测试 ---------------------------------------------------------*/

  @RequestMapping(value = "/addActivity")
   public int addActivity(Long activityID,String name,String type, String functionaary, String telephoneNumber,String startTime,String endTime,String location){
        int i = manageActivityService.addActivity(activityID,name,type,functionaary,telephoneNumber,startTime,endTime,location);

        return i;
   }

   @RequestMapping(value = "/deleteActivityData/{id}")
   public void deleteActivityData(@PathVariable long id){
        manageActivityService.deleteData(id);
   }

   @RequestMapping(value = "/getByIdOfActivity/{id}",method = RequestMethod.GET)
   public manage_activity getByIdOfActivity(@PathVariable long id){
        return manageActivityService.getById(id);
   }

   @RequestMapping(value = "/getAllOfActivity",method = RequestMethod.GET)
   public List<manage_activity> getAllOfActivity(){
        List<manage_activity> list = manageActivityService.getAllData(0,10);
        return list;
   }


   /* ---------------------- 参与表测试 -----------------------------------*/

    @RequestMapping(value = "/addParticipation",method = RequestMethod.POST)
    //public int addParticipation(@PathVariable("personnelId") long personnelId,@PathVariable("activityId") long activityId,@PathVariable("Achivements") String Achivements,@PathVariable("ActivityTime") String ActivityTime){
    public int addParticipation(@RequestBody Map<String,String> data, HttpServletRequest request){
        Long personnelId =Long.parseLong(data.get("personnelid"));
        Long activityId = Long.parseLong(data.get("activityid"));
        String Achivements = data.get("Achivements");
        String ActivityTime = data.get("activityTime");
        int i = manageParticipation.addParticipate(personnelId,activityId,Achivements,ActivityTime);
        return i;
    }

    @RequestMapping(value = "/deleteParticipationData/{id}",method = RequestMethod.GET)
    public void deleteParticipationDate(@PathVariable long id){
        manageParticipation.deleteParticipate(id);
    }

    @RequestMapping(value = "/getByIdOfParticipation/{id}",method = RequestMethod.GET)
    public join_activity getByIdOfParticipation(@PathVariable long id){
        return manageParticipation.getById(id);
    }

    @RequestMapping(value = "/getAllOfParticipation")
    public List<join_activity> getAllOfParticipation(){
        List<join_activity> list = manageParticipation.getAllData(0,10);
        return  list;
    }
}
