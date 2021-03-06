/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.persistence;

import java.util.List;

import org.drools.persistence.PersistenceContext;
import org.jbpm.persistence.correlation.CorrelationKeyInfo;
import org.jbpm.persistence.processinstance.ProcessInstanceInfo;
import org.kie.internal.process.CorrelationKey;

public interface ProcessPersistenceContext
    extends
    PersistenceContext {

    ProcessInstanceInfo persist(ProcessInstanceInfo processInstanceInfo);
    
    CorrelationKeyInfo persist(CorrelationKeyInfo correlationKeyInfo);
    
    ProcessInstanceInfo findProcessInstanceInfo(Long processId);
    
    void remove(ProcessInstanceInfo processInstanceInfo);

    List<Long> getProcessInstancesWaitingForEvent(String type);
    
    Long getProcessInstanceByCorrelationKey(CorrelationKey correlationKey);
}
