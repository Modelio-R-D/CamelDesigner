/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
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
public abstract class AbstractCamelDiagram extends ExpendableElement {
    @objid ("c3c29700-5c36-4bd1-b05b-10d10cbeb450")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

    /**
     * Tells whether a {@link AbstractCamelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << AbstractCamelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c2ed86c1-8d0c-48d6-b9e5-bf8cccf0d0a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AbstractCamelDiagram.STEREOTYPE_NAME));
    }

    @objid ("78309a47-37ca-4b86-a3c0-ebc9a44eab23")
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
    @objid ("da8fa536-196d-4db6-b672-a7507d9d34c3")
    @Override
    public AbstractDiagram getElement() {
        return (AbstractDiagram)super.getElement();
    }

    @objid ("eaa3a6be-fcde-4645-bd69-cf85b9c6ee4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8437fefd-c0df-40f3-b51e-b26f362f9009")
    protected AbstractCamelDiagram(final AbstractDiagram elt) {
        super(elt);
    }

    @objid ("96cdd4aa-6ccf-4f23-a3d7-5aaaba7243d3")
    public static final class MdaTypes {
        @objid ("64f741e7-5df4-4cd9-b83c-2b07ea5243a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2329f207-f456-49ad-8a74-4a460ece028b")
        private static Stereotype MDAASSOCDEP;

        @objid ("91c6a72b-71b4-4ed1-8573-c4de8b862f4b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0300f286-6bc6-4c48-850e-f3996e472dd4")
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
