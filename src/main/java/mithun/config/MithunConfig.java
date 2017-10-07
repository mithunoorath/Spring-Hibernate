package mithun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mithun.learn.samples.App;
import mithun.learn.samples.AppDao;

@Configuration
@ComponentScan(basePackages= {"mithun"})
public class MithunConfig {

	@Bean ("App")
	public App app() {
		App app = new App();
		//app.setAppDao(new AppDao());
		return app;
	}
	@Bean("AppDao")
	public AppDao appDao() {
		AppDao appDao = new AppDao();
		return appDao;
	}
}
