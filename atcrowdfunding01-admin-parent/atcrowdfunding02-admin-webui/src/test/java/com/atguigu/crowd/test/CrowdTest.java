package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.Role;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.mapper.RoleMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author zehao
 * @create 2021-11-03-19:41
 */
// 在类上标记必要的注解，Spring整合Junit
@RunWith(SpringJUnit4ClassRunner.class)
/*使用@ContextConfiguration加载配置文件*/
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {

    private Logger logger = LoggerFactory.getLogger(CrowdTest.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleMapper roleMapper;


    @Test
    public void testInsertRole(){
        for (int i = 11; i < 51; i++) {
            roleMapper.insert(new Role(i,"Role" + i));
        }
        logger.info("===插入完成");
    }

    @Test
    public void testInsert(){
        for (int i = 50; i < 101;i++){
            adminMapper.insert(new Admin(i,"AA" + i,"BB" + i,"CC" + i,i + "@qq.com",null));
        }
        System.out.println("执行完成");
    }

    @Test
    public void testTx(){
        Admin admin = new Admin(null, "Jerry", "333222", "Jer", "Jerry@qq.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog(){
        // 1.获取Logger对象，这里传入的Class对象就是当前打印日志的类
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        // 2.根据不同日志级别打印日志
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");

        logger.info("Info level!!!");
        logger.info("Info level!!!");
        logger.info("Info level!!!");

        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");

        logger.error("Error level!!!");
        logger.error("Error level!!!");
        logger.error("Error level!!!");

    }

    @Test
    public void testInsertAdmin(){
        Admin admin = new Admin(null, "tom", "123221", "TT", "tom@163.com", "null");
        int insert = adminMapper.insert(admin);
        if (insert == 0){
            System.out.println("==============插入失败");
        }else{
            // 如果在实际开发中，所有想查看数值的地方都使用Sysout方式打印，会给项目上线运行带来问题！
            // Sysout本质上是一个IO操作，通常IO操作是比较消耗性能的，如果项目中Sysout很多，那么对性能的影响就比较大了
            // 即使上线前我们花时间删除代码中的Sysout，也很可能有遗漏，而且非常麻烦。
            // 而如果使用日志系统，那么通过日志级别就可以批量的控制信息的打印。
            System.out.println("================插入成功");
        }
    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

}