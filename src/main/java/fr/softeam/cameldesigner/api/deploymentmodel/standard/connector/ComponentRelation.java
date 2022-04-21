/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("bf502587-e9bc-4ce9-bed3-9d234e42006b")
    public static final String STEREOTYPE_NAME = "ComponentRelation";

    /**
     * Tells whether a {@link ComponentRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a10f871c-bf9f-4d18-8d5d-ead8cc127cb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelation.STEREOTYPE_NAME));
    }

    @objid ("9a6ce928-ec64-41d3-89a2-1a3675cfc5df")
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
     * 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("57989eef-8bdd-4311-acbc-db4bc4272a42")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("e626134b-ec0f-4574-bb5c-df9a963e4618")
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

    @objid ("cef26052-5369-4d8a-931c-150a76b809b2")
    protected ComponentRelation(final Connector elt) {
        super(elt);
    }

    @objid ("f7e7dc75-93fe-4f68-8a5c-196b34e1a102")
    public static final class MdaTypes {
        @objid ("4c5ceb8e-a213-4cc2-b449-8a65d4fc0684")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3e2756c-ed4b-4d82-ac52-1087c315241f")
        private static Stereotype MDAASSOCDEP;

        @objid ("a49e6b87-8601-4272-9550-cb9f3ac3cc57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f144cfd5-d608-45b1-ac84-9970a74bd155")
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
