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
 * Proxy class to handle a {@link ClassDiagram} with << RequirementModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c0f09b77-0e4b-430d-a7da-01382979d1a3")
public class RequirementModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("d9eca888-a960-42f6-a69e-65ce536c5c67")
=======
    @objid ("d461035a-34b2-4e75-81d1-590b38f1ef99")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RequirementModelDiagram";

    /**
     * Tells whether a {@link RequirementModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << RequirementModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c1adf8db-e041-4ffc-ada6-aeef902b1789")
=======
    @objid ("b905edcb-b6ee-42ef-a336-c375de7fa414")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << RequirementModelDiagram >> then instantiate a {@link RequirementModelDiagram} proxy.
     * 
     * @return a {@link RequirementModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("e2b32091-cd1e-42db-84a9-2362fb33320e")
=======
    @objid ("5fdc2313-5c83-44a0-b340-837aac56123d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("972c459b-f45d-45da-9320-2a9800441755")
=======
    @objid ("5a401011-f0fd-4127-ad78-40cf16cb277d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("35dee886-4692-48e7-a20b-8b37971d69f2")
=======
    @objid ("0aeff819-2ab0-475b-bc27-8a66f0644ac3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RequirementModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (RequirementModelDiagram.canInstantiate(obj))
        	return new RequirementModelDiagram(obj);
        else
        	throw new IllegalArgumentException("RequirementModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("a55e3555-7c4d-4a35-8433-08f33ab976ef")
=======
    @objid ("33c464a8-b8b9-4fa4-859b-479e35696d86")
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
        RequirementModelDiagram other = (RequirementModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("831d08de-74a8-4b1f-bc4c-ce29d4f1f6f3")
=======
    @objid ("b96cd363-7dab-4027-a218-9f872bee0ea9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("f04fadf6-91fb-4f14-a787-77f799671ee8")
=======
    @objid ("f92d1856-208d-4c26-bcde-c96449752306")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("bcaa4c6b-b905-41a3-b40b-b3827f8caa91")
=======
    @objid ("8b1f28b1-0770-43ff-a510-7635c8235b49")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RequirementModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b49732d9-0960-4c1f-a15a-9b345f5f99f2")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("5dd56374-8ae1-4e6a-b91f-2d5ca950f2b0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0298d885-e696-429b-8fee-0989f169205b")
        private static Stereotype MDAASSOCDEP;

        @objid ("07d3c3d1-7c59-4508-9681-477651695a4d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f7e73da1-feca-4c57-8aac-e2e6e93bc5a1")
=======
        @objid ("9d716283-03ba-4496-b92a-b2607088f0c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3f88d97-3c7a-497b-8261-1ffcd8b584a9")
        private static Stereotype MDAASSOCDEP;

        @objid ("62de18f3-011a-4957-abac-e867237bb9e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2598ea4d-8737-4856-8cb4-7809674ac286")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
