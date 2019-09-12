package cn.thomaschen.twoidea.base;

public class JsonResponse {

    /**结果状态 */
    String state;
    /**结果描述*/
    String description ;
    /**正常的返回数据*/
    Object data ;
    /**分页信息*/
    //Pagination pagination ;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 正确的返回值200
     * @param object
     * @return
     */
    public static JsonResponse newOk(Object object){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setData(object);
        jsonResponse.setState("200");
        return jsonResponse ;
    }

    /**有错误描述的返回结果 错误码统一返回5000*/
    public static JsonResponse newError(String description){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setState("5000");
        jsonResponse.setDescription(description);
        return jsonResponse ;
    }
}
