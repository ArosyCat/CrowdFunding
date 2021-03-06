package com.atguigu.crowd.handler;

import com.atguigu.crowd.api.MySQLRemoteService;
import com.atguigu.crowd.constant.CrowdConstant;
import com.atguigu.crowd.entity.vo.PortalTypeVO;
import com.atguigu.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zehao
 * @create 2021-11-30-8:48
 */
@Controller
public class PortalHandler {

    @Autowired
    private MySQLRemoteService mySQLRemoteService;

    @RequestMapping("/")
    public String showPortalPage(Model model) {
        // 1.调用MySQLRemoteService提供的方法查询首页要显示的数据
        ResultEntity<List<PortalTypeVO>> resultEntity = mySQLRemoteService.getPortalTypeProjectDataRemote();

        // 2.检查查询结果
        if (ResultEntity.SUCCESS.equals(resultEntity.getResult())) {

            // 3.获取查询结果数据
            List<PortalTypeVO> list = resultEntity.getData();

            // 4.存入模型
            model.addAttribute(CrowdConstant.ATTR_NAME_PORTAL_DATA,list);

        }

        return "portal";
    }

}