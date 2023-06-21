/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("3ad671d7-9f3b-4b00-b283-4b58e2a8f173")
    public static final String STEREOTYPE_NAME = "ControlFlowRelation";

    /**
     * Tells whether a {@link ControlFlowRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ControlFlowRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("882c7542-7c1d-40d4-b113-43d055670d20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ControlFlowRelation.STEREOTYPE_NAME));
    }

    @objid ("d9e2d34a-ddc4-4b16-ae4b-3da168cfcd08")
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
    @objid ("29a10593-e043-4908-ae2d-1f9ca99b2b87")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("5a3cc051-bfb1-42f7-ab9c-e8f3986abab9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("674074e9-6d3b-4094-8caf-a5a99720013f")
    protected ControlFlowRelation(final Connector elt) {
        super(elt);
    }

    @objid ("beb250f6-8464-43b3-92b6-c0dfca43328a")
    public static final class MdaTypes {
        @objid ("4b4e24f6-fc90-49ec-8904-2ddf07bdf656")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0416840b-9e3b-447f-91f7-ed64282ad2cb")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e76ad3b-f141-4fa9-ba59-f3a574487c8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1f8c86f-ebd6-42d4-ab00-cf415dd571a6")
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
