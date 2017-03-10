package com.melcocrown.smartroom.hotsos.config;

import com.melcocrown.MCEException;
import com.melcocrown.config.AppConfig;

public class HotSOSClientConfigImpl extends AppConfig implements HotSOSClientConfig{
	public HotSOSClientConfigImpl() throws MCEException {
		this.load();
	}
	@Override
	public String getWsdlUrl()
	{
		return getString("hotsos.wsdl.url");
	}
	@Override
	public String getHotSOSUserName()
	{
		return getString("hotsos.username");
	}
	@Override
	public String getHotSOSPassword()
	{
		return getString("hotsos.password");
	}
}
