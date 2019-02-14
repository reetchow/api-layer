/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.ca.mfaas.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents one API provided by a service
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiInfo {
    @JsonProperty(required = true)
    private String apiId;
    private String gatewayUrl;
    private String version;
    private String swaggerUrl;
    private String documentationUrl;
}
