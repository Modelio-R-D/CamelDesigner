/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

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
 * Proxy class to handle a {@link Connector} with << ComponentRelation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3fb63318-f18c-4336-85d0-330dbedebdfb")
public abstract class ComponentRelation extends FeatureConnector {
    @objid ("7b2dfb78-3b00-4b72-a6a5-be94c279d9f8")
    public static final String STEREOTYPE_NAME = "ComponentRelation";

    /**
     * Tells whether a {@link ComponentRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c456deeb-56b4-47de-aca2-d60cdbab9cd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelation.STEREOTYPE_NAME));
    }

    @objid ("ab842385-cbcd-42b1-80bf-cd58b1dbdc2e")
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
        ComponentRelation other = (ComponentRelation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("b02ee4e4-91e2-4a9e-952c-b7c29f5e3525")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("9aa15931-b266-4f74-a7bb-c8dfde4d15e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("72604249-970a-4160-b83f-e037c6d5791d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c0d48b2b-d432-4ed7-8110-988c078c3e02")
    protected ComponentRelation(final Connector elt) {
        super(elt);
    }

    @objid ("f7e7dc75-93fe-4f68-8a5c-196b34e1a102")
    public static final class MdaTypes {
        @objid ("ff6b20af-8c6f-4c8f-9fa0-f7964b7c37bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c406df9-4155-4bff-a147-8a6e0972e96a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8999b614-454f-4a52-aaf1-90fdedee109c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a74ae2f1-ed9f-498d-b58b-ae6535fc9e7a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1c00d806-f009-48a9-a7de-3f1e462818d1");
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
