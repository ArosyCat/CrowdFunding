package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.entity.vo.DetailProjectVO;
import com.atguigu.crowd.entity.vo.PortalProjectVO;
import com.atguigu.crowd.entity.vo.PortalTypeVO;
import com.atguigu.crowd.mapper.MemberPOMapper;
import com.atguigu.crowd.mapper.ProjectPOMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zehao
 * @create 2021-11-29-15:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MyBatisTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MemberPOMapper memberPOMapper;

    @Autowired
    private ProjectPOMapper projectPOMapper;

    @Test
    public void testLoadDetailProjectVO() {

        DetailProjectVO detailProjectVO = projectPOMapper.selectDetailProjectVO(1);
        log.info("ProjectId = " + detailProjectVO.getProjectId() + "");
        log.info("ProjectName = " + detailProjectVO.getProjectName() + "");
        log.info("ProjectDesc = " + detailProjectVO.getProjectDesc() + "");
        log.info("FollowerCount = " + detailProjectVO.getFollowerCount() + "");
        log.info("Status = " + detailProjectVO.getStatus() + "");
        log.info("Money = " + detailProjectVO.getMoney() + "");
        log.info("SupportMoney = " + detailProjectVO.getSupportMoney() + "");
        log.info("Percentage = " + detailProjectVO.getPercentage() + "");
        log.info("DeployDate = " + detailProjectVO.getDeployDate() + "");
        log.info("LastDay = " + detailProjectVO.getLastDay() + "");
        log.info("SupporterCount = " + detailProjectVO.getSupporterCount() + "");
        log.info("HeaderPicturePath = " + detailProjectVO.getHeaderPicturePath() + "");
        log.info("DetailPicturePathList = " + detailProjectVO.getDetailPicturePathList() + "");
        log.info("DetailReturnVOList = " + detailProjectVO.getDetailReturnVOList() + "");
    }

    @Test
    public void testProjectPOMapper() {
        List<PortalTypeVO> portalTypeVOList = projectPOMapper.selectPortalTypeVOList();
        for (PortalTypeVO portalTypeVO : portalTypeVOList) {
            String name = portalTypeVO.getName();
            String remark = portalTypeVO.getRemark();
            log.info("name = " + name + " remark = " + remark);

            List<PortalProjectVO> portalProjectVOList = portalTypeVO.getPortalProjectVOList();
            for (PortalProjectVO portalProjectVO : portalProjectVOList) {

                if (portalProjectVO == null) {
                    continue;
                }

                log.info(portalProjectVO.toString());
            }
        }
    }

    @Test
    public void testMapper() {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String source = "123123";
        String encode = passwordEncoder.encode(source);

        MemberPO record = new MemberPO(null, "jack", encode, "杰克", "jack@qq.com", 1, 1, "杰克", "123123", 2);

        memberPOMapper.insert(record);

    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.debug("connection = " + connection);

    }

}