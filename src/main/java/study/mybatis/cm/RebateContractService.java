package study.mybatis.cm;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.mybatis.cm.entity.RebateContract;
import study.mybatis.cm.mapper.RebateContractDao;

/**
 * @author liuqingpei
 * @date 2020/9/9
 */
@Service
public class RebateContractService {
	Logger logger = LoggerFactory.getLogger(RebateContractService.class);
	@Resource
	private RebateContractDao rebateContractDao;

	@Transactional
	public RebateContract getInfo(RebateContract contract) {
		RebateContract rebContractInfo = rebateContractDao.getInfo(contract);
		logger.info("agentId:" + rebContractInfo.getAgentId());
		rebContractInfo.setAgentId(10000L);
		// 不会再查询 而是从缓存中获取rebContractInfo的值
		RebateContract rebContractInfo1 = rebateContractDao.getInfo(contract);
		logger.info("agentId1:" + rebContractInfo1.getAgentId());
		return rebContractInfo1;
	}
}
