/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ea2ab54b-609f-45b2-92ee-20b8e4a50710")
=======
    @objid ("b9f735dd-57c7-40fc-b1e0-df1ae5100581")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "OrganisationModelDiagram";

    /**
     * Tells whether a {@link OrganisationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("7f567246-d776-4de8-81a9-bb3fddfc935c")
=======
    @objid ("38fef822-fe7d-44e4-bd4d-ddcd0dbf64aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> then instantiate a {@link OrganisationModelDiagram} proxy.
     * 
     * @return a {@link OrganisationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("938370d1-7e61-41d3-a03f-0865567dd42f")
=======
    @objid ("4c7f58a5-3aac-40cc-8f20-88eb42c0c3e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("40be65b6-b94e-4388-bc63-449a19695bc5")
=======
    @objid ("a2667dcd-46ca-4945-8f13-c48eea475e12")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("94ffa148-7291-4a88-bfc0-c167c0853167")
=======
    @objid ("52361381-3bfe-4a2e-b905-eb8c3cf3f32a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static OrganisationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (OrganisationModelDiagram.canInstantiate(obj))
        	return new OrganisationModelDiagram(obj);
        else
        	throw new IllegalArgumentException("OrganisationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("040234ce-a73f-4955-8707-ff4d5b6b823f")
=======
    @objid ("01cf81ac-b8a2-450f-b96a-f80404e1da9d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ad02976f-d712-46d7-a02f-300a6b4101c1")
=======
    @objid ("22218390-42c7-453e-8fe4-82a6c72cb1d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("d6b196bb-b42a-43c5-88c4-76e70cda77b5")
=======
    @objid ("3cf72704-8a5d-4f77-9577-05e11558e849")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("8fa14c73-fc0d-4184-950b-b1583f028f53")
=======
    @objid ("03a833c7-c425-446e-b1d9-5613bf2c09b9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected OrganisationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("194a89db-0a89-413a-af39-44bf5446c768")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("4dc88934-3f0c-4602-8493-a9d9be26d1b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69fa35e5-9e3e-4301-a722-c9a4725cf115")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b0862c5-c31d-46b0-9645-212a8c4aa8a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96b9a295-7618-4da8-8656-0fa98dd766ad")
=======
        @objid ("e7ed18c2-3e4f-488e-b4bc-f436101b0d37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("788b6059-2e2f-4412-a1a6-2c85bb37a2c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("3eb7c48b-fd24-4c25-b57e-0cca9e4ddac5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44cb3449-9381-4643-a1e1-a4419e24f207")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
