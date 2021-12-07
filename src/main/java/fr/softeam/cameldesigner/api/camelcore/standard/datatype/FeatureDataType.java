/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("c6a195cf-3a3d-4b07-9e02-fc2fb8646dbe")
    public static final String STEREOTYPE_NAME = "Feature_DataType";

    /**
     * Tells whether a {@link FeatureDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Feature_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fe158f15-cc50-4986-9616-500775c00f76")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Feature_DataType >> then instantiate a {@link FeatureDataType} proxy.
     * 
     * @return a {@link FeatureDataType} proxy on the created {@link DataType}.
     */
    @objid ("5c71f198-d180-4d2b-8904-973012c03053")
    public static FeatureDataType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME);
        return FeatureDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link FeatureDataType} proxy or <i>null</i>.
     */
    @objid ("59633257-9587-47c7-8fb9-9ad4fbe3e224")
    public static FeatureDataType instantiate(final DataType obj) {
        return FeatureDataType.canInstantiate(obj) ? new FeatureDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link FeatureDataType} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6eb5ab77-1d51-471e-8ad6-30f2d46eb4c3")
    public static FeatureDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (FeatureDataType.canInstantiate(obj))
            return new FeatureDataType(obj);
        else
            throw new IllegalArgumentException("FeatureDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ce430d8-9509-47f9-a4e9-75006901befe")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("c285f6a7-7b44-48be-a1ed-a193fc2a75d1")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("659b2a06-adb3-45a6-a1f5-ded527bcc5f1")
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

    @objid ("cfdb4bf4-ea05-4ba8-b0e8-f47116e3a1d7")
    protected FeatureDataType(final DataType elt) {
        super(elt);
    }

    @objid ("70c8de77-0287-43e4-850d-c6ebd3c36717")
    public static final class MdaTypes {
        @objid ("954e0162-d355-4cf9-8814-c815947f44ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32fbf89a-6a46-4487-abe1-9aa374cc29bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("01e4c535-3aa6-4935-8b07-5bc177b4a80a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea335c4c-e61e-4591-af26-17144b9ef947")
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
