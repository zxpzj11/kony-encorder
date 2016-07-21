/**
 * Copyright (c) 2006, Pointdew Inc. All rights reserved.
 * 
 * http://www.pointdew.com
 */
package com.appcel.core.encoder.manager;

import java.util.List;
import java.util.Map;

import com.appcel.facade.encoder.enums.EncoderPlayModeEnum;
import com.appcel.facade.encoder.enums.EncoderStatusEnum;
import com.appcel.facade.encoder.mode.Configure;
import com.appcel.facade.encoder.mode.EncoderInfo;
import com.appcel.kernel.mybatis.manager.BaseManager;

/**
 *  
 * @author Kony.Lee
 * @version appcel 1.0
 * @since JDK-1.7.0
 * @date 2016-5-12
 */
public interface EncoderInfoManager extends BaseManager<EncoderInfo> {

	EncoderInfo createEncoderInfo(String entityKey, String fileName, String srcFilePath, EncoderPlayModeEnum playMode,
			EncoderStatusEnum status, String remark);

	EncoderInfo getEncoderInfoByKey(String key);

	List<EncoderInfo> getEncoderInfoByEntityKey(String entityKey);

	boolean deleteEncoderInfoByEntityKey(String entityKey);

	boolean updateEncoderTime(String key);

	boolean deleteEncoderInfoByKey(String key);

	Configure createConfigure(String name, String value, String remark);

	Configure getConfigureByKey(String key);

	List<Configure> getAllConfigure();

	boolean deleteConfigureByKey(String key);

	boolean updateEncoderStatus(String key, EncoderStatusEnum encoderSatus);

	List<EncoderInfo> getEncoderInfoByStatus(EncoderStatusEnum encoderSatus);

	Map<String, Configure> getAllConfigureMap();

}