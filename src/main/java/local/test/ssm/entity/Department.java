package local.test.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Data====生成get/set方法
@Data
//@NoArgsConstructor=====生成空参构造方法+生成toString方法
@NoArgsConstructor
//@AllArgsConstructor=====生成满参构造方法
@AllArgsConstructor
//@ToString=====生成toString方法
@ToString
public class Department {
    private int id;
    private String name;
}
