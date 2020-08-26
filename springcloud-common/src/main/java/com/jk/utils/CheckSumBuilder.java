/** 
 * <pre>项目名称:oa 
 * 文件名称:CheckSumBuilder.java 
 * 包名:com.jk.lz.utils 
 * 创建日期:2020年4月24日下午4:51:55 
 * Copyright (c) 2020, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;
import java.security.MessageDigest;
/** 
 * <pre>项目名称：oa    
 * 类名称：CheckSumBuilder    
 * 类描述：    
 * 创建人：liangzhao
 *
 * 励志语录: 业精于勤荒于嬉 行成于思毁于随
 *
 * 创建时间：2020年4月24日 下午4:51:55
 * 修改人：liangzhao  1187420167@qq.com
 * 修改时间：2020年4月24日 下午4:51:55
 * 修改备注：       
 * @version </pre>    
 */
public class CheckSumBuilder {

	 // 计算并获取CheckSum
    public static String getCheckSum(String appSecret, String nonce, String curTime) {
        return encode("sha1", appSecret + nonce + curTime);
    }

    // 计算并获取md5值
    public static String getMD5(String requestBody) {
        return encode("md5", requestBody);
    }

    private static String encode(String algorithm, String value) {
        if (value == null) {
            return null;
        }
        try {
            MessageDigest messageDigest
                    = MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }
    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
}
