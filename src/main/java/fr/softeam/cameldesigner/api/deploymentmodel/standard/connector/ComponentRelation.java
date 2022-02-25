/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("aafaee00-bbfc-427e-a2cb-3500215d0f09")
    public static final String STEREOTYPE_NAME = "ComponentRelation";

    /**
     * Tells whether a {@link ComponentRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91840031-b323-4e12-a15a-b5a02280c404")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelation.STEREOTYPE_NAME));
    }

    @objid ("23c71a4f-50da-4432-910a-9216f9c40615")
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
    @objid ("dc86b2ba-b51f-45af-a825-bce184a6e70d")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("437dbb67-22f2-4e7d-803d-e0262ea3151d")
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

    @objid ("8b668769-b0ea-4497-ab06-1e15cd5f46c4")
    protected ComponentRelation(final Connector elt) {
        super(elt);
    }

    @objid ("f7e7dc75-93fe-4f68-8a5c-196b34e1a102")
    public static final class MdaTypes {
        @objid ("008f97f1-35da-4f11-b5b5-5d1619e14064")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ee56843-e4ff-4f82-bc20-0c31ad6d9e44")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a469202-4d9c-4541-9959-23c9f3108f1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("440f9c3c-26aa-45b1-bf91-fbfae4cbf84f")
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
