package com.chabed.configure;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {
	
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(9000);
	}

}
