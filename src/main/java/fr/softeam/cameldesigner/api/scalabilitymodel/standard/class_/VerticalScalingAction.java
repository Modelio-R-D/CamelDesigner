/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("7a1eec7a-a8e1-46a7-963a-080aa55b6423")
    public static final String STEREOTYPE_NAME = "VerticalScalingAction";

    /**
     * Tells whether a {@link VerticalScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c09e59ae-2864-429f-a4cb-77b49418bed7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScalingAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScalingAction >> then instantiate a {@link VerticalScalingAction} proxy.
     * 
     * @return a {@link VerticalScalingAction} proxy on the created {@link Class}.
     */
    @objid ("3783af2b-16cf-41ab-aa81-92bdd80a2950")
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
    @objid ("552b8772-17ca-4b9d-9d93-638f95eadcc3")
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
    @objid ("2dc4986d-8385-4a03-8c45-9114ce6a34a8")
    public static VerticalScalingAction safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScalingAction.canInstantiate(obj))
        	return new VerticalScalingAction(obj);
        else
        	throw new IllegalArgumentException("VerticalScalingAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0569ac6d-f1ad-4ebc-8074-6513c2520d54")
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
    @objid ("89fd01bd-6360-4a19-a4a8-ec1684e345b6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("72a9c075-d9e6-4c9a-9289-042a7ae8de89")
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

    @objid ("c21c435c-5c4c-4f42-bcda-84d2529993db")
    protected VerticalScalingAction(final Class elt) {
        super(elt);
    }

    @objid ("9d977d3c-b012-4964-81d8-a352196858d6")
    public static final class MdaTypes {
        @objid ("5b782739-8f97-4137-ad65-b83088d5a48f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("835c6488-5182-490b-a1b3-538f01d84641")
        private static Stereotype MDAASSOCDEP;

        @objid ("88295b8b-1e46-440e-b427-51ffa9d040df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fa88cc2e-ea76-45e1-bf2b-5bd7097cf1c0")
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
