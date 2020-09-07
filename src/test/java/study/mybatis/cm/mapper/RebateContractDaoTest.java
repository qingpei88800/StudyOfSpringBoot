package study.mybatis.cm.mapper;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import study.mybatis.cm.entity.RebateContract;

/**
 * @author liuqingpei
 * @date 2020/9/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class RebateContractDaoTest {

	@Resource
	private RebateContractDao rebateContractDao;

	@Test
	void getRebContractInfo() {
		RebateContract rebateContract = new RebateContract();
		rebateContract.setContractName("20-BD-13012");
		rebateContractDao.getRebContractInfo(rebateContract);
	}
}