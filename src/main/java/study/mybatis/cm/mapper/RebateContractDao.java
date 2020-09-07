package study.mybatis.cm.mapper;

import org.apache.ibatis.annotations.Mapper;

import study.mybatis.cm.entity.RebateContract;

/**
 * 返点合同Dao
 * 
 * @author shanglonghua
 * 
 */
@Mapper
public interface RebateContractDao {

	/**
	 * 获取返点合同信息
	 * 
	 * @param
	 * @return
	 */
	RebateContract getRebContractInfo(RebateContract contract);

}
