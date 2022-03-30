/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("95142f12-2b2c-454b-909a-53110f0aaecc")
public abstract class CamelAttribute extends ExpendableElement {
    @objid ("80934d99-e271-4010-938b-98dab9b3ea32")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ed998135-bc0d-44ff-93f0-c0bfc19d15e1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("b88adebf-505b-4439-89fc-e89e81bf5859")
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
        CamelAttribute other = (CamelAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1e126b4e-b62f-47f0-9ad5-03862aded6f1")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("ea947edb-7c19-4ad6-b623-ba030c1b6706")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ce91264e-0001-44d2-981f-3ee1e7494632")
    public abstract Unit getUnit();

    @objid ("48faeeba-82b2-40f8-9227-3a1bb692c423")
    public abstract String getValue();

    @objid ("bf17342a-96ff-4a4d-9982-96223e013ee4")
    public abstract ValueType getValueType();

    @objid ("b0fec14f-55aa-434b-9921-fe5a98c03666")
    public abstract void setUnit(final Unit obj);

    @objid ("87ad5a8c-d7ef-4404-8a08-b2e760da4e61")
    public abstract void setValue(String value);

    @objid ("dfa12e10-a0f9-4768-872b-ef51ea1a5db9")
    public abstract void setValueType(final ValueType obj);

    @objid ("f10f9e3d-aac4-4bc8-860d-3e89634a9ffc")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("9ff4900a-b10f-49db-97e0-190ff726c230")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b78cd506-7301-4ccd-9b0e-4c744b1a8e51")
        private static Stereotype MDAASSOCDEP;

        @objid ("c48a234f-2665-4cbb-9075-a0777b827965")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e18824ee-e295-42ca-b50a-f3c964cb9382")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "342512a5-ad9b-48b8-a454-5fd44237b8f2");
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
