package invalid;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyTest
 * @description:
 * @author: wh
 * @create: 2021-01-06 10:31
 **/


public class BasVehicleModel {

    private int   id ;
    /** 租户ID */
    private int  tenantId ;
    /** 部门ID */
    private int  deptId ;
    /** 车辆型号 */
    private String  vehicleModel = "车辆型号" ;
    /** 车系;字典表 */
    private String vehicleStyle ="车系;字典表" ;
    /** 车辆类型;字典表 */
    private String vehicleType ="车辆类型" ;
    /** 生产企业机构代码 */
    private String factoryCode = "生产企业机构代码";
    /** 生产企业厂商名称 */
    private String factoryName ="生产企业厂商名称" ;
    /** 联系人姓名 */
    private String  contactorName ="联系人姓名" ;
    /** 联系人电话 */
    private String contactorPhone = "联系人电话" ;
    /** 燃料类型 */
    private String engineFuelType = "燃料类型" ;
    /** 尿素箱容积(L) */
    private String ureaTankCapacity ="尿素箱容积";
    /** 底盘型号 */
    private String chassisModel = "底盘型号";
    /** 变速器型号 */
    private String transmissionModel ="变速器型号";
    /** 油箱容积 */
    private String fuelTankCapacity = "油箱容积" ;
    /** 车型检测报告文件;文件表 */
    private Long detectionReportId ;
    /** 备案状态;0:待提交3:审核通过4:审核未通过5:提交超时 */
    private int  auditStatus ;
    /** 备案时间 */
    private long  auditTime ;
    /** 备案人 */
    private String  auditUser= "备案人" ;
    /** 备案失败原因 */
    private String auditFailureReason ="备案失败原因" ;
    /** 备注 */
    private String description ="备注" ;
    /** 创建人 */
    private String createUser ="创建人" ;
    /** 创建时间 */
    private long createTime ;
    /** 修改人 */
    private String updateUser = "修改人" ;
    /** 修改时间 */
    private long  updateTime ;
    /** 状态 */
    private int status ;
    /** 是否已删除 */
    private int isDeleted ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleStyle() {
        return vehicleStyle;
    }

    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getContactorName() {
        return contactorName;
    }

    public void setContactorName(String contactorName) {
        this.contactorName = contactorName;
    }

    public String getContactorPhone() {
        return contactorPhone;
    }

    public void setContactorPhone(String contactorPhone) {
        this.contactorPhone = contactorPhone;
    }

    public String getEngineFuelType() {
        return engineFuelType;
    }

    public void setEngineFuelType(String engineFuelType) {
        this.engineFuelType = engineFuelType;
    }

    public String getUreaTankCapacity() {
        return ureaTankCapacity;
    }

    public void setUreaTankCapacity(String ureaTankCapacity) {
        this.ureaTankCapacity = ureaTankCapacity;
    }

    public String getChassisModel() {
        return chassisModel;
    }

    public void setChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    public String getTransmissionModel() {
        return transmissionModel;
    }

    public void setTransmissionModel(String transmissionModel) {
        this.transmissionModel = transmissionModel;
    }

    public String getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(String fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Long getDetectionReportId() {
        return detectionReportId;
    }

    public void setDetectionReportId(Long detectionReportId) {
        this.detectionReportId = detectionReportId;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public long getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(long auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    public String getAuditFailureReason() {
        return auditFailureReason;
    }

    public void setAuditFailureReason(String auditFailureReason) {
        this.auditFailureReason = auditFailureReason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }



    public static void main(String[] args) {
        BasVehicleModel bean = new BasVehicleModel();
        List<BasVehicleModel> li=new ArrayList<>();
        li.add(bean);
        JSONArray parseArray = JSONArray.parseArray(JSON.toJSONString(li));
        System.out.println(parseArray.toJSONString());
    }

}
