/**
 * Java Class : SysMLFactory.java
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
 * @category   Util
 * @package    com.modeliosoft.modelio.sysml.utils
 * @author     Modelio
 * @license    http://www.apache.org/licenses/LICENSE-2.0
 * @version    2.0.08
 **/
package fr.softeam.cameldesigner.utils;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class handles the creation of abstract Camel elements
 * @author ebrosse
 */
@objid ("ad85fb14-c72b-4d32-8914-f1bb45461be6")
public class CamelFactory {
    /**
     * Method createCamelFeature
     * @author ebrosse
     * 
     * @param owner : the owner of the Feature
     * @return the created Feature
     */
    @objid ("7215894b-25c0-48d8-b350-6c380c7fe993")
    public static Feature createCamelFeature(MObject owner) {
        try {
        
            Feature feature = null;
            if (owner instanceof ModelTree) {
                feature = FeatureClass.create();
                ((ModelTree) owner ).getOwnedElement().add((ModelTree) feature.getElement());
            }
        
            return  feature;
        }catch(Exception e){
            CamelDesignerModule.logService.error(e);
        }
        return null;
    }

    /**
     * Method createCamelAttribute
     * @author ebrosse
     * 
     * @param owner : the owner of the Attribute
     * @return the created Feature
     */
    @objid ("2aa292c8-98cc-41ef-b818-d2686b2928a0")
    public static AttributeAttribute createCamelAttribute(MObject owner) {
        try {
        
            AttributeAttribute attribute = null;
            if (owner instanceof Classifier) {
                attribute = AttributeAttribute.create();
                ((Classifier) owner ).getOwnedAttribute().add(attribute.getElement());
            }
        
            return  attribute;
        
        }catch(Exception e){
            CamelDesignerModule.logService.error(e);
        }
        return null;
    }

}
