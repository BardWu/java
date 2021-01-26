package workTest.dongfeng;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Auth {
    @JSONField(name = "SBBH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String sbbh;
    @JSONField(name = "HPZL", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String hpzl;
    @JSONField(name = "HPHM", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String hphm;
    @JSONField(name = "CLXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String clxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "CLPP", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String clpp = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "CLSBHM", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String clsbhm = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "FDJH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String fdjh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "CCDJRQ", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String ccdjrq;
    @JSONField(name = "FDJXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String fdjxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "RLZL", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String rlzl = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "CLLX", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String cllx;
    @JSONField(name = "SYR", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String syr;
    @JSONField(name = "LXDH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String lxdh;
    @JSONField(name = "XSDW", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String xsdw;
    @JSONField(name = "QCFL", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String qcfl;
    @JSONField(name = "SCRQ", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String scrq = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "PF", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pf = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "SCQYMC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String scqymc = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "FDJSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String fdjscc = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "DOCXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String docxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "DOCSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String docscc;
    @JSONField(name = "SCRXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String scrxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "SCRSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String scrscc;
    @JSONField(name = "DPFXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String dpfxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "DPFSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String dpfscc;
    @JSONField(name = "POCXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pocxh = ForwardStaticInfo.DEFAULT_VAL;
    @JSONField(name = "POCSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pocscc;
    @JSONField(name = "PYBXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pybxh;
    @JSONField(name = "PYBSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pybscc;
    @JSONField(name = "ZYQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zyqxh;
    @JSONField(name = "ZYQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zyqscc;
    @JSONField(name = "PYQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pyqxh;
    @JSONField(name = "PYQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pyqscc;
    @JSONField(name = "ECUXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String ecuxh;
    @JSONField(name = "ECUBBH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String ecubbh;
    @JSONField(name = "ECUSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String ecuscc;
    @JSONField(name = "OBDXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String obdxh;
    @JSONField(name = "OBDSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String obdscc;
    @JSONField(name = "EGRXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String egrxh;
    @JSONField(name = "EGRSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String egrscc;
    @JSONField(name = "ZLQXS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zlqxs;
    @JSONField(name = "BSQXS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String bsqxs;
    @JSONField(name = "DWS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String dws;
    @JSONField(name = "XSQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String xsqxh;
    @JSONField(name = "XSQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String xsqscc;
    @JSONField(name = "ZHQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zhqxh;
    @JSONField(name = "ZHQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zhqscc;
    @JSONField(name = "KLBJQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String klbjqxh;
    @JSONField(name = "KLBJQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String klbjqscc;
    @JSONField(name = "IUPR", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String iupr;
    @JSONField(name = "FDJGL", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String fdjgl;
    @JSONField(name = "FDJGLZS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String fdjglzs;
    @JSONField(name = "ZDNJ", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zdnj;
    @JSONField(name = "ZDNJZS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String zdnjzs;
    @JSONField(name = "GYXTXS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String gyxtxs;
    @JSONField(name = "QTXTXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String qtxtxh;
    @JSONField(name = "PQHCLXS", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pqhclxs;
    @JSONField(name = "KQLQQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String kqlqqxh;
    @JSONField(name = "KQLQQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String kqlqqscc;
    @JSONField(name = "JQXSQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String jqxsqxh;
    @JSONField(name = "JQXSQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String jqxsqscc;
    @JSONField(name = "PQXSQXH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pqxsqxh;
    @JSONField(name = "PQXSQSCC", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String pqxsqscc;
    @JSONField(name = "XZQH", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String xzqh ;
    @JSONField(name = "HYYT", serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String hyyt;

}
