/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("0c39dde5-d53e-4891-bef8-f840679803ad")
    public static final String STEREOTYPE_NAME = "ControlFlowRelation";

    /**
     * Tells whether a {@link ControlFlowRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ControlFlowRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d8b3fdaf-62ec-41e3-8da3-9dac9b46d126")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ControlFlowRelation.STEREOTYPE_NAME));
    }

    @objid ("de0e1c59-2d94-4a30-aa2f-cda23f25a1cc")
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
    @objid ("47cc88b8-8bac-4db1-b91e-3e1ed8781984")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("9ca4f8de-ee98-49c2-90a3-fc8b223efec7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("def8233c-6d95-4a4d-9951-c51be25761d5")
    protected ControlFlowRelation(final Connector elt) {
        super(elt);
    }

    @objid ("beb250f6-8464-43b3-92b6-c0dfca43328a")
    public static final class MdaTypes {
        @objid ("400dfe31-4d6d-462b-b0cb-2a2fa8e9e2b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5717705a-1bd5-48bf-96ef-a07833285276")
        private static Stereotype MDAASSOCDEP;

        @objid ("799d4c44-c764-4738-b636-9a60bc1b07d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a924a141-d9e1-4098-8da9-e5b551d29ace")
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
