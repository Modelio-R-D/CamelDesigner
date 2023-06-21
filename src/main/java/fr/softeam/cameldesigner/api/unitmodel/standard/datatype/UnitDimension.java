/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
 * Proxy class to handle a {@link DataType} with << UnitDimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1707f141-4e9c-4725-b618-05f025f22d01")
public class UnitDimension extends FeatureDataType {
    @objid ("7ce6f8b3-273d-48da-b426-fcdde48b9009")
    public static final String STEREOTYPE_NAME = "UnitDimension";

    /**
     * Tells whether a {@link UnitDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << UnitDimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1efa18d5-e1c2-4ad8-a017-bcf38982014c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << UnitDimension >> then instantiate a {@link UnitDimension} proxy.
     * 
     * @return a {@link UnitDimension} proxy on the created {@link DataType}.
     */
    @objid ("c349489e-9b2a-48b5-b276-cc86acc2612f")
    public static UnitDimension create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME);
        return UnitDimension.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link UnitDimension} proxy or <i>null</i>.
     */
    @objid ("b39914d1-6aee-45fe-959d-119af55d79d4")
    public static UnitDimension instantiate(final DataType obj) {
        return UnitDimension.canInstantiate(obj) ? new UnitDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link UnitDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d2e4455-6064-489e-80b1-12000ed300e0")
    public static UnitDimension safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (UnitDimension.canInstantiate(obj))
        	return new UnitDimension(obj);
        else
        	throw new IllegalArgumentException("UnitDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a7ba8cf-04e4-488a-ada2-9f9ba23bdac2")
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
        UnitDimension other = (UnitDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("a8e2459c-3b4a-4c3b-8ba9-d5ac08b165b3")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("e64f0343-6776-4452-bbe8-844d027340c7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("404a3d74-e6ec-4fb4-b209-6e8bc5e16ad1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("af667ddb-c235-4ceb-8480-edf959dc60bf")
    protected UnitDimension(final DataType elt) {
        super(elt);
    }

    @objid ("75da9eb1-b40f-49c3-9600-695ba46ea42f")
    public static final class MdaTypes {
        @objid ("24493145-66b6-4b6c-a8ed-17091e2553ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e4a4526-cdef-42be-ac73-d1548223faf8")
        private static Stereotype MDAASSOCDEP;

        @objid ("09638350-1895-49c5-9006-841e42c0ead0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f89e0b0-55dc-4c03-8d0f-d2b95c7c1884")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ce437f2d-07f2-4127-9702-da4eb627b157");
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
