package com.kaishengit;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Administrator on 2016/7/8.
 */
public class Test {

    public static void main(String[] args){
        System.out.println(DigestUtils.md5Hex("123"));
    }
}
