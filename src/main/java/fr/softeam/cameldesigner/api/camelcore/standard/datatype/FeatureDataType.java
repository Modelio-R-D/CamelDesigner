/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Feature_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb49805b-f839-4291-96a7-e27350a2a19b")
public class FeatureDataType extends Feature {
    @objid ("d01e9011-49d0-4bd3-b215-6e62fe6408ba")
    public static final String STEREOTYPE_NAME = "Feature_DataType";

    /**
     * Tells whether a {@link FeatureDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Feature_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d49b6069-2b42-47ec-a9ac-dfcccd4da917")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Feature_DataType >> then instantiate a {@link FeatureDataType} proxy.
     * 
     * @return a {@link FeatureDataType} proxy on the created {@link DataType}.
     */
    @objid ("18f04162-d787-40ac-9d7f-39fb3f8b4855")
    public static FeatureDataType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME);
        return FeatureDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link FeatureDataType} proxy or <i>null</i>.
     */
    @objid ("41ae4d1e-7a09-4fda-95e2-4803bb3bad47")
    public static FeatureDataType instantiate(final DataType obj) {
        return FeatureDataType.canInstantiate(obj) ? new FeatureDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link FeatureDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f87f1cac-8e38-4bb0-a477-2b440ee66c8f")
    public static FeatureDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (FeatureDataType.canInstantiate(obj))
        	return new FeatureDataType(obj);
        else
        	throw new IllegalArgumentException("FeatureDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3145693a-44dd-43ab-ad2d-3cf415ad5d0c")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FeatureDataType other = (FeatureDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("642b96c7-011a-45be-aaa8-8e0db29462f4")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("b6d2edb1-81a1-44d1-91cb-823758bfb050")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d9d6f5ae-de79-44aa-8aaf-945d6a560124")
    @Override
    public List<CamelElement> getChilds() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("f2717e06-1025-42c5-b3fb-37ce61dd6032")
    protected FeatureDataType(final DataType elt) {
        super(elt);
    }

    @objid ("70c8de77-0287-43e4-850d-c6ebd3c36717")
    public static final class MdaTypes {
        @objid ("3a538a3b-fa32-4691-bcda-6b200daa9d01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9da154f1-6a60-4e92-a0e1-0aa428707131")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a44a5bc-9747-4d22-a7c1-fcbe839c9352")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5199710b-bc22-46d2-b0ca-e11c41064118")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eaf56346-fbac-4409-ad4f-4e1a6c4183d1");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
