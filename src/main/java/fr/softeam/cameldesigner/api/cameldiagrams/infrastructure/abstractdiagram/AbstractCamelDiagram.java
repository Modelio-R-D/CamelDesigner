/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AbstractDiagram} with << AbstractCamelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6bdaebda-7701-4743-a8e3-51e9d10ac891")
public abstract class AbstractCamelDiagram extends NamedElement {
    @objid ("939618ba-f812-4bf7-8220-5a19c7be4b07")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    /**
     * Tells whether a {@link AbstractCamelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << AbstractCamelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2b11e0a3-b8ef-4461-8cc4-12872189fbfc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AbstractCamelDiagram.STEREOTYPE_NAME));
    }

    @objid ("1e369120-8190-4003-997f-f1441ce00130")
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
        AbstractCamelDiagram other = (AbstractCamelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AbstractDiagram}. 
     * @return the AbstractDiagram represented by this proxy, never null.
     */
    @objid ("b50448e4-d400-4d16-8cba-8f135a1e3692")
    @Override
    public AbstractDiagram getElement() {
        return (AbstractDiagram)super.getElement();
    }

    @objid ("92629be9-2e4f-43f0-891a-fdd975e0673a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("af622552-731d-4d2f-bac3-b1fc0e0c863a")
    protected AbstractCamelDiagram(final AbstractDiagram elt) {
        super(elt);
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
        @objid ("11efb9d3-c3d1-43a4-b417-f17a19bd4dea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81de7b68-cee2-4dba-a66c-4978f462eea6")
        private static Stereotype MDAASSOCDEP;

        @objid ("598669e0-e612-4d69-b851-0251c87d9b36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("09e9601d-25fd-4314-a02d-dd8a1c870418")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c147d6d3-8bd0-4b94-a9d6-164a947fa0b4");
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
