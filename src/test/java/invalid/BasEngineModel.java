package invalid;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-06 11:19
 **/
@Getter
@Setter
public class BasEngineModel {

    private long id ;
    /** 租户ID */
    private long tenantId ;
    /** 部门ID */
    private long  deptId ;
    /** 发动机型号 */
    private String code = "发动机型号" ;
    /** 生产企业机构代码 */
    private String factoryCode  ="生产企业机构代码";
    /** 生产企业厂商名称 */
    private String factoryName ="生产企业厂商名称" ;
    /** 联系人姓名 */
    private String contactorName ="联系人姓名" ;
    /** 联系人电话 */
    private String contactorPhone = "联系人电话" ;
    /** 排放水平;字典表 */
    private String emissionLevelType ="排放水平" ;
    /** 发动机排量（L） */
    private String engineSweptVolume ="发动机排量";
    /** 参考扭矩（Nm） */
    private String  engineTorque = "参考扭矩" ;
    /** 最大功率/转速（kw/r/min） */
    private String engineMaxPowerSpeed = "最大功率" ;
    /** 最大扭矩/转速（Nm/r/min） */
    private String engineMaxTorqueSpeed ="最大扭矩" ;
    /** 软件标定识别号（CALID） */
    private String engineCalidSoftwareSn ="软件标定识别号" ;
    /** 标定验证码（CVN） */
    private String engineCvnCalibrationCode ="标定验证码" ;
    /** 接口照片;文件表 */
    private long obdInterfacePhotoId ;
    /** 备案状态;0:待提交  3:审核通过  4:审核未通过 5:提交超时 */
    private int auditStatus ;
    /** 备案时间 */
    private long auditTime ;
    /** 备案人 */
    private String auditUser ="备案人";
    /** 备案失败原因 */
    private  String auditFailureReason ="备案失败原因" ;
    /** 备注 */
    private String  description ="备注";
    /** 创建人 */
    private String createUser ="创建人" ;
    /** 创建时间 */
    private long createTime ;
    /** 修改人 */
    private String updateUser ="修改人";
    /** 修改时间 */
    private long updateTime ;
    /** 状态 */
    private int status ;
    /** 是否已删除 */
    private int isDeleted ;

    public static void main(String[] args) {
        BasEngineModel bean = new BasEngineModel();
        List<BasEngineModel> li=new ArrayList<>();
        li.add(bean);
        JSONArray parseArray = JSONArray.parseArray(JSON.toJSONString(li));
        System.out.println(parseArray.toJSONString());
    }
}
