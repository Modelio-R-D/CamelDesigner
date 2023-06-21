/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Certifiable >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5a184b7e-9e85-4c9f-a879-89cb31cbcc76")
public class Certifiable extends SecurityAttribute {
    @objid ("d6676f87-fd97-41d3-82f2-7090b635d009")
    public static final String STEREOTYPE_NAME = "Certifiable";

    /**
     * Tells whether a {@link Certifiable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Certifiable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("201c7c1b-b44c-4d90-bb42-244038ad3e72")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Certifiable >> then instantiate a {@link Certifiable} proxy.
     * 
     * @return a {@link Certifiable} proxy on the created {@link Class}.
     */
    @objid ("71189d81-51a9-4361-863d-09f6e6b416ea")
    public static Certifiable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Certifiable.STEREOTYPE_NAME);
        return Certifiable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Certifiable} proxy or <i>null</i>.
     */
    @objid ("7b7fdcd2-2902-4930-8dcf-25ebaa26f50c")
    public static Certifiable instantiate(final Class obj) {
        return Certifiable.canInstantiate(obj) ? new Certifiable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Certifiable} proxy from a {@link Class} stereotyped << Certifiable >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Certifiable} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ddb4d5c9-ee44-4432-a5e1-14632d36cd14")
    public static Certifiable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Certifiable.canInstantiate(obj))
        	return new Certifiable(obj);
        else
        	throw new IllegalArgumentException("Certifiable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd14f509-a140-45bc-b102-93c093acd536")
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
        Certifiable other = (Certifiable) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2b2f21a7-48e5-4b2f-9e48-e3ace1dd425a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("d60868fc-2c9d-4368-814c-0e510f6025ef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9b31088a-26b0-4575-bd51-87fd613a1c1f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("72b8a445-9fc7-4991-8370-2872146cfd8a")
    protected Certifiable(final Class elt) {
        super(elt);
    }

    @objid ("aee63aa1-1b38-46c1-b417-2240fa886307")
    public static final class MdaTypes {
        @objid ("a9f35f46-ac21-4782-b087-3203678b788a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21a9710b-05da-4cc6-b8bc-a493d2f2e7f2")
        private static Stereotype MDAASSOCDEP;

        @objid ("8313d765-788d-4c1d-993c-c9e002dc41a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("091c6612-ded4-4a82-a309-42d0158652cf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2ded821f-dd6d-4a25-82d8-46091a835fa0");
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
