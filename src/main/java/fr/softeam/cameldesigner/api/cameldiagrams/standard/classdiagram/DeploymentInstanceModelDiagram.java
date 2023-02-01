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
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("77830576-7830-4322-80d8-d78144b4c9b1")
public class DeploymentInstanceModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("f7c7e2ae-44d7-4e55-995f-27109965b03f")
=======
    @objid ("d5f473f3-c875-43e1-b99b-db01684aaf55")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DeploymentInstanceModelDiagram";

    /**
     * Tells whether a {@link DeploymentInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a6813252-f7c8-4589-950f-199d2a636cdc")
=======
    @objid ("62df8fe5-b206-47d3-9a98-7411a4869c4c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> then instantiate a {@link DeploymentInstanceModelDiagram} proxy.
     * 
     * @return a {@link DeploymentInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("92c7bc80-1342-43eb-a2c2-f883c8095c09")
=======
    @objid ("adbd1423-a5b8-4bde-a47d-a8a7ef3c3739")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentInstanceModelDiagram.STEREOTYPE_NAME);
        return DeploymentInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentInstanceModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("3ce6bf4b-fc3c-41ec-bb49-738616d6125c")
=======
    @objid ("dc7d59d7-1e90-4559-a18c-ce1e750a0027")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentInstanceModelDiagram.canInstantiate(obj) ? new DeploymentInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("16e5cefb-33a5-42a7-9872-8a64c9abe3e9")
=======
    @objid ("68ef0bc5-eca8-4243-99b7-5b4938632814")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentInstanceModelDiagram.canInstantiate(obj))
        	return new DeploymentInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("490228a6-573a-4e0a-bd9b-d0c04dd1ba67")
=======
    @objid ("a68c8f7a-576a-4612-a7aa-590169adcc74")
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
        DeploymentInstanceModelDiagram other = (DeploymentInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9dd8c8ad-c40d-4f10-8afd-e702aae298cd")
=======
    @objid ("761ca3eb-dc2a-4a94-9827-6f1862d21f77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("d871cc3c-346c-4a99-a145-3c5b46adfd25")
=======
    @objid ("155cb5f0-f4c6-4299-ab9b-3130ffe42ae1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("ec5e43de-6a3b-479c-b296-4b56793df8fd")
=======
    @objid ("f8728156-faec-4e6a-8090-77f64955ec4d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DeploymentInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("802a5bb9-71ea-4f16-8d9e-0470cc0c45ae")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("fb2db5a0-e120-4ea1-8f9f-bb80a5fabd47")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c7f0ce9-9adc-4619-ab68-0ab2d2021af2")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb11039e-81bf-493d-99dc-83d42335c45b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2348d59f-faec-4e28-95e3-6ef13c1265fe")
=======
        @objid ("47a1ab08-12bb-46f2-b916-1c932a064096")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69929c2e-269f-4359-b8c4-bd7f0cf253c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("8724747d-2958-4ade-8c53-3a0ede99de39")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a821801-6595-4add-b92d-a57f5c842fb4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5ff2f96-fb60-424e-ae18-02b24209d1af");
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
