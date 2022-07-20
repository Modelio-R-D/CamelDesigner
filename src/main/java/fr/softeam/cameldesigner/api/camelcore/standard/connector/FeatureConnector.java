/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("7a28fb4a-b364-4114-981c-81a0139e960e")
    public static final String STEREOTYPE_NAME = "Feature_Connector";

    /**
     * Tells whether a {@link FeatureConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Feature_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("81252723-0724-4052-bcab-70507d0d029e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Feature_Connector >> then instantiate a {@link FeatureConnector} proxy.
     * 
     * @return a {@link FeatureConnector} proxy on the created {@link Connector}.
     */
    @objid ("78a7c290-85d2-49d5-b2a6-3ce3e427bb3d")
    public static FeatureConnector create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME);
        return FeatureConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link FeatureConnector} proxy or <i>null</i>.
     */
    @objid ("3fbf5c13-b33a-4ac4-b543-d7a8eab8f013")
    public static FeatureConnector instantiate(final Connector obj) {
        return FeatureConnector.canInstantiate(obj) ? new FeatureConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureConnector} proxy from a {@link Connector} stereotyped << Feature_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link FeatureConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("19d1ff67-c379-42a0-b91c-fa329b4a2666")
    public static FeatureConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (FeatureConnector.canInstantiate(obj))
        	return new FeatureConnector(obj);
        else
        	throw new IllegalArgumentException("FeatureConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f10745f4-d2ea-4df7-bcbd-710b386eeed5")
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
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("7d94b57e-3444-4670-adde-c112a67ac1c4")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("3543b271-7cd1-42e2-b4c8-3e255c74b252")
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

    @objid ("83139d89-8bb1-4eac-9d1d-e7b9e9afad51")
    protected FeatureConnector(final Connector elt) {
        super(elt);
    }

    @objid ("6b5ec3ef-f04f-448d-b275-ff41664d9e6e")
    public static final class MdaTypes {
        @objid ("dcea1e9d-ce03-42ff-a281-c4b50a4bd7bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b42aa748-c081-4392-8267-90bf3994d0fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed19ca30-5582-4979-9c2c-f0e5b842276a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5aef6fe-cf7e-41f9-aaf2-eb2cb8059025")
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
