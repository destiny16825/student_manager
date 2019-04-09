package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable{

    private int id;
    private String cname;
    private int csum;

}
