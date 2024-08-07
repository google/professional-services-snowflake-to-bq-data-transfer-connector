/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.connector.snowflakeToBQ.config;

import java.util.HashMap;
import java.util.Map;

import com.google.connector.snowflakeToBQ.model.EncryptedData;
import org.springframework.stereotype.Component;

@Component
public class OAuthCredentials {
  private final Map<String, EncryptedData> oauthMap = new HashMap<>();

  public Map<String, EncryptedData> getOauthMap() {
    return oauthMap;
  }

  // Method to populate the shared map with user-dependent data
  public void populateOauthMap(Map<String, EncryptedData> data) {
    oauthMap.putAll(data);
  }
}
