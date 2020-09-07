package study.mybatis.cm.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * User: zhangqisheng
 * Date: 13-1-28
 * Time: 下午3:40
 * 框架合同、单笔合同实体信息.
 */
@Data
public class Contract extends BaseContract {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 7930983181887960474L;
	@Getter
	@Setter
	protected Integer contractId;
	@Getter
	@Setter
	protected String contractName;

	@Getter
	@Setter
	protected Integer contractGroupId;// 合同组ID

	@Getter
	@Setter
	protected String supplementNo; // 补充协议号

	// ka
	@Getter
	@Setter
	protected Long kaId; // '厂商ID'
	@Getter
	@Setter
	protected String kaIdStr; // 厂商id,字符串，接受页面传递后做验证；
	@Getter
	@Setter
	protected String kaName; // 厂商名字
	@Getter
	@Setter
	protected String directCustomSaler; // 直客销售
	@Getter
	@Setter
	protected String settlementIndustry; // 结算行业
	@Getter
	@Setter
	protected Long settlementIndustryId;// 结算行业id（admin标示） 1：网服 2：非网服

	// agent
	@Getter
	@Setter
	protected Long agentId; // '代理商ID'
	@Getter
	@Setter
	protected String agentIdStr; // '代理商ID',字符串, 接受页面传递后做验证

	@Getter
	@Setter
	protected Long agentAccountPeriod; // 代理商账期
	@Getter
	@Setter
	protected String agentAccountPeriodStr; // 代理商账期
	@Getter
	@Setter
	protected Long agentType; // 代理商类型
	@Getter
	@Setter
	protected String agentTypeStr; // 代理商类型
	@Getter
	@Setter
	protected String channelSaler; // 渠道销售
	@Getter
	@Setter
	protected String suptCusServer;// 支持客服
	@Getter
	@Setter
	protected String tradingAccount; // 交易账号
	@Getter
	@Setter
	protected Long tradingAccountId; // 交易账号id（admin标示） 1：搜狗科技, 其他：搜狗信息
	@Getter
	@Setter
	protected String invoiceType;// 开票方式
	@Getter
	@Setter
	protected Long invoiceTypeId;// 开票方式id(admin 标示) 0:净额开票, 1：对开发票

	@Getter
	@Setter
	protected Integer contractType; // '合同类型'
	protected String contractTypeStr;
	@Getter
	@Setter
	protected Integer policyId; // 政策Id
	protected Integer policyYear; // 政策年
	protected Integer policyType; // 政策类型
	protected String policyTypeStr; // 政策类型名称
	protected Date policyStartTime; // 政策开始时间
	protected Date policyEndTime; // 政策结束时间

	@Getter
	@Setter
	protected Integer policyDetailId; // '政策明细ID'
	@Getter
	@Setter
	protected String policyName;// 政策名字
	@Getter
	@Setter
	protected String policyStartAmountStr; // 政策区间开始金额
	@Getter
	@Setter
	protected String policyEndAmountStr; // 政策区间结束金额

	protected String policyBalanceTradeStr; // 政策行业
	protected Long policyBalanceTrade;
	@Getter
	@Setter
	protected Integer area; // '合同区域1:华东 2：华南 3：华北 '
	@Setter
	protected String areaStr;
	@Getter
	@Setter
	protected String uploadAreaStr;

	@Getter
	@Setter
	protected Integer ifStandard; // '是否标准 0：标准 1：非标'
	@Setter
	protected String ifStandardStr;
	@Getter
	@Setter
	protected Integer ifRecDeposit; // 是否收到保证金 是否收到保证金<0, 未收到>,<1, 已收到>
	@Setter
	protected String ifRecDepositStr;
	@Getter
	@Setter
	protected Integer approveFlag; //

	@Getter
	@Setter
	protected String custName; // '客户联系人'
	@Getter
	@Setter
	protected String custPhone; // '客户电话'
	@Getter
	@Setter
	protected String custUrl; // '客户网址'

	@Getter
	@Setter
	protected BigDecimal contractAmount; // '合同金额'
	protected String contractAmountStr; // '合同金额'
	@Getter
	@Setter
	protected String contractAmountStr_s; // '合同金额' 会计格式
	@Getter
	@Setter
	protected BigDecimal newestContractAmount; // 最新合同金额（元）
	@Getter
	@Setter
	protected String newestContractAmountStr; // 最新合同金额（元）
	@Getter
	@Setter
	protected String newestContractAmountStr_s; // 最新合同金额（元） ,会计格式 ,如：10,000
	@Getter
	@Setter
	protected BigDecimal ensureAmount; // '保证金额'
	@Getter
	@Setter
	protected String ensureAmountStr; // '保证金额'

	protected String ensureAmountTypeStr; // 保证金类型
	@Getter
	@Setter
	protected Integer ensureAmountType;
	@Getter
	@Setter
	protected BigDecimal contractWirelessAmount = new BigDecimal(0); // '无线承诺投放金额'
	@Getter
	@Setter
	protected String contractWirelessAmountStr = "0"; // '无线承诺投放金额'
	@Getter
	@Setter
	protected String contractWirelessAmountStr_s = "0"; // '无线承诺投放金额' 会计格式

	@Getter
	@Setter
	protected BigDecimal newestContractWirelessAmount; // 最新无线承诺投放金额
	@Getter
	@Setter
	protected String newestContractWirelessAmountStr; // 最新无线承诺投放金额
	@Getter
	@Setter
	protected String newestContractWirelessAmountStr_s; // 最新无线承诺投放金额 ,会计格式 ,如：10,000

	protected BigDecimal payDepositAmount; // 补交保证金

	public BigDecimal getPayDepositAmount() {
		return payDepositAmount;
	}

	public void setPayDepositAmount(BigDecimal payDepositAmount) {
		this.payDepositAmount = payDepositAmount;
	}

	@Setter
	@Getter
	protected String payDepositAmountStr;
	@Setter
	@Getter
	protected String payDepositAmountStr_s; // 会计格式 ,如：10,000

	@Setter
	protected Integer performOrderCount; // 执行单数据量
	@Setter
	protected String performOrderCountStr;
	@Setter
	protected Integer supAgreementCount;// 补充协议数量
	@Setter
	protected String supAgreementCountStr;
	@Setter
	protected Integer termAgreementCount; // 终止协议数量
	@Setter
	protected String termAgreementCountStr; // 终止协议数量

	@Getter
	@Setter
	protected boolean ifExistsNotCanceledPerform;// 存在非“已取消”状态的执行单, 用于取消操作时判断
	@Getter
	@Setter
	protected boolean ifExistsNonRejectedOrUnCancelPerform; // 单笔合同是否存在非打回或非已取消的执行单，用于单笔合同能否修改开始时间的判断

	@Getter
	@Setter
	protected List<Long> agentIds;
	@Getter
	@Setter
	protected List<Long> mftIds;

	@Getter
	@Setter
	protected Integer flag;
	@Getter
	@Setter
	protected List<Integer> contractIdList;

	@Getter
	@Setter
	protected List<Integer> contractGroupIdList;

	/* 补充协议 */
	@Getter
	@Setter
	protected Integer parentId;// 父本id（合同或者补充协议id）

	protected Integer isSupplement;// 是否是补充协议 0：否 1：是
	protected Integer frameUpDown; // 是否升框还是降框 <1：升框,已补交保证金>
	                               // ,<2：降框,已扣除保证金>,<3,降框，保证金已充抵应收款>
	protected BigDecimal receivableDeposit; // 应收保证金
	protected String receivableDepositStr;
	protected Long chargedDeposit; // 已收保证金
	protected Long unchargedDeposit; // 未收保证金
	protected String chargedDepositStr;
	protected String unchargedDepositStr;
	@Getter
	@Setter
	protected String path; // 补充协议路径，格式如：Sg-103/Sg-1034/Sg-10434
	@Getter
	@Setter
	protected String agentName; // 代理商名字
	@Getter
	@Setter
	protected String agentNamePrint; // 执行单打印所用的代理商名称

	@Getter
	@Setter
	protected String diffStr;// 变更内容，补充协议列表

	protected String payDepositAmountForFrameUpStr; // 升框补交保证金；
	protected String payDepositAmountForFrameDownStr; // 降框补交保证金；

	protected List<String> diffAttrs;// 提供给补充协议用

	protected Integer ifWithSupplement; // 是否包含补充协议，用于页面筛选条件

	private String oriContractName; // 原合同名称，由于邮件发送；

	private Long cpcAdPresentAmountDbl; // 搜索排名广告政策返点

	// 激励返点值

	private Long extraAdPresentAmount = 0L;

	public Long getExtraAdPresentAmount() {
		return extraAdPresentAmount;
	}

	public void setExtraAdPresentAmount(Long extraAdPresentAmount) {
		this.extraAdPresentAmount = extraAdPresentAmount;
	}

	@Getter
	@Setter
	private String extraAdPresentAmountStr;
	@Getter
	@Setter
	private Long extraAdAmount;
	@Getter
	@Setter
	private String extraAdAmountStr;

	// 超顶框返点（激励返点明细）
	@Getter
	@Setter
	private Long extraSurpassDiscount = 0L;
	@Getter
	@Setter
	private String extraSurpassDiscountStr;
	// 新客返点（激励返点明细）
	@Getter
	@Setter
	private Long extraNewAccDiscount = 0L;
	@Getter
	@Setter
	private String extraNewAccDiscountStr;
	// 增长率返点（激励返点明细）
	@Getter
	@Setter
	private Long extraIncreaseRateDiscount = 0L;
	@Getter
	@Setter
	private String extraIncreaseRateDiscountStr;
	// 标杆返点（激励返点明细）
	@Getter
	@Setter
	private Long extraModelDiscount = 0L;
	@Getter
	@Setter
	private String extraModelDiscountStr;
	// 无线承诺返点（激励返点明细）
	@Getter
	@Setter
	private Long extraWirelessDiscount = 0L;
	@Getter
	@Setter
	private String extraWirelessDiscountStr;
	// 特批返点（激励返点明细）
	@Getter
	@Setter
	private Long extraSpecialDiscount = 0L;

	private String extraSpecialDiscountStr;

	// 教育返点（激励返点明细）

	private Long extraEducationDiscount = 0L;

	private String extraEducationDiscountStr;

	protected Integer agentPartyType; // 标明代理商属于甲方还是乙方

	protected String auditFlowTypeStr; // 审批流程

	protected Integer auditFlowType;// 审批流程 1：直客 2：渠道

	protected String policyStandardTypeStr;

	protected Integer policyStandardType;

	protected String emailEnd; // 邮箱后缀

	protected String fax; // 传真

	protected String email; // 邮箱

	protected String address; // 地址

	protected String zipCode; // 邮政编码

	protected String compensationModeErr; // 【补偿方式（错）】

	protected String compensationModeErrSupplement;// 【补偿方式（错补）】

	protected String compensationModeLeak;// 【补偿方式（漏）】

	protected String compensationModeLeakSupplement;// 【补偿方式（漏补）】

	protected String breachClause; // 违约条款
	protected String frameAmountPercentStr; // 框架金额百分比
	protected BigDecimal frameAmountPercent; // 框架金额百分比
	protected String qualificationName; // 资质文件名称
	protected String settlementSpecialEmail; // 特批邮件(KA媒介)
	protected String specialEmailForKaFileUrl; // 特批邮件(KA媒介) fileurl
	protected String specialEmailForSalerFileUrl; // 特批邮件(直客/渠道) fileurl
	protected String specialEmailForChannelOrDirectCust; // 特批邮件(直客/渠道)
	protected Integer commonIfStandard; // 通用条款是否标准 0:标准，1：小非标，2：大非标
	protected String commonIfStandardStr; //
	protected String nonstandardContractElecVersionName; // 非标合同电子版
	protected String nonstandardContractElecVersionUrl; // 非标合同电子版 fileurl

	protected Integer ifOverTimeDeposit;// 保证金是否超期
	protected String ifOverTimeDepositStr;// 保证金是否超期
	protected Date depositOverTime;// 保证金超期时间
	protected String depositOverTimeStr;// 保证金超期时间
	protected Integer depositOverTimeDay;// 保证金超期天数

	protected String contractStatusStr; // 合同状态，通过大合同审批状态定义

	private Long searchAdPresentTotalAmount = 0L;

	/**
	 * 是否转代理 0:否，1：是
	 */
	private Integer ifTransferAgent;
	private String ifTransferAgentStr;

	private Integer companyGroupId;

	private String companyGroupName;
	private String companyGroupIdStr;

	/**
	 * 关联的激励返点特批申请信息
	 */
	private String applicationNo;
	private Integer applicationId;

}
