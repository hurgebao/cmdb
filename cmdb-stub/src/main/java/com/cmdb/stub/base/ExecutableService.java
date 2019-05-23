package com.cmdb.stub.base;
/**
 * 可执行组件
 * @author admin
 *
 */
public interface ExecutableService extends AuthService,LogService{

	/**
	 * 执行
	 */
	void exec();
}
