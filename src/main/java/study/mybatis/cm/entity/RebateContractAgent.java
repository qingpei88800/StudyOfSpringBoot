package study.mybatis.cm.entity;

/**
 * 返点合同及或补充协议关联的代理商
 * 
 * @author shanglonghua
 * 
 */
public class RebateContractAgent {

	private Long id; // 记录标识ID
	private String contractName; // 关联的返点合同或补充协议编号
	private Long agentId;
	private String agentName;
	private String agentNamePrint;
	private String custName; // '客户联系人'
	private String custPhone; // '客户电话'
	private Long processMode;// 返点处理方式 0：冲抵，1：返现
	private String processModeStr;//
	private String qualificationName; // 资质名称
	private String qualificationUrl;// 文件url
	private Integer isUsePrintName = 0; // 是否使用打印名称，0：否，1：是
	private String address; // 地址
	private boolean addressAdjustFlag = false; // 是否调整了地址
	private String postCode; // 邮政编码
	private String fax;// 传真
	private String email; // 邮箱
	private Integer isCanDelete = 0; // 是否可删除 0：否，1：是
	private Integer printFlag;// 是否用于打印

	public Long getId() {
		return id;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Long getAgentId() {
		return agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public String getAgentNamePrint() {
		return agentNamePrint;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public Long getProcessMode() {
		return processMode;
	}

	public String getProcessModeStr() {
		return processModeStr;
	}

	public String getQualificationUrl() {
		return qualificationUrl;
	}

	public Integer getIsUsePrintName() {
		return isUsePrintName;
	}

	public String getAddress() {
		return address;
	}

	public boolean getAddressAdjustFlag() {
		return addressAdjustFlag;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getFax() {
		return fax;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIsCanDelete() {
		return isCanDelete;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public void setAgentNamePrint(String agentNamePrint) {
		this.agentNamePrint = agentNamePrint;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public void setProcessMode(Long processMode) {
		this.processMode = processMode;
	}

	public void setProcessModeStr(String processModeStr) {
		this.processModeStr = processModeStr;
	}

	public void setQualificationUrl(String qualificationUrl) {
		this.qualificationUrl = qualificationUrl;
	}

	public void setIsUsePrintName(Integer isUsePrintName) {
		this.isUsePrintName = isUsePrintName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressAdjustFlag(boolean addressAdjustFlag) {
		this.addressAdjustFlag = addressAdjustFlag;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIsCanDelete(Integer isCanDelete) {
		this.isCanDelete = isCanDelete;
	}

	public String getQualificationName() {
		return qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public Integer getPrintFlag() {
		return printFlag;
	}

	public void setPrintFlag(Integer printFlag) {
		this.printFlag = printFlag;
	}
}
