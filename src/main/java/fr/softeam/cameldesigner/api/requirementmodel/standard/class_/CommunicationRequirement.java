/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << CommunicationRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4039df5b-6637-44a0-b422-e2f658a79b78")
public class CommunicationRequirement extends HardRequirement {
    @objid ("a23766db-8358-486d-8970-572cc1bf5ac6")
    public static final String STEREOTYPE_NAME = "CommunicationRequirement";

    /**
     * Tells whether a {@link CommunicationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CommunicationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a19caa2d-89f4-4572-bff7-e0e647a1b13b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CommunicationRequirement >> then instantiate a {@link CommunicationRequirement} proxy.
     * 
     * @return a {@link CommunicationRequirement} proxy on the created {@link Class}.
     */
    @objid ("d7771970-879f-4d81-b9ef-b14a8fc50f8f")
    public static CommunicationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationRequirement.STEREOTYPE_NAME);
        return CommunicationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationRequirement} proxy from a {@link Class} stereotyped << CommunicationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CommunicationRequirement} proxy or <i>null</i>.
     */
    @objid ("a3949569-873a-4099-a7c6-d94c9bf84c89")
    public static CommunicationRequirement instantiate(final Class obj) {
        return CommunicationRequirement.canInstantiate(obj) ? new CommunicationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationRequirement} proxy from a {@link Class} stereotyped << CommunicationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CommunicationRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("24cfe762-8c66-4c92-af36-12c2c4ec114a")
    public static CommunicationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CommunicationRequirement.canInstantiate(obj))
        	return new CommunicationRequirement(obj);
        else
        	throw new IllegalArgumentException("CommunicationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0b0de975-922b-4371-a833-a7da571edc0f")
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
        CommunicationRequirement other = (CommunicationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8c20ddb6-29a9-4470-8964-373e854680f7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bbb88352-dde3-4455-85a0-1134a884c71d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("72b4b2c7-06f9-47ff-9368-0fbc8d476253")
    protected CommunicationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("d2f08d28-0c46-4738-b9ae-bf1bba9bcb27")
    public static final class MdaTypes {
        @objid ("2ebb65fc-17da-4706-8335-1cb5845d20d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("555b814d-b009-4b1e-b940-df08e6501c7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("735d852a-d06d-4d76-920f-acbd26f2e95b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("71ab0731-79d7-4ab1-9afb-59675ca7ee58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d79c9f3a-4dfe-472a-b36d-70326b490551");
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
