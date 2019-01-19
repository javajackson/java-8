package com.example.java8.lesson11;

import java.util.function.Supplier;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  09:18
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
