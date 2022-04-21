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
 **/
package fr.softeam.cameldesigner.utils;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;

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
    public static Feature createCamelFeature(ModelElement owner) {
        try {
        
            Feature feature = null;
        
            if (owner instanceof ModelTree) {
                feature = FeatureClass.create();
                ((ModelTree) owner ).getOwnedElement().add((ModelTree) feature.getElement());
            }
        
            if(feature != null) {
                feature.setDefaultName("Feature");
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
    public static CamelAttribute createCamelAttribute(ModelElement owner) {
        try {
        
            CamelAttribute result = null;
            if (owner instanceof Classifier) {
                result = AttributeAttribute.create();
                ((Classifier) owner ).getOwnedAttribute().add((Attribute)result.getElement());
            }else  if (owner instanceof org.modelio.metamodel.uml.statik.Package) {
                result = AttributeClass.create();
                ((org.modelio.metamodel.uml.statik.Package) owner ).getOwnedElement().add((org.modelio.metamodel.uml.statik.Class) result.getElement());
            }
        
            if (result != null) {
                result.setDefaultName("Attribute");
            }
            return  result;
        
        }catch(Exception e){
            CamelDesignerModule.logService.error(e);
        }
        return null;
    }

    /**
     * Method createMeasurableAttribute
     * @author ebrosse
     * 
     * @param owner : the owner of the Attribute
     * @return the created Feature
     */
    @objid ("9abe9d2b-a415-4cdf-8fa2-145069c4595b")
    public static CamelAttribute createMeasurableAttribute(ModelElement owner) {
        try {
        
            CamelAttribute result = null;
            if (owner instanceof Classifier) {
                result = MeasurableAttributeAttribute.create();
                ((Classifier) owner ).getOwnedAttribute().add((Attribute)result.getElement());
            }else  if (owner instanceof org.modelio.metamodel.uml.statik.Package) {
                result = MeasurableAttributeClass.create();
                ((org.modelio.metamodel.uml.statik.Package) owner ).getOwnedElement().add((org.modelio.metamodel.uml.statik.Class) result.getElement());
            }
        
            if (result != null) {
                result.setDefaultName("MeasurableAttribute");
            }
        
            return  result;
        
        }catch(Exception e){
            CamelDesignerModule.logService.error(e);
        }
        return null;
    }

    /**
     * Method createQualityAttribute
     * @author ebrosse
     * 
     * @param owner : the owner of the Attribute
     * @return the created Feature
     */
    @objid ("d4ce2fdb-9938-4437-beed-19a763967e8f")
    public static CamelAttribute createQualityAttribute(ModelElement owner) {
        try {
        
            CamelAttribute result = null;
            if (owner instanceof Classifier) {
                result = QualityAttributeAttribute.create();
                ((Classifier) owner ).getOwnedAttribute().add((Attribute)result.getElement());
            }else  if (owner instanceof org.modelio.metamodel.uml.statik.Package) {
                result = QualityAttributeClass.create();
                ((org.modelio.metamodel.uml.statik.Package) owner ).getOwnedElement().add((org.modelio.metamodel.uml.statik.Class) result.getElement());
            }
        
            if (result != null) {
                result.setDefaultName("QualityAttribute");
            }
            return  result;
        
        }catch(Exception e){
            CamelDesignerModule.logService.error(e);
        }
        return null;
    }

}
