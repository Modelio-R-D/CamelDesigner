/**
 * Java Class : SysMLModelChangeHandler.java
 *
 * Description :
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing,
 *    software distributed under the License is distributed on an
 *    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *    KIND, either express or implied.  See the License for the
 *    specific language governing permissions and limitations
 *    under the License.
 *
 * @category   Modelio Impl
 * @package    com.modeliosoft.modelio.sysml.impl
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package fr.softeam.cameldesigner.impl;

import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.constraintLang.ConstraintSystem;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.event.IElementDeletedEvent;
import org.modelio.api.modelio.model.event.IModelChangeEvent;
import org.modelio.api.modelio.model.event.IModelChangeHandler;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author ebrosse
 */
@objid ("7bbad295-f3fd-45d0-b6e6-d623bf5b9593")
public class CamelDesignerModelChangeHandler implements IModelChangeHandler {
    @objid ("d299cdf5-f954-4ccb-b8e2-922923d7ef5f")
    @Override
    public void handleModelChange(IModelingSession session, IModelChangeEvent event) {
        //DeletedEvents
        List<IElementDeletedEvent> deletedElements = event.getDeleteEvents();
        for(IElementDeletedEvent deletedElement : deletedElements) {
           MObject obj = deletedElement.getDeletedElement();
           if (obj instanceof Constraint) {
               ConstraintSystem.removeConstraint((Constraint) obj);
           }
        }
        
        
        //Update events
        Set<MObject> updatedElements = event.getUpdateEvents();
        
        for (MObject obj : updatedElements){
            if (obj instanceof Constraint) {
                ConstraintSystem.addConstraint((Constraint) obj);
            }
        }
        
        //Create events
        Set<MObject> createdEvents = event.getCreationEvents();
        
        for (MObject obj : createdEvents){
            if (obj instanceof Constraint) {
                ConstraintSystem.addConstraint((Constraint) obj);
            }
        }
    }

}
