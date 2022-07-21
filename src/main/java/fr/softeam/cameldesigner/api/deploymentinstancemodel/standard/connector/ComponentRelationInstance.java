/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("2e147b69-f07f-437f-8a97-69f37fb7d3e5")
    public static final String STEREOTYPE_NAME = "ComponentRelationInstance";

    /**
     * Tells whether a {@link ComponentRelationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ad49867-5e4a-414c-8edb-4becd07a76ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelationInstance.STEREOTYPE_NAME));
    }

    @objid ("2f36d3e1-b994-4471-89a4-f5e9bd401080")
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
    @objid ("6166305a-9992-4ea3-8534-3c05e5173041")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("9b1fdf33-cdaa-4af6-95c9-d789c7376464")
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

    @objid ("ae71c73a-4467-4980-b068-1a52427f1649")
    protected ComponentRelationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("d927b287-6b8d-4d81-8f18-9bc21a636dd4")
    public static final class MdaTypes {
        @objid ("124afa52-2052-4079-8b16-c78e115f54f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83ca64b6-140f-4baa-b901-e4afdb4686f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea497496-de90-424a-9505-14d9b424ae17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ac45d61-5694-4d45-b6bc-e2db4e3de460")
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
