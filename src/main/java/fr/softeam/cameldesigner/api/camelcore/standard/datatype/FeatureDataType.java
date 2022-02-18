/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("c515222a-505a-450b-9ef1-e439aef19853")
    public static final String STEREOTYPE_NAME = "Feature_DataType";

    /**
     * Tells whether a {@link FeatureDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Feature_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ba50369f-067e-421a-a504-8fd8c2fbacd6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Feature_DataType >> then instantiate a {@link FeatureDataType} proxy.
     * 
     * @return a {@link FeatureDataType} proxy on the created {@link DataType}.
     */
    @objid ("e2d4191f-2ed3-4143-b4c6-bd9cb4cd9ad7")
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
    @objid ("0bbcef33-b62a-4547-b72a-bd41152b12d5")
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
    @objid ("3a0e7c97-739d-4894-80ef-7bd10e59c153")
    public static FeatureDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (FeatureDataType.canInstantiate(obj))
        	return new FeatureDataType(obj);
        else
        	throw new IllegalArgumentException("FeatureDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77dc926c-b863-4706-b40b-30d318b55a65")
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
    @objid ("5cf34fe9-d49d-47b1-bfb0-a3d9a12ee470")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("3741f6f6-10bc-4312-9df4-75cc09dc984e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d9d6f5ae-de79-44aa-8aaf-945d6a560124")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("8194d694-5b3e-4d83-bb1d-c6093a60d941")
    protected FeatureDataType(final DataType elt) {
        super(elt);
    }

    @objid ("70c8de77-0287-43e4-850d-c6ebd3c36717")
    public static final class MdaTypes {
        @objid ("24d5b82f-e788-4cd6-91d7-0189f1be52ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e18bf9e2-3949-48d6-9020-c8c68e21225e")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b30d612-fd1c-47ee-a5cd-5ae7f6722605")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b39e93c7-5715-4c05-a4e6-57e7dabae6bb")
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
