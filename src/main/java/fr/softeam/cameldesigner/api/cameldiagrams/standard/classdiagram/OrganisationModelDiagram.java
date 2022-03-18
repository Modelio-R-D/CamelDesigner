/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("a3034622-5283-47cf-bf27-33f02e4e237d")
    public static final String STEREOTYPE_NAME = "OrganisationModelDiagram";

    /**
     * Tells whether a {@link OrganisationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("829d462b-9ee0-46e5-99c6-528945bf2174")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> then instantiate a {@link OrganisationModelDiagram} proxy.
     * 
     * @return a {@link OrganisationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("aa3964ae-55ec-4c85-94cf-d3b99208f34a")
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
    @objid ("3b76ef47-ec52-42b2-9f54-44193f1c83f1")
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
    @objid ("38400cec-8015-4cba-984d-d923d0b333f6")
    public static OrganisationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (OrganisationModelDiagram.canInstantiate(obj))
        	return new OrganisationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("OrganisationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("370c09b6-9bac-4f6e-91b9-2bd487b7cc69")
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
    @objid ("0673be52-9738-4f83-b284-292b29d51cd6")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("178be423-010a-42b9-a154-bf652916066c")
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

    @objid ("54eaf474-7a7c-40b9-b0ec-8b1016dcdac1")
    protected OrganisationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("194a89db-0a89-413a-af39-44bf5446c768")
    public static final class MdaTypes {
        @objid ("655989cd-1444-4ade-b6c9-798f9953c3db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d17c1ec0-8a5e-4fe4-82ad-416a23c1fef4")
        private static Stereotype MDAASSOCDEP;

        @objid ("18cc97a1-afb6-4c90-8bc9-99d62cd7b4c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bef0db73-df43-4839-b01e-92323ebf1054")
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
