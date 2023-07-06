/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.identity.shiro;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensearch.Application;
import org.opensearch.identity.IdentityService;
import org.opensearch.identity.ServiceAccount;
import org.opensearch.identity.ServiceAccountManager;
import org.opensearch.plugins.Plugin;
import org.opensearch.plugins.PluginInfo;

/**
 * Oversees the assignment of ServiceAccounts when using the ShiroIdentityPlugin
 *
 * @opensearch.experimental
 */
class ShiroServiceAccountManager implements ServiceAccountManager {

    private static final Logger log = LogManager.getLogger(IdentityService.class);

    private static Map<Application, ServiceAccount> applicationServiceAccountMap = new HashMap<>();

    @Override
    public ServiceAccount getServiceAccount(Application app) {
        return applicationServiceAccountMap.get(app);
    }

    @Override
    public void registerServiceAccount(PluginInfo info, Plugin plugin) {

    }
}
