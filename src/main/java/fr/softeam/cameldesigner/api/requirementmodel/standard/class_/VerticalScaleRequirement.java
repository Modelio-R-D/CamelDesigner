/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("df191773-58db-4f4e-8dce-dc7f9795a062")
    public static final String STEREOTYPE_NAME = "VerticalScaleRequirement";

    /**
     * Tells whether a {@link VerticalScaleRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << VerticalScaleRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b5c6fcc4-8a06-4a81-afbc-66ad50bb293c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VerticalScaleRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << VerticalScaleRequirement >> then instantiate a {@link VerticalScaleRequirement} proxy.
     * 
     * @return a {@link VerticalScaleRequirement} proxy on the created {@link Class}.
     */
    @objid ("c3c6f772-45d9-4158-b5bb-a73e15e50ebf")
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
    @objid ("804dc29d-2304-431a-b565-0919f7f417d2")
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
    @objid ("a25f70a5-8815-4719-9c34-d9ccbe08cb3b")
    public static VerticalScaleRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (VerticalScaleRequirement.canInstantiate(obj))
        	return new VerticalScaleRequirement(obj);
        else
        	throw new IllegalArgumentException("VerticalScaleRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bf4a5411-ab22-430b-badc-824afd690128")
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
    @objid ("048f00f4-67d2-441c-8020-cc170f33fcf5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("55804218-6d75-4259-8d40-4a71e22cbb06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1b2367c2-45eb-41f3-a723-a876da658935")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("e4f5a1a0-18e5-4395-b3e4-55e9620dc895")
    protected VerticalScaleRequirement(final Class elt) {
        super(elt);
    }

    @objid ("b9142a65-96fb-46c9-ae04-0835babb830d")
    public static final class MdaTypes {
        @objid ("f10e23ee-995e-47d1-8beb-368c32d79703")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2cda7104-881e-4ac3-950c-f8e21b27afb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("33b3fd37-f379-4971-82ee-e1fae4ea097d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d509f621-1413-454a-b981-ae2746a2dbf4")
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
