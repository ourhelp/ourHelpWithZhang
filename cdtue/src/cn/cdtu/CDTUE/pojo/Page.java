package cn.cdtu.CDTUE.pojo;

public class Page {

	
	private Integer index = 1; // 当前页码, 默认为第一页
	private Integer count; // 总共的数据条数
	private Integer totalPage; // 总共的页码数
	private Integer sum = 3; // 每页显示的数据条数
	private Integer start; // 开始查询的数据
	
	
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getTotalPage() {
		return (int)Math.ceil(this.count * 1.0 / this.sum);
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Integer getStart() {
		return (this.index - 1) * this.sum;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	
	
	
}
