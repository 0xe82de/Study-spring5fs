package spring;

import org.springframework.beans.factory.annotation.Value;

public class Info {

	@Value("${info.version}")
	private String version;
	
	public void printInfo() {
		System.out.println("version = " + version);
	}
	
//	@Value("${info.version}") // 수정자에도 @Value 애노테이션을 사용할 수 있다.
	public void setVersion(String version) {
		this.version = version;
	}
	
}
