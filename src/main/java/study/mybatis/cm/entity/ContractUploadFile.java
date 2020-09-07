package study.mybatis.cm.entity;

import java.util.Date;

/**
 * 合同文件上传
 * 
 * @author shanglonghua
 * 
 */
public class ContractUploadFile {
	private Integer id;
	private Long contractId;
	private String contractName;
	private String fileUrl;
	private String fileLink;
	private String fileLittleThumbnailsLink; // 文件缩略图链接
	private String fileLargeThumbnailsLink; // 文件缩略大图链接
	private String fileName;
	private Integer fileType;
	private Long creator;
	private Date createTime;
	private String createTimeStr;
	private String memo;// 文件附属信息,VR合同：产品类型名称

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Integer getFileType() {
		return fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getFileLink() {
		return fileLink;
	}

	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
	}

	public String getFileLittleThumbnailsLink() {
		return fileLittleThumbnailsLink;
	}

	public void setFileLittleThumbnailsLink(String fileLittleThumbnailsLink) {
		this.fileLittleThumbnailsLink = fileLittleThumbnailsLink;
	}

	public String getFileLargeThumbnailsLink() {
		return fileLargeThumbnailsLink;
	}

	public void setFileLargeThumbnailsLink(String fileLargeThumbnailsLink) {
		this.fileLargeThumbnailsLink = fileLargeThumbnailsLink;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}