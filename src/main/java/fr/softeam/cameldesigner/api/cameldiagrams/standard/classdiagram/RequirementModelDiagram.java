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
 * Proxy class to handle a {@link ClassDiagram} with << RequirementModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c0f09b77-0e4b-430d-a7da-01382979d1a3")
public class RequirementModelDiagram extends AbstractCamelDiagram {
    @objid ("b95cf12f-b40e-4b44-b621-98e5b54ad4c3")
    public static final String STEREOTYPE_NAME = "RequirementModelDiagram";

    /**
     * Tells whether a {@link RequirementModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << RequirementModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("752c4c0b-9f74-45cb-a891-4f1d0a84577d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << RequirementModelDiagram >> then instantiate a {@link RequirementModelDiagram} proxy.
     * 
     * @return a {@link RequirementModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("8a729b15-c00c-4479-9a83-f6ab2beaecf2")
    public static RequirementModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME);
        return RequirementModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link RequirementModelDiagram} proxy or <i>null</i>.
     */
    @objid ("74dba631-931b-4e9a-8462-460b62db6373")
    public static RequirementModelDiagram instantiate(final ClassDiagram obj) {
        return RequirementModelDiagram.canInstantiate(obj) ? new RequirementModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link RequirementModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0dc91b74-aed7-413d-afec-2775f2a545e7")
    public static RequirementModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (RequirementModelDiagram.canInstantiate(obj))
        	return new RequirementModelDiagram(obj);
        else
        	throw new IllegalArgumentException("RequirementModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1ad147f-dc7d-4bc1-b6b3-5f45acb7f457")
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
        RequirementModelDiagram other = (RequirementModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("7e4b8dc0-41f9-4eca-8f61-68bf5193d6de")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("8d56af28-9b66-4739-909c-947f7b78390e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b1634cc6-b458-4c77-a363-aebccf9cb19d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d1c023eb-f4a5-45c8-bb24-61badd2a412b")
    protected RequirementModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b49732d9-0960-4c1f-a15a-9b345f5f99f2")
    public static final class MdaTypes {
        @objid ("c4cf6c49-0a6b-46f5-9583-d80d6b935a6e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0c9dae6-ac23-41f2-b0db-fd790e0de5e8")
        private static Stereotype MDAASSOCDEP;

        @objid ("d6f5144b-c2b5-4cd6-bb85-6be7ec2b499f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d307ff3-428c-4357-90ab-f12fcc528b5e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8879e00-7139-4923-a7ff-67ebdb678e5b");
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
