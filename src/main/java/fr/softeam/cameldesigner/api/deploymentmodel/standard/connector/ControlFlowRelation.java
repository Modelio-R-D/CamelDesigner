/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("da0e466a-1bba-44b1-8d01-18b367d4e460")
    public static final String STEREOTYPE_NAME = "ControlFlowRelation";

    /**
     * Tells whether a {@link ControlFlowRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ControlFlowRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a230a83d-ff11-4d42-8c68-3613da3c4d30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ControlFlowRelation.STEREOTYPE_NAME));
    }

    @objid ("26f7f368-36fe-4a2c-91d3-742314a96bab")
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
    @objid ("5e08bb46-e7c2-4764-af32-234209a4100d")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("7967a8c2-2693-4802-ac9b-ae8f02504d48")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e2a2d8da-f45c-427b-8b16-4b458f18dbbe")
    protected ControlFlowRelation(final Connector elt) {
        super(elt);
    }

    @objid ("beb250f6-8464-43b3-92b6-c0dfca43328a")
    public static final class MdaTypes {
        @objid ("2c4b2e05-5427-4673-8f35-e29fa2d40868")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32ceb6d2-659b-48cc-97fb-e6837faaaee5")
        private static Stereotype MDAASSOCDEP;

        @objid ("cc99db6a-d915-43ae-8e2b-ff75854fee67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93b0bbcb-fb8b-40b8-aed2-aed22adadf68")
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
