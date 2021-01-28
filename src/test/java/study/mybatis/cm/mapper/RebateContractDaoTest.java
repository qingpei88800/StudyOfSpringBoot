package study.mybatis.cm.mapper;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import study.mybatis.cm.RebateContractService;
import study.mybatis.cm.entity.RebateContract;

/**
 * @author liuqingpei
 * @date 2020/9/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class RebateContractDaoTest {

	Logger logger = LoggerFactory.getLogger(RebateContractDaoTest.class);

	@Resource
	private RebateContractDao rebateContractDao;

	@Autowired
	private RebateContractService rebateContractService;

	@Test
	void getRebContractInfo() {
		RebateContract rebateContract = new RebateContract();
		rebateContract.setContractName("20-BD-13012");
		RebateContract rebContractInfo = rebateContractDao.getRebContractInfo(rebateContract);
		// logger.info("rebContractInfo:" + JsonUtils.objectToString(rebContractInfo));
		logger.info("agentId:" + rebContractInfo.getAgentId());
		rebContractInfo.setAgentId(10000L);
		RebateContract rebContractInfo1 = rebateContractDao.getRebContractInfo(rebateContract);
		// logger.info("rebContractInfo:" + JsonUtils.objectToString(rebContractInfo1));
		logger.info("agentId1:" + rebContractInfo1.getAgentId());
	}

	@Test
	void getInfo() {
		RebateContract rebateContract = new RebateContract();
		rebateContract.setContractName("20-BD-13012");
		RebateContract rebContractInfo = rebateContractService.getInfo(rebateContract);
	}
}