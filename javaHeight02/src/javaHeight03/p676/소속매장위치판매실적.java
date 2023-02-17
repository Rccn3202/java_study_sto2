package javaHeight03.p676;

public class 소속매장위치판매실적 {

	private String 소속;
	private String 매장위치;
	private Integer 판매실적;
	public String get소속() {
		return 소속;
	}
	public void set소속(String 소속) {
		this.소속 = 소속;
	}
	public String get매장위치() {
		return 매장위치;
	}
	public void set매장위치(String 매장위치) {
		this.매장위치 = 매장위치;
	}
	public Integer get판매실적() {
		return 판매실적;
	}
	public void set판매실적(Integer 판매실적) {
		this.판매실적 = 판매실적;
	}
	public 소속매장위치판매실적(String 소속, String 매장위치, Integer 판매실적) {
		super();
		this.소속 = 소속;
		this.매장위치 = 매장위치;
		this.판매실적 = 판매실적;
	}
	
}
