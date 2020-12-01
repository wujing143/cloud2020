package com.atguigu.springcloud.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 树型菜单
 */
@Data
public class Menu {

    private Integer id;
    private Integer pId;
    private String label;
    private String url;
    private String icon;
    private String color;

    private List<Menu> children = new ArrayList<>();   // 该节点的子节点


}