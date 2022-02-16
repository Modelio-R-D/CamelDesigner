/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
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
 * Proxy class to handle a {@link Class} with << VerticalScaleRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b293b21a-97ae-47e2-95a3-32cbf8990a9b")
public class VerticalScaleRequirement extends ScaleRequirement {
    @objid ("1197360c-26f5-4c5e-97dd-4fb225871d95")
    public static final String STEREOTYPE_NAME = "VerticalScaleRequirement";

    /**
     * Tells whether a {@link VerticalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f11e17f-6e59-40c5-9393-5468c08119f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScaleRequirement >> then instantiate a {@link VerticalScaleRequirement} proxy.
     * 
     * @return a {@link VerticalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("79e81120-26a3-4631-9993-31db481c119a")
    public static VerticalScaleRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME);
        return VerticalScaleRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link VerticalScaleRequirement} proxy or <i>null</i>.
     */
    @objid ("a55432d5-e953-4e49-b301-28b7d1f4cd82")
    public static VerticalScaleRequirement instantiate(final Class obj) {
        return VerticalScaleRequirement.canInstantiate(obj) ? new VerticalScaleRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VerticalScaleRequirement} proxy from a {@link Class} stereotyped << VerticalScaleRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link VerticalScaleRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6edbfe70-eacb-447f-aa25-e5451910edee")
    public static VerticalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScaleRequirement.canInstantiate(obj))
        	return new VerticalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("VerticalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e7a5ee7d-66a5-4649-8f4e-2736b542cb72")
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
        VerticalScaleRequirement other = (VerticalScaleRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fda17a68-4343-4401-8334-951b8e5cbf0f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c499e15d-50c2-42fa-9192-22768327464e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dd9eacf5-4749-4841-b5f5-96cb0b941062")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("274935eb-6b5e-44da-97e6-f5e41fee11af")
    protected VerticalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("b9142a65-96fb-46c9-ae04-0835babb830d")
    public static final class MdaTypes {
        @objid ("f5a5cda0-ad49-4649-8277-005c75c79ba3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("818edc8b-e244-4aef-b2ee-4e8ffae14636")
        private static Stereotype MDAASSOCDEP;

        @objid ("253e7c01-82f9-4057-abf6-1ff314469793")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("870f8f58-69f5-4800-ba8b-68a2e1d2f008")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1090f8fc-a713-4641-89db-bd23c8a82ab1");
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
