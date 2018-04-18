package com.cmos.common.util;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * @Authgor: gosaint
 * @Description:密码加密
 * @Date Created in 16:39 2018/4/18
 * @Modified By:
 */
public class EncryptPwd {
    public static void main(String[] args) {
        try {
            String encrypt = ConfigTools.encrypt("gosaint");
            System.out.println(encrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
