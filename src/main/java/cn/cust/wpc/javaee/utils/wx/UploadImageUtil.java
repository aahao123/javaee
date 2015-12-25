package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 上传图片接口
 */
public class UploadImageUtil {
    /**
     * 上传文件接口
     *
     * @param file
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String uploadImage(File file) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=" + AccessTokenFactory.getInstance().accessToken();
        return HttpUtil.postFile(url, file);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File("/Users/yp-tc-m-2963/Desktop/1.png");
        String content = UploadImageUtil.uploadImage(file);
        System.out.println(content);
    }
}