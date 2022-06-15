/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Connector} with << Feature_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e8779648-b44d-4776-a06d-d33bf013b2d7")
public class FeatureConnector extends Feature {
    @objid ("38f77800-1cec-4e62-8c7b-72f5aa82f84c")
    public static final String STEREOTYPE_NAME = "Feature_Connector";

    /**
     * Tells whether a {@link FeatureConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Feature_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c2717f3-00a6-4927-b090-37e024bd9f88")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Feature_Connector >> then instantiate a {@link FeatureConnector} proxy.
     * 
     * @return a {@link FeatureConnector} proxy on the created {@link Connector}.
     */
    @objid ("de5f3ccd-aa6b-460d-8358-5f3119d01eb9")
    public static FeatureConnector create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME);
        return FeatureConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Connector
     * @return a {@link FeatureConnector} proxy or <i>null</i>.
     */
    @objid ("d314e40a-bbae-4dc4-b952-b3049d3dc65b")
    public static FeatureConnector instantiate(final Connector obj) {
        return FeatureConnector.canInstantiate(obj) ? new FeatureConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Connector}
     * @return a {@link FeatureConnector} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81c56b01-fdfa-456b-abaa-12738db0bf16")
    public static FeatureConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (FeatureConnector.canInstantiate(obj))
            return new FeatureConnector(obj);
        else
            throw new IllegalArgumentException("FeatureConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5629473d-2254-4389-bae7-e1de17a1fec6")
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
        FeatureConnector other = (FeatureConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}.
     * 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("0ffc9279-343b-4a5c-a84d-fe934cf018c7")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("87e6f377-bd28-4b86-95c7-8291f1f11bf1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b0ac0664-9e5c-4d5f-bd16-84f8e88c845b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9a3e93f1-6df0-4339-9018-0bd2c35573f8")
    protected FeatureConnector(final Connector elt) {
        super(elt);
    }

    @objid ("6b5ec3ef-f04f-448d-b275-ff41664d9e6e")
    public static final class MdaTypes {
        @objid ("5ed08267-cd71-482c-916f-efd847eb86e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d3e508e-a649-4f2d-9dec-17ea8b85b542")
        private static Stereotype MDAASSOCDEP;

        @objid ("44f762ba-b3c7-49d2-8f1f-060c603b4801")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e882f9e-34a7-44de-8bd5-a2b14d26225c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e94d1d27-429c-47ce-a373-e940bf1bf49b");
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
