package vo;

public class OpinionVO {
	
	private int oid;
	private String ocontent;
	private String odate;
	private String mid;
	private int nid;
	private int ostar;
	private int cnt; // 페이징처리를 위한 cnt
	
	
	
	
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOcontent() {
		return ocontent;
	}
	public void setOcontent(String ocontent) {
		this.ocontent = ocontent;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public int getOstar() {
		return ostar;
	}
	public void setOstar(int ostar) {
		this.ostar = ostar;
	}
	@Override
	public String toString() {
		return "OpinionVO [oid=" + oid + ", ocontent=" + ocontent + ", odate=" + odate + ", mid=" + mid + ", nid=" + nid
				+ ", ostar=" + ostar + ", cnt=" + cnt + "]";
	}
	
	
}
