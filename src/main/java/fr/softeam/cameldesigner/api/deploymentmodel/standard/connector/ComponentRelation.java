/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("fcf2f693-3037-4a61-80fd-8cbbd3d65ee1")
    public static final String STEREOTYPE_NAME = "ComponentRelation";

    /**
     * Tells whether a {@link ComponentRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("effc495f-b93a-4daa-a69c-acf5e713cb62")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelation.STEREOTYPE_NAME));
    }

    @objid ("484ee455-d4ea-4454-9b95-2b9b867baa3f")
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
    @objid ("fa50a4b3-9972-4483-b8b5-47f27fac6294")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("04db4cf4-9fa7-4dd3-9e4d-aa4632230c23")
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

    @objid ("ebb1c645-a18d-408d-8ff7-5416774f48ef")
    protected ComponentRelation(final Connector elt) {
        super(elt);
    }

    @objid ("f7e7dc75-93fe-4f68-8a5c-196b34e1a102")
    public static final class MdaTypes {
        @objid ("d2258654-f6b4-4a7a-9fa0-3bc751437aa0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59ca1ab0-fccf-418d-bb72-58354a028c22")
        private static Stereotype MDAASSOCDEP;

        @objid ("0fc9024d-13c6-432f-873a-2e9453bb5d98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e32018b1-cba4-43a8-ae81-625ec71ca5b0")
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
