/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.domain.dataconnection;

import org.apache.commons.lang.ClassUtils;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.hateoas.RelProvider;
import org.springframework.stereotype.Component;

/**
 * Created by kyungtaak on 2016. 6. 16..
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DataConnectionRelProvider implements RelProvider {

  @Override
  public String getItemResourceRelFor(Class<?> aClass) {
    return "connection";
  }

  @Override
  public String getCollectionResourceRelFor(Class<?> aClass) {
    return "connections";
  }

  @Override
  public boolean supports(Class<?> aClass) {
    return ClassUtils.isAssignable(aClass, DataConnection.class);
  }
}
