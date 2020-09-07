package study.mybatis.cm.entity;

import java.util.List;

public class RebateContract extends Contract {

	private static final long serialVersionUID = 3358726407162295163L;
	private Long processMode;// 返点处理方式，0代表冲抵，1代表返现
	private Long period;// 后付账期（预付则为null）
	private Long settlementType;// 结算方式0代表按消耗，1代表按转账
	private Long needBidPerformOrder;// 是否需要竞价金榜执行单，1需要，0不需要
	private String processModeStr;// 返点处理方式，0代表冲抵，1代表返现
	private String periodStr;// 后付账期（预付则为null）
	private String settlementTypeStr;// 结算方式0代表按消耗，1代表按转账
	private String needBidPerformOrderStr;// 是否需要竞价金榜执行单，1需要，0不需要
	private List<RebateContractAgent> agents;
	private String agentIdsStr;
	private String agentNamesStr;
	private Long rebateContractType; // 返点类型，0：普通代理商返点合同，1：集团代理商返点合同
	private String rebateContractTypeStr; // 返点类型，0：普通代理商返点合同，1：集团代理商返点合同
	private Long groupId; // 集团代理商ID
	private String groupIdStr; // 集团代理商ID
	private String groupName; // 集团代理商名称
	private String submitUser;// 返点合同提交人
	private List<ContractUploadFile> qualificationsForAgentWithoutId; // 无代理商ID的代理商营业执照集合
	private List<ContractUploadFile> qualificationsForSystemAgents; // 存在代理商ID的代理商营业执照

	/**
	 * 商业诚信书模板id
	 */
	private Long printTemplateBhbId;
	/**
	 * 关联商业诚信书模板名
	 */
	private String printTemplateBhbName;

	public String getPrintTemplateBhbName() {
		return printTemplateBhbName;
	}

	public void setPrintTemplateBhbName(String printTemplateBhbName) {
		this.printTemplateBhbName = printTemplateBhbName;
	}

	public Long getPrintTemplateBhbId() {
		return printTemplateBhbId;
	}

	public void setPrintTemplateBhbId(Long printTemplateBhbId) {
		this.printTemplateBhbId = printTemplateBhbId;
	}

	public Long getProcessMode() {
		return processMode;
	}

	public void setProcessMode(Long processMode) {
		this.processMode = processMode;
	}

	public Long getPeriod() {
		return period;
	}

	public void setPeriod(Long period) {
		this.period = period;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getNeedBidPerformOrder() {
		return needBidPerformOrder;
	}

	public void setNeedBidPerformOrder(Long needBidPerformOrder) {
		this.needBidPerformOrder = needBidPerformOrder;
	}

	public List<RebateContractAgent> getAgents() {
		return agents;
	}

	public void setAgents(List<RebateContractAgent> agents) {
		this.agents = agents;
	}

	public String getAgentIdsStr() {
		return agentIdsStr;
	}

	public void setAgentIdsStr(String agentIdsStr) {
		this.agentIdsStr = agentIdsStr;
	}

	public String getAgentNamesStr() {
		return agentNamesStr;
	}

	public void setAgentNamesStr(String agentNamesStr) {
		this.agentNamesStr = agentNamesStr;
	}

	public String getProcessModeStr() {
		return processModeStr;
	}

	public void setProcessModeStr(String processModeStr) {
		this.processModeStr = processModeStr;
	}

	public String getPeriodStr() {
		return periodStr;
	}

	public void setPeriodStr(String periodStr) {
		this.periodStr = periodStr;
	}

	public String getSettlementTypeStr() {
		return settlementTypeStr;
	}

	public void setSettlementTypeStr(String settlementTypeStr) {
		this.settlementTypeStr = settlementTypeStr;
	}

	public String getNeedBidPerformOrderStr() {
		return needBidPerformOrderStr;
	}

	public void setNeedBidPerformOrderStr(String needBidPerformOrderStr) {
		this.needBidPerformOrderStr = needBidPerformOrderStr;
	}

	public Long getRebateContractType() {
		return rebateContractType;
	}

	public void setRebateContractType(Long rebateContractType) {
		this.rebateContractType = rebateContractType;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getRebateContractTypeStr() {
		return rebateContractTypeStr;
	}

	public void setRebateContractTypeStr(String rebateContractTypeStr) {
		this.rebateContractTypeStr = rebateContractTypeStr;
	}

	public String getGroupIdStr() {
		return groupIdStr;
	}

	public void setGroupIdStr(String groupIdStr) {
		this.groupIdStr = groupIdStr;
	}

	public List<ContractUploadFile> getQualificationsForAgentWithoutId() {
		return qualificationsForAgentWithoutId;
	}

	public void setQualificationsForAgentWithoutId(List<ContractUploadFile> qualificationsForAgentWithoutId) {
		this.qualificationsForAgentWithoutId = qualificationsForAgentWithoutId;
	}

	public List<ContractUploadFile> getQualificationsForSystemAgents() {
		return qualificationsForSystemAgents;
	}

	public void setQualificationsForSystemAgents(
	        List<ContractUploadFile> qualificationsForSystemAgents) {
		this.qualificationsForSystemAgents = qualificationsForSystemAgents;
	}

	public String getSubmitUser() {
		return submitUser;
	}

	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}

}
