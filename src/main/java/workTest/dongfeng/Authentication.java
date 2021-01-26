package workTest.dongfeng;

import com.alibaba.fastjson.JSONObject;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-13 11:13
 **/
@Getter
@Setter
@ToString
public class Authentication {

    /**
     * 接口用户名
     */
    private String jkYhm;

    /**
     * 接口授权码
     */
    private String jkSqm;

    /**
     * 交换校验码
     */
    private String crcCode;

    private String WriteJsonDoc;

    public static void main(String[] args) throws Exception{

        //1.请求参数
        Auth auth = new Auth();
        auth.setBsqxs("123");
        auth.setCcdjrq("33r3rffff");
        ArrayList<Auth> auths = new ArrayList<>();
        auths.add(auth);


        //2 封装 writeJsonDoc

        AuthJsonDoc authJsonDoc = new AuthJsonDoc();
        authJsonDoc.createExchangeCode("3301060000");
        authJsonDoc.setBody(auths);




        //3.封装请求参数
        Authentication authentication = new Authentication();
        authentication.setJkYhm("3301060000");
        authentication.setJkSqm("330106df");

        String writJsonDocStr = JSONObject.toJSON(authJsonDoc).toString();




        writJsonDocStr = "{\n" +
                "    \"requestTime\": \"20210113040850\",\n" +
                "    \"exchangeType\": \"30\",\n" +
                "    \"body\": [\n" +
                "      {\n" +
                "        \"CLXH\": \"225545\",\n" +
                "        \"SCRQ\": \"2020-11-24\",\n" +
                "        \"CLPP\": \"上海交运船舶\",\n" +
                "        \"FDJXH\": \"WP3678\",\n" +
                "        \"RLZL\": \"B\",\n" +
                "        \"CLSBHM\": \"20200512101234569\",\n" +
                "        \"FDJH\": \"225545\",\n" +
                "        \"DOCXH\": \"1\",\n" +
                "        \"FDJSCC\": \"1\",\n" +
                "        \"SBBH\": \"330106dfW302001445\",\n" +
                "        \"PF\": \"a\",\n" +
                "        \"SCQYMC\": \"潍柴\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"version\": \"1.0\",\n" +
                "    \"exchangeCode\": \"33011600002021011304085000364803\"\n" +
                "  }";

        String crcCode =  ConvertUtil.checkCRC(writJsonDocStr);
        authentication.setCrcCode(crcCode);
        //加密
        String encryptWritJsonDocStr = ConvertUtil.aesEncrypt(writJsonDocStr, "XX7XXXQXDFQCYXGS").replace("+", "%2B").replace("/", "%2F");
        authentication.setWriteJsonDoc(encryptWritJsonDocStr);


        FullHttpRequest fullHttpRequest = getRequest("3301060000","330106df",crcCode,encryptWritJsonDocStr);


        //  System.out.println(JSONObject.toJSON(authentication).toString());


    }

    public static FullHttpRequest getRequest(String jkYhm, String jkSqm, String crcCode, String WriteJsonDoc) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        sb.append(ForwardStaticInfo.JKYHM).append("=");
        sb.append(jkYhm).append("&");
        sb.append(ForwardStaticInfo.JKSQM).append("=");
        sb.append(jkSqm).append("&");
        sb.append(ForwardStaticInfo.CRC_CODE).append("=");
        sb.append(crcCode).append("&");
        sb.append(ForwardStaticInfo.WRITE_JSON_DOC).append("=");
        sb.append(WriteJsonDoc);

        // 构建http请求
        URI uri = new URI("http://218.108.60.68/obd_exg/services/authObjectOut.do");
        FullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1
                , HttpMethod.POST, uri.toASCIIString(), Unpooled.wrappedBuffer(sb.toString().getBytes()));
        request.headers().set(HttpHeaderNames.HOST, "http://218.108.60.68/obd_exg/services/authObjectOut.do");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        request.headers().set(HttpHeaderNames.CONTENT_LENGTH, request.content().readableBytes());
        request.headers().set(HttpHeaderNames.CONTENT_TYPE,  HttpHeaderValues.APPLICATION_X_WWW_FORM_URLENCODED);


        System.out.println(sendPost("http://218.108.60.68/obd_exg/services/authObjectOut.do", sb.toString()));
        return request;
    }

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("content-type","application/x-www-form-urlencoded");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }
}

