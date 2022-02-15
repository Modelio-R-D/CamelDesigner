/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << ComponentRelationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fe63e6e1-a973-4acb-910b-2f0927d76eb1")
public abstract class ComponentRelationInstance extends FeatureConnector {
    @objid ("44304118-abb2-48e5-9c2b-20a561b56c7b")
    public static final String STEREOTYPE_NAME = "ComponentRelationInstance";

    /**
     * Tells whether a {@link ComponentRelationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0a6008c4-e290-44b5-b747-eafdeda42915")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelationInstance.STEREOTYPE_NAME));
    }

    @objid ("8189a073-ebc7-4b69-a8de-1ba5e5fdf97a")
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
        ComponentRelationInstance other = (ComponentRelationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("9941c2f7-f4cb-493a-a8bb-8bc06fcdde3d")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("97274d91-4eac-4dc5-a9af-4e0eb5850eb9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3393835c-4642-4be2-8530-80f3e7c7a222")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c80d2567-f678-476e-b356-c9a8538b2e9e")
    protected ComponentRelationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("d927b287-6b8d-4d81-8f18-9bc21a636dd4")
    public static final class MdaTypes {
        @objid ("7a6b9a53-527e-4ebe-a3e2-0e08ec71839c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d9a3389-a8a8-45fe-964e-c59f827331bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("39e3e511-5e87-466e-b81d-8cf1e2bc16cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31751015-f7f8-4a0b-b332-56e0323c0aa9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b055b982-4854-4f90-adad-1833553f489e");
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
