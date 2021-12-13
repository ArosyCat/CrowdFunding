package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.CrowdUtil;
import com.atguigu.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zehao
 * @create 2021-11-04-10:39
 */
@Controller
public class TestHandler {

    private Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap, HttpServletRequest request){
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);
        boolean judgeResult = CrowdUtil.judgeRequestType(request);

        logger.info("testSsm => judgeResult = " + judgeResult); //false
//        String a = null;
//        System.out.println(a.length());
        System.out.println(10 / 0);

        return "target";
    }

    @ResponseBody
    @RequestMapping("send/array/one.html")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array){
        for (Integer number : array) {
            System.out.println("number = " + number);
        }
        return "success";
    }

    @RequestMapping("send/array/two.html")
    @ResponseBody
    public String testReceiveArrayTwo(@RequestParam("array") List<Integer> array){
        for (Integer number : array) {
            System.out.println("number = " + number);
        }
        return "success";
    }

    @RequestMapping("send/array/three.html")
    @ResponseBody
    public String testReceiveArrayThree(@RequestBody List<Integer> array){
        for (Integer number : array) {
            logger.info("number = " + number);
        }
        return "success";
    }

//    @RequestMapping("/send/compose/object.json")
//    @ResponseBody
//    public ResultEntity<Student> testReceiveComposeObject(@RequestBody Student student, HttpServletRequest request){
//        logger.info(student.toString());
//        //将“查询”到的Student对象封装到ResultEntity中返回
//        ResultEntity<Student> resultEntity = ResultEntity.successWithData(student);
//
//        boolean judgeRequestType = CrowdUtil.judgeRequestType(request);
//        logger.info("testReceiveComposeObject => judgeRequest = " + judgeRequestType); // true
//        String a = null;
//        System.out.println(a.length());
//        return resultEntity;
//    }


}