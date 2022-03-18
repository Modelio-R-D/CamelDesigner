/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("0a5e7b3d-13cb-48e5-a7a6-7b99674335b0")
    public static final String STEREOTYPE_NAME = "PaaS";

    /**
     * Tells whether a {@link PaaS proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << PaaS >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e76397cb-47ad-453e-a890-732423d0001d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << PaaS >> then instantiate a {@link PaaS} proxy.
     * 
     * @return a {@link PaaS} proxy on the created {@link Component}.
     */
    @objid ("cfa1e91e-7c7c-4eed-b41c-58fca7e557d3")
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
    @objid ("d7c8b438-5c49-4f02-b364-8df1ce4f81bf")
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
    @objid ("af3cac09-0413-4530-b8e3-10d8859ccf87")
    public static PaaS safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (PaaS.canInstantiate(obj))
        	return new PaaS(obj);
        else
        	throw new IllegalArgumentException("PaaS: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd86c368-e27e-4863-b08a-e5fdc7c99d57")
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
    @objid ("91a7771f-714f-4505-840a-acf93d4dc9d9")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("724dc1bc-3453-4885-89e2-3389f7fbdd35")
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

    @objid ("06b0c01e-f517-4f9d-b374-510c1e6a647a")
    protected PaaS(final Component elt) {
        super(elt);
    }

    @objid ("ebb4dcf9-28ac-415f-b6ab-19e64a2fd1da")
    public static final class MdaTypes {
        @objid ("3df017f5-16f5-4393-9345-21b6b7dec3b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87c283ec-e9b3-4f53-ae07-1ddc3174b002")
        private static Stereotype MDAASSOCDEP;

        @objid ("75920243-f5e5-4c37-929c-6ee2a1fc1879")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1cb3999-9a7f-46e0-8052-b0db081f49a2")
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
