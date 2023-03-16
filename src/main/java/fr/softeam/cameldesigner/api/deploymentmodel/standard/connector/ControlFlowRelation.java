/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Connector} with << ControlFlowRelation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf73e626-af6a-49cb-ae56-d447479994a8")
public abstract class ControlFlowRelation extends ComponentRelation {
    @objid ("f66cb1ba-ed3e-456d-88e9-e6b2af4dbd85")
    public static final String STEREOTYPE_NAME = "ControlFlowRelation";

    /**
     * Tells whether a {@link ControlFlowRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ControlFlowRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb7e1814-520b-44ff-9725-7bffc4e1a568")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ControlFlowRelation.STEREOTYPE_NAME));
    }

    @objid ("a5ae1a2f-33ff-4afd-b3ea-711f200a0629")
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
        ControlFlowRelation other = (ControlFlowRelation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("3bdd5335-6f03-46b8-98cc-b917fdcd90e1")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("4f01465d-e452-406f-95cb-fc74c7d5646b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9814345d-64a6-47e3-a5f0-0ddee95b1c02")
    protected ControlFlowRelation(final Connector elt) {
        super(elt);
    }

    @objid ("beb250f6-8464-43b3-92b6-c0dfca43328a")
    public static final class MdaTypes {
        @objid ("156c4f7a-21f2-4d14-a0ff-93fd65cdd821")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dfafb0ed-12ab-42a0-a591-c879fc1dfba1")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c3dc91b-03c6-49e7-856d-55643c614880")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30ed47fe-3053-4bc4-8d41-419d045613b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9e0fdb5c-8b63-4887-83e1-5fee52f3bfdd");
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
