/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << PaaS >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("de5fbae9-da70-4f9b-a638-28a7fd9062a1")
public class PaaS extends CamelComponent {
    @objid ("43f517e8-c261-437e-be63-8b27f7125d80")
    public static final String STEREOTYPE_NAME = "PaaS";

    /**
     * Tells whether a {@link PaaS proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << PaaS >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f17493d-222f-4e54-8a88-182a0eb5056a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << PaaS >> then instantiate a {@link PaaS} proxy.
     * 
     * @return a {@link PaaS} proxy on the created {@link Component}.
     */
    @objid ("3225ede3-d7ed-46a1-9c3a-f503b4da1770")
    public static PaaS create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME);
        return PaaS.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link PaaS} proxy or <i>null</i>.
     */
    @objid ("a73661b1-c189-4ace-8fed-75e7d9ea217b")
    public static PaaS instantiate(final Component obj) {
        return PaaS.canInstantiate(obj) ? new PaaS(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link PaaS} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da1fc708-6503-41a9-8064-603b24fec88b")
    public static PaaS safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (PaaS.canInstantiate(obj))
        	return new PaaS(obj);
        else
        	throw new IllegalArgumentException("PaaS: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bec37690-072e-478b-b164-3e082027ddd2")
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
        PaaS other = (PaaS) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("15c9202e-a75e-46a5-a8ae-7c6302af4421")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("05bf2568-fa79-40b0-85d7-dfc87499ac53")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("03d17871-a8e1-4349-b0c5-dc57ec7631d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4119e1f3-345f-45a9-9b88-d9c5b4d8c7c9")
    protected PaaS(final Component elt) {
        super(elt);
    }

    @objid ("ebb4dcf9-28ac-415f-b6ab-19e64a2fd1da")
    public static final class MdaTypes {
        @objid ("4e6712f6-df68-409b-b05a-71a059423758")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d97126b-8753-4a0f-92a0-31cabcd13d7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("23116bee-1621-4302-b998-dc13adef8546")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86b8621e-eb68-4096-b629-a71aa33908dc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0c33c39-75b6-489b-be58-97166b99012b");
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
