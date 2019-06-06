package com.cmdb.web.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class CmdbGenerator {
	public static void main(String[] args) throws Exception {
		List<String> warns=new ArrayList<String>();
		boolean overwrite=true;
		InputStream is=CmdbGenerator.class.getResourceAsStream("/generatorConfig.xml");
		ConfigurationParser cp=new ConfigurationParser(warns);
		Configuration config=cp.parseConfiguration(is);
		is.close();
		DefaultShellCallback callback=new DefaultShellCallback(overwrite);
		MyBatisGenerator mybatisGenerator=new MyBatisGenerator(config,callback,warns);
		mybatisGenerator.generate(null);
		for(String warning:warns) {
			System.out.println(warning);
		}
	}
}
