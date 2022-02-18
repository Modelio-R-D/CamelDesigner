/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << VerticalScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4b6ca116-e08c-4a63-a9f4-e79ab6d83774")
public class VerticalScalingAction extends ScalingAction {
    @objid ("6eb35461-3afa-42da-85a0-9c7f53990c17")
    public static final String STEREOTYPE_NAME = "VerticalScalingAction";

    /**
     * Tells whether a {@link VerticalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("89b674f6-6198-4b72-9849-df6723b56b04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScalingAction >> then instantiate a {@link VerticalScalingAction} proxy.
     * 
     * @return a {@link VerticalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("c6813340-386a-43be-910c-67d5dcaf96da")
    public static VerticalScalingAction create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME);
        return VerticalScalingAction.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VerticalScalingAction} proxy from a {@link Class} stereotyped << VerticalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VerticalScalingAction} proxy or <i>null</i>.
     */
    @objid ("75f173ae-2a9e-4004-88ae-9b260ad5c342")
    public static VerticalScalingAction instantiate(final Class obj) {
        return VerticalScalingAction.canInstantiate(obj) ? new VerticalScalingAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VerticalScalingAction} proxy from a {@link Class} stereotyped << VerticalScalingAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VerticalScalingAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("79e12da4-bac0-4090-813b-95cf84e56019")
    public static VerticalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScalingAction.canInstantiate(obj))
        	return new VerticalScalingAction(obj);
        else
        	throw new IllegalArgumentException("VerticalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f3af1ea2-ee29-49ad-9ba9-175f1bc1b4a6")
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
        VerticalScalingAction other = (VerticalScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e7bd09bc-790b-43c2-a7e4-0c6e0c1db1f1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("f293ad8f-b48a-4866-984d-0c9f18b874eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("89dffc50-1039-4dc5-8120-2e2b3678034d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e7bf345d-49aa-41ee-813f-1142064f889a")
    protected VerticalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("9d977d3c-b012-4964-81d8-a352196858d6")
    public static final class MdaTypes {
        @objid ("d37ba57d-e647-48cd-8e98-398ccb572393")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("322129a8-d550-4c45-9798-f4fa558352c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("e8b82077-f4ff-496a-b91e-465897ba5480")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("753dbcda-f03b-48cd-936e-72cd115a9891")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "725de5f4-a090-41c9-b326-f573c1d3b15d");
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
