/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("cf810682-796b-4352-b9e1-9121e5b0bf03")
    public static final String STEREOTYPE_NAME = "ComponentRelationInstance";

    /**
     * Tells whether a {@link ComponentRelationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("97aa1a1e-48c7-494e-984f-a6b8e0e8156e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelationInstance.STEREOTYPE_NAME));
    }

    @objid ("26076e59-75fb-40bb-9929-dd8f1106d518")
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
    @objid ("da98558c-7f04-4947-9bb8-22be483256df")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("0e712684-6e25-422d-9275-c295c81dc618")
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

    @objid ("6fb23e9d-b092-4e86-aac0-f68ade1a5575")
    protected ComponentRelationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("d927b287-6b8d-4d81-8f18-9bc21a636dd4")
    public static final class MdaTypes {
        @objid ("70722bbf-3652-4d76-91de-8528ce563a73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a95a83a7-72e7-421f-a084-3c18fcd41bee")
        private static Stereotype MDAASSOCDEP;

        @objid ("8df39ac7-f704-475d-b3c8-1162e584c771")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2caf490b-4069-46bb-98b9-ce029606255e")
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
