/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("45d496ef-7ecc-409d-b61c-75448c6b161c")
    public static final String STEREOTYPE_NAME = "OrganisationModelDiagram";

    /**
     * Tells whether a {@link OrganisationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4ef18850-052c-4cb1-8f84-31e5d14c539a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> then instantiate a {@link OrganisationModelDiagram} proxy.
     * 
     * @return a {@link OrganisationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("fbc8b079-4642-4f85-80ea-8114821be355")
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
    @objid ("18bb4317-3548-4b1d-a1b7-d08965118e61")
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
    @objid ("4b41fe43-87a7-4e3c-a961-f22ad4914977")
    public static OrganisationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (OrganisationModelDiagram.canInstantiate(obj))
        	return new OrganisationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("OrganisationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa8e935d-4937-4b90-a18d-e7cd39c61858")
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
    @objid ("f505058e-ee12-4318-805f-808333bf992b")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("b9e09408-8ee3-48b9-91f8-aec7d55cbed0")
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

    @objid ("6216547b-2ea7-4fd1-a128-1c6f521fdc61")
    protected OrganisationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("194a89db-0a89-413a-af39-44bf5446c768")
    public static final class MdaTypes {
        @objid ("d90e1a64-35b2-49f1-b3a9-f55aca20b910")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("413795ac-f2c7-48e1-a8de-9890584d56f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("69fd0637-7b0b-468b-862b-1f369141accd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac8b828f-25c9-4965-bbdb-e0ca40424b3f")
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
