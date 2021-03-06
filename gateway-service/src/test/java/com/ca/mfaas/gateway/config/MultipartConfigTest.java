/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */

package com.ca.mfaas.gateway.config;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultipartConfigTest {
    @Test
    public void shouldDoPutRequestAndReturnTrue() {
        MockHttpServletRequest request = new MockHttpServletRequest("PUT", "/api/v1/");
        request.setContentType("multipart/");
        MultipartConfig multipartConfig = new MultipartConfig();
        assertTrue(multipartConfig.multipartResolver().isMultipart(request));
    }

    @Test
    public void shouldDoGetRequestAndReturnFalse() {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/v1/");
        request.setContentType("multipart/");
        MultipartConfig multipartConfig = new MultipartConfig();
        assertFalse(multipartConfig.multipartResolver().isMultipart(request));
    }
}
