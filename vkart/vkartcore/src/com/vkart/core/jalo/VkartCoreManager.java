/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.vkart.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.vkart.core.constants.VkartCoreConstants;
import com.vkart.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class VkartCoreManager extends GeneratedVkartCoreManager
{
	public static final VkartCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (VkartCoreManager) em.getExtension(VkartCoreConstants.EXTENSIONNAME);
	}
}
