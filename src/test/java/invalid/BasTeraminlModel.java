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
 * @create: 2021-01-06 13:47
 **/
@Setter
@Getter
public class BasTeraminlModel {

    private long id = 1l ;
    /** 租户ID */
    private long tenantId = 1l ;
    /** 部门ID */
    private long deptId = 1l;
    /** 安全芯片型号;芯片型号表 */
    private long chipModelId = 1l ;
    /** 终端型号 */
    private String tboxModel ="终端型号" ;
    /** 终端厂商机构代码 */
    private String factoryCode ="终端厂商机构代码" ;
    /** 终端厂商名称 */
    private String factoryName ="终端厂商名称" ;
    /** 终端厂商说明 */
    private String factoryNote ="终端厂商说明";
    /** 终端厂商执照图片;文件表 */
    private long factoryLicenceId = 1l  ;
    /** 联系人姓名 */
    private String contactorName ="联系人姓名" ;
    /** 联系人电话 */
    private String contactorPhone ="联系人电话"  ;
    /** 协议类型;GB17691/GB32960 */
    private String  protocolType ="协议类型" ;
    /** 终端检测报告编号 */
    private String reportNo = "终端检测报告编号" ;
    /** 终端检测报告扫描件;文件表 */
    private long reportImgId ;
    /** 终端补充文件;文件表 */
    private long tboxFileId ;
    /** 授权文件;文件表 */
    private long authorizeFileId ;
    /** 备案申请序号;（唯一标识），用于查询备案结果 */
    private long requestId ;
    /** 备案状态;(0:待提交 1:待审核  3:审核通过  4:审核未通过 5:提交超时 6: 提交失败 */
    private int auditStatus ;
    /** 备案时间 */
    private  long auditTime ;
    /** 备案人 */
    private String auditUser ="备案人" ;
    /** 备案失败原因 */
    private String  auditFailureReason ="备案失败原因";
    /** 授权申请序号;（唯一标识），用于查询授权结果 */
    private long  authorizeRequestId ;
    /** 授权状态;(0:待提交 1:待审核  3:审核通过  4:审核未通过 5:提交超时 6: 提交失败 */
    private int authorizeStatus ;
    /** 授权时间 */
    private long authorizeTime ;
    /** 授权人 */
    private String authorizeUser ="授权人" ;
    /** 授权失败原因 */
    private String auditFailureReason1 ="授权失败原因";
    /** 备注 */
    private String description ="备注";
    /** 创建人 */
    private String  createUser ="创建人" ;
    /** 创建时间 */
    private long createTime ;
    /** 修改人 */
    private String updateUser ="修改人";
    /** 修改时间 */
    private long updateTime ;
    /** 状态 */
    private int status ;
    /** 是否已删除 */
    private int  isDeleted ;

    public static void main(String[] args) {
        BasTeraminlModel bean = new BasTeraminlModel();
        List<BasTeraminlModel> li=new ArrayList<>();
        li.add(bean);
        JSONArray parseArray = JSONArray.parseArray(JSON.toJSONString(li));
        System.out.println(parseArray.toJSONString());
    }
}
