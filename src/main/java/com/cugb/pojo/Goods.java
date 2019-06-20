package com.cugb.pojo;
/**
 * 商品
 * @author lyq
 *
 */
public class Goods {
    private Integer id;

    private Integer catelogId;

    private Integer userId;

    private String name;

    private Float price;

    private Float realPrice;

    private String startTime;

    private String endTime;

    private String polishTime;

    private Integer status;

    private String describle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Integer catelogId) {
        this.catelogId = catelogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Float realPrice) {
        this.realPrice = realPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }



    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public String getPolishTime() {
        return polishTime;
    }

    public void setPolishTime(String polishTime) {
        this.polishTime = polishTime;
    }

	@Override
	public String toString() {
		return "Goods [id=" + id + ", catelogId=" + catelogId + ", userId=" + userId + ", name=" + name + ", price="
				+ price + ", realPrice=" + realPrice + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", polishTime=" + polishTime + ", status=" + status + ", describle=" + describle + "]";
	}
    
    
}