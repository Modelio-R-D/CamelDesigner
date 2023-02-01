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
 * Proxy class to handle a {@link ClassDiagram} with << DeploymentTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("85540842-c7cb-455a-a265-21e99c9177ad")
public class DeploymentTypeModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("d2e8d583-cf29-433c-92aa-9ed80ad4a1d6")
=======
    @objid ("ee85402b-5fdd-424e-9fe8-88a19f77cb37")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DeploymentTypeModelDiagram";

    /**
     * Tells whether a {@link DeploymentTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("3c42b1e9-6a76-442f-9715-c352c6a0ec51")
=======
    @objid ("71a0cd15-7c43-4e05-bb4a-3a1a4e583ef3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> then instantiate a {@link DeploymentTypeModelDiagram} proxy.
     * 
     * @return a {@link DeploymentTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("131b51ed-7e94-44eb-80c7-ef64e35b30b7")
=======
    @objid ("2e0838af-09c3-43a1-b984-bd5e8f133b74")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModelDiagram.STEREOTYPE_NAME);
        return DeploymentTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DeploymentTypeModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("affbdfd1-4654-43ee-8638-644fda0d830c")
=======
    @objid ("d9cbced4-cc4d-4aac-bac3-4c13a8a01206")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentTypeModelDiagram instantiate(final ClassDiagram obj) {
        return DeploymentTypeModelDiagram.canInstantiate(obj) ? new DeploymentTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DeploymentTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DeploymentTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c00aad09-68cd-4cac-8cb5-01d9ec896ae8")
=======
    @objid ("99852633-01d8-4f46-b136-d449b8e6f93c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DeploymentTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DeploymentTypeModelDiagram.canInstantiate(obj))
        	return new DeploymentTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DeploymentTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3d10a3ba-967e-40ac-a7ac-eac3f69b45e9")
=======
    @objid ("76fe9654-9b23-4c3b-aed3-b01388db5a49")
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
        DeploymentTypeModelDiagram other = (DeploymentTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("59534266-6103-4986-b379-f511f7d5d8e0")
=======
    @objid ("67c19676-296b-491e-9909-7e295ed99d24")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("589d4a2b-fae0-4d97-a062-a70316c6c07b")
=======
    @objid ("263242c1-fd3e-4d54-86d1-755d1b32c1d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b3f28108-2455-4167-a3c8-972abb68f87e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("61c8d072-ee2c-4a31-b489-e683b414395f")
=======
    @objid ("d99d1d94-1a40-4755-9b90-11ae5a723569")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DeploymentTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("e60b30af-a064-499b-bd68-785456b8cd45")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("95dfd115-09ef-4e40-84c6-bc097d6517a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fef485ed-d873-42e6-87b9-9ad920caeb94")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4c909c7-802b-42b5-829e-cd47af0e1e65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("204cec49-fc70-4cf8-ba9b-51c5b70ae778")
=======
        @objid ("686cedfa-33e9-4866-9f9a-b5356b1528c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8adc32c-29c5-40c2-8b92-ae6d3bf119b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("3adabee1-ec29-452b-ae35-bf53a30e5c7e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("005fcac2-b339-4f82-ad0c-c95d04f82912")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b78ff0fe-e31c-4034-ba6a-7a3d0626819e");
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
