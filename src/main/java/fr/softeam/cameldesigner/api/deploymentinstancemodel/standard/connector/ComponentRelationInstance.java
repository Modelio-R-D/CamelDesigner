/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("17d56320-d097-4086-8acd-cac975ff6a67")
    public static final String STEREOTYPE_NAME = "ComponentRelationInstance";

    /**
     * Tells whether a {@link ComponentRelationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16dd9f28-a029-4b30-aed2-56d7caff28bb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelationInstance.STEREOTYPE_NAME));
    }

    @objid ("4feaf39e-7305-4046-bbbb-5a77f95c4e49")
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
    @objid ("bb2ad0b7-163d-4b27-84e9-42420456098a")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("142691aa-d97e-47fc-b4fd-5bc41c17792c")
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

    @objid ("ff339839-6e2d-42ed-a921-8a4fdb85df31")
    protected ComponentRelationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("d927b287-6b8d-4d81-8f18-9bc21a636dd4")
    public static final class MdaTypes {
        @objid ("6ef5f74c-e287-46b7-a8f3-ea93ddb3be54")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b5cbd28e-97f5-4566-a0a5-0193d0ad31f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("720f826c-22d7-47ae-9357-cd2f28074202")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f3327fc-c8d3-4275-a325-390f48e49605")
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
