package com.xxl.job.core.handler;

import com.xxl.job.core.biz.model.ReturnT;

/**
 * job handler
 *
 * @author xuxueli 2015-12-19 19:06:38
 */
public abstract class IJobHandler {


	/** success */
	public static final ReturnT<String> SUCCESS = new ReturnT<String>(200, null);
	/** fail */
	public static final ReturnT<String> FAIL = new ReturnT<String>(500, null);
	/** fail retry */
	public static final ReturnT<String> FAIL_RETRY = new ReturnT<String>(501, null);


	/**
	 * execute handler
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public abstract ReturnT<String> execute(String... params) throws Exception;


	/**
	 * init handler
	 */
	public void init() {
		// TODO
	}


	/**
	 * destroy handler
	 */
	public void destroy() {
		// TODO
	}


}
