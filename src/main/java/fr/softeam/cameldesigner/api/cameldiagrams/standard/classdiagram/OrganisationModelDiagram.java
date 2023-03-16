/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
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
 * Proxy class to handle a {@link ClassDiagram} with << OrganisationModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8d78609e-ed7f-45f1-93ed-a1fab4832f6e")
public class OrganisationModelDiagram extends AbstractCamelDiagram {
    @objid ("e2e74b10-3824-4c50-85cd-812db8d36231")
    public static final String STEREOTYPE_NAME = "OrganisationModelDiagram";

    /**
     * Tells whether a {@link OrganisationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5dde374f-27b4-4aab-ad85-f4455d89a933")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> then instantiate a {@link OrganisationModelDiagram} proxy.
     * 
     * @return a {@link OrganisationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("8b3bbf80-4297-4ac0-807b-b8888669aeed")
    public static OrganisationModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME);
        return OrganisationModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link OrganisationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link OrganisationModelDiagram} proxy or <i>null</i>.
     */
    @objid ("103dcee2-75d7-466a-a515-07f04e475ff7")
    public static OrganisationModelDiagram instantiate(final ClassDiagram obj) {
        return OrganisationModelDiagram.canInstantiate(obj) ? new OrganisationModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrganisationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link OrganisationModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b8118630-34ea-4d14-825b-4576462871ed")
    public static OrganisationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (OrganisationModelDiagram.canInstantiate(obj))
        	return new OrganisationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("OrganisationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fc40624b-189b-46c1-937e-8d04a5666b7c")
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
        OrganisationModelDiagram other = (OrganisationModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("27fd3232-eb20-4178-ab1e-4de237660b83")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("11df13d2-9a77-439e-adda-0032841649cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b15584df-f081-43d8-9bed-39e490da4b52")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("a7486a85-63fb-4006-9599-fff48402a8ac")
    protected OrganisationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("194a89db-0a89-413a-af39-44bf5446c768")
    public static final class MdaTypes {
        @objid ("e5433b7d-930f-4ee2-b3b0-6dc34e218eec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1af59e75-24da-4991-baa2-972c96a6cdb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2adb88f-d936-4864-9493-ad24c511c0bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b307d08-18f1-48c7-a62e-6b3e19ab8238")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "866330db-6440-4bbe-bd93-4bb567e8f1e7");
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
