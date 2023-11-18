/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.vkart.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.vkart.fulfilmentprocess.constants.VkartFulfilmentProcessConstants;

public class VkartFulfilmentProcessManager extends GeneratedVkartFulfilmentProcessManager
{
	public static final VkartFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (VkartFulfilmentProcessManager) em.getExtension(VkartFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
