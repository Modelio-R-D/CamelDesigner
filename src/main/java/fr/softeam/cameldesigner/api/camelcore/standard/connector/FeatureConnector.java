/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("04d181b8-23d2-4e86-8a46-98073300b1f7")
    public static final String STEREOTYPE_NAME = "Feature_Connector";

    /**
     * Tells whether a {@link FeatureConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Feature_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("77abe4bd-af5a-4bda-a4ce-1d70accbd0f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Feature_Connector >> then instantiate a {@link FeatureConnector} proxy.
     * 
     * @return a {@link FeatureConnector} proxy on the created {@link Connector}.
     */
    @objid ("22cb1c47-37be-4f48-a313-299ed75535a3")
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
    @objid ("3c12ebcc-34f0-47bf-9cb3-28bc25aa5f74")
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
    @objid ("53d9e3dd-d4e8-4a95-92b3-b7d83f804f91")
    public static FeatureConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (FeatureConnector.canInstantiate(obj))
            return new FeatureConnector(obj);
        else
            throw new IllegalArgumentException("FeatureConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("def28dc4-301a-4ec5-92e3-a56f1dd0efa2")
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
    @objid ("5bcadd40-b7f0-4b64-ad9f-b3797679c2eb")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("df3cced5-e8d3-40b4-b06c-14d87ccb683b")
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

    @objid ("1718ddd0-d974-4640-8c08-2775853fa04d")
    protected FeatureConnector(final Connector elt) {
        super(elt);
    }

    @objid ("6b5ec3ef-f04f-448d-b275-ff41664d9e6e")
    public static final class MdaTypes {
        @objid ("5c56ed7f-9294-485e-a0ab-b67791cc824c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dd4ab40a-4809-4920-82af-99a07ac5f08b")
        private static Stereotype MDAASSOCDEP;

        @objid ("90ca3cf4-67db-4e58-a2c2-1905f9e263db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("69dc7a9d-9be2-488c-8a55-a747d502fb59")
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
