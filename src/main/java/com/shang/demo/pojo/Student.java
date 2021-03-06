package com.shang.demo.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @Author: ShangJiaPeng
 * @Since: 2019-07-09 14:54
 */
@Data
@ToString
public class Student extends User implements Serializable {
    /**
     * 名字
     * 数据库字段: name varchar(20)
     */
    private String name;
    /**
     * 年龄，IEnum接口的枚举处理
     * 数据库字段：age INT(3)
     */
    private Integer age;

    /**
     * 年级，原生枚举（带{@link com.baomidou.mybatisplus.annotation.EnumValue}):
     * 数据库字段：grade INT(2)
     */
    private Integer grade;
}
