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
 * @create: 2021-01-06 14:27
 **/
@Getter
@Setter
public class BasChipModel {

    private long id ;
    /** 租户ID */
    private long tenantId ;
    /** 部门ID */
    private long deptId ;
    /** 芯片型号;字典表 */
    private String chipModel = "芯片型号" ;
    /** 芯片说明 */
    private String chipNote = "芯片说明" ;
    /** 芯片厂商代码 */
    private String factoryCode = "芯片厂商代码" ;
    /** 芯片厂商名称 */
    private String factoryName ="芯片厂商名称" ;
    /** 厂商说明 */
    private String factoryNote = "厂商说明" ;
    /** 联系人姓名 */
    private String contactorName = "联系人姓名" ;
    /** 联系人电话 */
    private int contactorPhone ;
    /** 厂商执照图片;文件表 */
    private long  chipFactoryLicenceId ;
    /** ISO9001执照文件;文件表 */
    private long  iso9001ImgId ;
    /** ISO14001资质文件;文件表 */
    private long iso14001ImgId ;
    /** 国密资质文件;文件表 */
    private long guomiImgId ;
    /** 芯片资质文件;文件表 */
    private long chipFileId ;
    /** 厂家授权证书;文件表 */
    private long authorizeFileId ;
    /** 备案申请序号;（唯一标识），用于查询备案结果 */
    private long auditRequestId ;
    /** 备案状态;0:待提交 1:待审核  3:审核通过  4:审核未通过 5:提交超时 6: 提交失败 */
    private int auditStatus ;
    /** 备案时间 */
    private long auditTime ;
    /** 备案人 */
    private String auditUser ="备案人" ;
    /** 备案失败原因 */
    private String auditFailureReason ="备案失败原因" ;
    /** 标识符申请序号;（唯一标识），用于查询备案结果 */
    private long identifierRequestId ;
    /** 标识符 */
    private long identifier ;
    /** 标识符申请状态;0:待提交 1:待审核  3:审核通过  4:审核未通过 5:提交超时 6: 提交失败 */
    private int identifierStatus ;
    /** 标识符申请时间 */
    private long identifierTime ;
    /** 标识符申请人 */
    private String identifierUser ="标识符申请人" ;
    /** 标识符申请失败原因 */
    private String identifierFailureReason ="标识符申请失败原因" ;
    /** 备注 */
    private String description ="备注" ;
    /** 创建人 */
    private String createUser ="创建人" ;
    /** 创建时间 */
    private long createTime ;
    /** 修改人 */
    private String updateUser ="修改人";
    /** 修改时间 */
    private long updateTime ;
    /** 状态 */
    private int  status ;
    /** 是否已删除 */
    private int isDeleted ;


    public static void main(String[] args) {
        BasChipModel bean = new BasChipModel();
        List<BasChipModel> li=new ArrayList<>();
        li.add(bean);
        JSONArray parseArray = JSONArray.parseArray(JSON.toJSONString(li));
        System.out.println(parseArray.toJSONString());
    }

}
