/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector;

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
 * Proxy class to handle a {@link Connector} with << ComponentRelationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fe63e6e1-a973-4acb-910b-2f0927d76eb1")
public abstract class ComponentRelationInstance extends FeatureConnector {
<<<<<<< HEAD
    @objid ("9b7fc9a3-583b-4808-8792-3a81df626cb8")
=======
    @objid ("3e546831-5461-48f0-bfaa-07d4367cc40a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ComponentRelationInstance";

    /**
     * Tells whether a {@link ComponentRelationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ab2a7b3c-aac8-4ff5-8d23-fb661af3a0d5")
=======
    @objid ("1e4b9cc7-b152-4290-a072-d3a56ce147b8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelationInstance.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("8331b1d7-8e47-4fc7-9201-5f58307531d6")
=======
    @objid ("089b7938-ff1d-49df-8903-a8c8b72b52f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        ComponentRelationInstance other = (ComponentRelationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("ad8fb51d-d443-47d5-b88d-97f63b7c54be")
=======
    @objid ("e31cbb2d-b1ef-4592-aad1-a453d420cbf2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

<<<<<<< HEAD
    @objid ("4fbcb101-d852-4e96-b163-4395b2b80295")
=======
    @objid ("4f7e2ea9-a797-4c28-9690-5fa584a25cfe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3393835c-4642-4be2-8530-80f3e7c7a222")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("834830c7-e5f1-4a82-a955-2145b17e4630")
=======
    @objid ("77370580-cd4b-416f-9e54-f8cadc1db84e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ComponentRelationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("d927b287-6b8d-4d81-8f18-9bc21a636dd4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("94abd90a-b3cb-4f88-a097-b94656282f1c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("74897abb-3d25-44be-9207-71de0f889f3b")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc905e9c-56f8-4058-9fa0-c83de7246d94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2f445de-bdfc-4fd3-83eb-67f7c7c5307d")
=======
        @objid ("7f0a54e6-95cd-493f-85b4-6a431d6fc85f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a89aa83b-7f70-45f8-8841-d3593f845975")
        private static Stereotype MDAASSOCDEP;

        @objid ("34f34642-2da5-4799-937f-036a821c3f77")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47a310b5-49b5-45ad-a11b-6d9ab80caa0e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b055b982-4854-4f90-adad-1833553f489e");
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
