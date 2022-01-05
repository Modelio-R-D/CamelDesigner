/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 12/8/21 5:48 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.automatic.standard.classdiagram;

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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentInstanceDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7dd98c11-b2ad-47f5-8350-48de718126f7")
public class DeploymentInstanceDiagram {
    @objid ("ebaafcab-03f8-4532-a83b-590694110d18")
    public static final String STEREOTYPE_NAME = "DeploymentInstanceDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("50f9022c-19b3-48f8-9d4d-5c26e3e085d9")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link DeploymentInstanceDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("012ab8ad-2294-42cb-8bb5-43dfdfdcd51e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceDiagram >> then instantiate a {@link DeploymentInstanceDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b76b3aeb-b05b-4711-9a25-9b48bdec06c1")
    public static DeploymentInstanceDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceDiagram.STEREOTYPE_NAME);
        return DeploymentInstanceDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentInstanceDiagram} proxy or <i>null</i>.
     */
    @objid ("e5d9d057-0124-4202-a4c3-ea4e42c40f17")
    public static DeploymentInstanceDiagram instantiate(final ClassDiagram obj) {
        return DeploymentInstanceDiagram.canInstantiate(obj) ? new DeploymentInstanceDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentInstanceDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("26852922-6fec-4f2a-9e2f-3ef112bc6df6")
    public static DeploymentInstanceDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceDiagram.canInstantiate(obj))
        	return new DeploymentInstanceDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3f550cc6-1021-4461-a937-6110c7d442ad")
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
        DeploymentInstanceDiagram other = (DeploymentInstanceDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("5658c846-0a4e-4495-9545-b0b0d8434fae")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("918578e9-9cee-482d-addf-5946c65287e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("af63d188-3f5e-471c-a6fc-2694d77b0e32")
    protected DeploymentInstanceDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("64e6d158-52b5-4adc-936e-d4c86abaaf2b")
    public static final class MdaTypes {
        @objid ("5b50af75-ff1a-480c-8c31-98976fafdf92")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27455422-a84b-4bb2-8edf-534ef8a9176c")
        private static Stereotype MDAASSOCDEP;

        @objid ("826da580-89d3-4ce9-bc85-934f6ee5658a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75d01aec-9d18-4516-9881-2c515c8703f7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5ff2f96-fb60-424e-ae18-02b24209d1af");
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
