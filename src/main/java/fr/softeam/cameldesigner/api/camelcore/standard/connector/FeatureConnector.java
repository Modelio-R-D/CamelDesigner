/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("df1a8822-06d8-48ac-b71a-145faaa3db00")
    public static final String STEREOTYPE_NAME = "Feature_Connector";

    /**
     * Tells whether a {@link FeatureConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Feature_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f687278-5b7d-420c-9379-eb746260b91d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Feature_Connector >> then instantiate a {@link FeatureConnector} proxy.
     * 
     * @return a {@link FeatureConnector} proxy on the created {@link Connector}.
     */
    @objid ("e7ff0c12-6a14-46ed-a903-82e34bd3138f")
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
    @objid ("acfa54bc-e3a7-4d60-8ff7-02fbb2710029")
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
    @objid ("36a0be5f-3031-4641-90c4-4ac4db58c210")
    public static FeatureConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (FeatureConnector.canInstantiate(obj))
        	return new FeatureConnector(obj);
        else
        	throw new IllegalArgumentException("FeatureConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e8b3dfb-e934-4d2b-85b0-11d0464b7b00")
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
    @objid ("ea2a3075-5309-44d0-9ffb-c2e8500fdc17")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("73046989-c12e-4779-8bef-b27b7016a149")
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

    @objid ("82627751-0485-4b51-8d17-6db1c16e1bf3")
    protected FeatureConnector(final Connector elt) {
        super(elt);
    }

    @objid ("6b5ec3ef-f04f-448d-b275-ff41664d9e6e")
    public static final class MdaTypes {
        @objid ("60ae1299-54f7-4371-b103-5776c2b5992e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5639618-2499-41b8-84dc-b7e7e0e7385b")
        private static Stereotype MDAASSOCDEP;

        @objid ("d575e7d2-5fed-4620-a478-9cae8e04246f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f5936f10-2702-4231-b6e7-062657981097")
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
