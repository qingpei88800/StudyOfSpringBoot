package study.mybatis.cm.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 合同基础信息类
 * 
 * @author shanglonghua
 * 
 */
@Data
public class BaseContract extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7632604045812226187L;

	protected Date startDate;// 协议开始时间
	protected String startDateStr;

	protected Date endDate;// 协议结束时间
	protected String endDateStr;

	protected Integer ifRecOriginalContract;// 是否收到合同原件
	protected String ifRecOriginalContractStr;

	protected String arcSerial;// 归档编号
	protected String arcSerialStr;

	protected String comments;// 备注

	protected Long creator;// 创建人ID
	protected String creatorStr;// 创建人姓名

	protected Long updater;// 更新人ID
	protected String updaterStr;// 更信人姓名

	protected Timestamp createTime;// 创建时间
	protected String createTimeStr;

	protected Timestamp updateTime;// 更新时间
	protected String updateTimeStr;

	protected Timestamp submitTime; // 提交时间 ，审核页面的创建时间
	protected String submitTimeStr; // 提交时间 ，审核页面的创建时间

	protected Long submittor;// 提交人
	protected String submittorStr; // 提交人姓名

	protected Timestamp approveTime;// 审批通过时间
	protected String approveTimeStr;// 审批通过日期

	protected Integer contractStatusDetail;// 合同审批状态
	protected String contractStatusDetailStr;// 合同审批状态

	protected String contractStatusStr; // 合同状态，通过大合同审批状态定义

	protected Integer frameStatusDetail;// 政策审批状态
	protected String frameStatusDetailStr;

	protected String frameStatusStr; // 合同政策状态， 未生效和已生效

	protected Integer ifPrint;// 是否打印
	protected String ifPrintStr;

	protected Integer status;// 状态。0:新建 1：等待审批 2：拒绝 3：审批通过 4：作废
	protected String statusStr;
	protected Date recOrgTime; // 原件返回时间
	protected String recOrgTimeStr;
	protected Integer isUsing = 0;// 是否正在使用，0：否 1：是

	protected String saler; // 签约销售名字
	protected Long salerId; // 签署销售ID

	protected Long printTemplateId;// 打印模板ID
	protected String printTemplateName; // 关联打印模板名称

	protected Integer ifNewContract; // 新老合同标记 0.老合同 1.新合同
	protected String ifNewContractStr;
	protected Integer templateMode; // 合同模板1. 我方模板 2.第三方模板
	protected String templateModeStr;
	protected List<ContractUploadFile> speicalFilesForSaler;
	protected List<ContractUploadFile> specialFilesForSupport;// KA客服特批邮件

}
