package com.daxiang.mbg.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {
    /**
     * 项目id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 项目名
     *
     * @mbg.generated
     */
    @NotBlank(message = "项目名不能为空")
    private String name;

    /**
     * 项目描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 1.andorid 2.iOS
     *
     * @mbg.generated
     */
    @NotNull(message = "平台不能为空")
    private Integer platform;

    /**
     * 创建人id
     *
     * @mbg.generated
     */
    private Integer creatorUid;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCreatorUid() {
        return creatorUid;
    }

    public void setCreatorUid(Integer creatorUid) {
        this.creatorUid = creatorUid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", platform=").append(platform);
        sb.append(", creatorUid=").append(creatorUid);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}