package com.atguigu.springcloud.util;


import com.atguigu.springcloud.entities.common.JSONResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
  * @Description : 首页导航栏菜单
  * @Author : wujing
  * @Date: 2020-08-022 09:54
 */

public class RpcMenuController {
    /*@Autowired
    private MenuService menuService;


    @ApiOperation("得到全部节点")
    public JSONResponse<List<Menu>> getWholeTree(@RequestParam String typeId) {
        try {

            //查询所有的Menu对象
            List<Menu> menuList = menuService.getAll();

            //声明一个根节点
            List<Menu> roots = new ArrayList<>();

            //创建map 用来存储id和Menu对象的对应关系，便于查询父节点
            Map<Integer,Menu> menuMap = new HashMap();

            //遍历 menuList 填充menuMap
            for(Menu menu:menuList ) {
                Integer id = menu.getId();
                menuMap.put(id, menu);
            }
            //遍历menuList 查找根节点，去组装
            for (Menu menu:menuList) {
                Integer id = menu.getId();
                Integer pId = menu.getPId();

                //1. pid为null 判定根节点
                if(pId == null){
                    roots.add(menu);
                    //若为根节点，结束遍历
                    continue;
                }
                //2. pid不为null 判定不是根节点，根据pid查找在menuMap对应的Menu对象
                Menu father = menuMap.get(pId);
                //3.将此menu加入到父节点里
                father.getChildren().add(menu);
            }

            Menu resultMenu = new Menu();

            //遍历类型 得到对应typeId 的树根节点
            for (Menu rootMenu:roots) {
                if (rootMenu.getId() == Integer.parseInt(typeId)){
                    resultMenu = rootMenu;
                }
            }


            //返回一个根节点对象，包括所有节点
            return ResultUtil.success(resultMenu.getChildren());

        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(e.getMessage());
        }
    }*/

}
