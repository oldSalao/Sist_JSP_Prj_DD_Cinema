package vo;

import java.util.List;

public class AdminMovieMainVO {
	private String mvNo;
	private String mvTitle;
	private String mvDirector;
	private List<ActorVO> actName;
	private String mvAttCnt;

	public AdminMovieMainVO() {
	}

	public AdminMovieMainVO(String mvNo, String mvTitle, String mvDirector, List<ActorVO> actName, String mvAttCnt) {
		this.mvNo = mvNo;
		this.mvTitle = mvTitle;
		this.mvDirector = mvDirector;
		this.actName = actName;
		this.mvAttCnt = mvAttCnt;
	}

	public String getMvNo() {
		return mvNo;
	}

	public void setMvNo(String mvNo) {
		this.mvNo = mvNo;
	}

	public String getMvTitle() {
		return mvTitle;
	}

	public void setMvTitle(String mvTitle) {
		this.mvTitle = mvTitle;
	}

	public String getMvDirector() {
		return mvDirector;
	}

	public void setMvDirector(String mvDirector) {
		this.mvDirector = mvDirector;
	}

	public List<ActorVO> getActName() {
		return actName;
	}

	public void setActName(List<ActorVO> actName) {
		this.actName = actName;
	}

	public String getMvAttCnt() {
		return mvAttCnt;
	}

	public void setMvAttCnt(String mvAttCnt) {
		this.mvAttCnt = mvAttCnt;
	}

}
