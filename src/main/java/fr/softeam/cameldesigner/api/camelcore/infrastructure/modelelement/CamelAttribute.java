/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
public abstract class CamelAttribute extends NamedElement {
    @objid ("d19d6fab-28c4-4fbb-8339-2c625e5266b4")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    /**
     * Tells whether a {@link CamelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CamelAttribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b7c982e-d394-4cff-a561-765431cdae97")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME));
    }

    @objid ("79a69203-ccae-4efa-a016-363ad7ce4559")
    public static CamelAttribute instantiate(final ModelElement obj) {
        return AttributeAttribute.canInstantiate(obj) ? AttributeAttribute.instantiate(obj) :
            AttributeClass.canInstantiate(obj) ? AttributeClass.instantiate(obj) : null;
    }

    @objid ("c0d803c0-d6f0-4c15-b31b-52a5d20ed1f6")
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
    @objid ("0cabf13d-9baf-4764-bd52-515b6dc8d1e6")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("3e5c68b8-2bf0-4d52-93b4-a4a85a1192c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("48faeeba-82b2-40f8-9227-3a1bb692c423")
    public abstract String getValue();

    @objid ("87ad5a8c-d7ef-4404-8a08-b2e760da4e61")
    public abstract void setValue(String value);

    @objid ("2b052e1f-d157-4a2e-9880-7b39873a348f")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("2a3c36da-2672-4463-9ed1-6b11a82d1676")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ac5990d-219d-48ca-9a50-6b895a09d6ad")
        private static Stereotype MDAASSOCDEP;

        @objid ("860ac612-ddae-4aed-8b03-502b3d3c2ad8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b094539-c089-41d0-99a5-0566ea761cd0")
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
