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
 * Proxy class to handle a {@link ClassDiagram} with << CamelModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c59f838-a1e2-4ac9-bf6c-e229175cc354")
public class CamelModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("45b4c3e5-c1cb-4b66-a6ef-e5163c09c7ec")
=======
    @objid ("e04e1d8d-d5d6-4d3b-94ca-e5b395bed5ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CamelModelDiagram";

    /**
     * Tells whether a {@link CamelModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("442f3835-e534-4155-bc08-de975be21134")
=======
    @objid ("79d2a837-ab3a-4a90-a2a0-1e41b340ae10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelModelDiagram >> then instantiate a {@link CamelModelDiagram} proxy.
     * 
     * @return a {@link CamelModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("a0a51623-b83b-4767-80ea-4697ad4dea50")
=======
    @objid ("2088f9d6-8ee3-4e2c-b221-37af0fc07c26")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CamelModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
        return CamelModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link CamelModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("b71d57b4-4af6-4646-8250-ec9fc17f06be")
=======
    @objid ("bca4c373-d24b-4b53-b2ca-1f50b8ced311")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CamelModelDiagram instantiate(final ClassDiagram obj) {
        return CamelModelDiagram.canInstantiate(obj) ? new CamelModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("bf5eaa3a-1c7d-4f8a-aa33-dd5bd1846546")
=======
    @objid ("b055c6b6-0177-428e-b95c-64d9d4c48c1d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CamelModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelModelDiagram.canInstantiate(obj))
        	return new CamelModelDiagram(obj);
        else
        	throw new IllegalArgumentException("CamelModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("5da4cbf5-95c0-4ad2-a248-2f559803fef8")
=======
    @objid ("457d970c-f398-48f7-b7e9-1dd4f6ace878")
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
        CamelModelDiagram other = (CamelModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c853c2ca-a477-41e5-9bab-e2d4e8dd510d")
=======
    @objid ("eddbd2d2-3efd-43af-91eb-2229dc0f21f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("26fce3ef-2ef6-44a5-92dd-30a8ace04a05")
=======
    @objid ("60709fa1-1d64-445d-9a6c-d137e3ab1fb5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b21fb26-6961-4938-af13-561334ff9a3d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("cab76de7-9912-4565-bcea-bb6d789366a7")
=======
    @objid ("2d9590c2-f67c-44ed-889e-03cc710abf77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CamelModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("4c4f1d52-c636-4b3b-a84c-7e0d2ad342f4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e9060ff4-bae1-45b5-8c7c-183433b29021")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46edd083-2ee5-4225-b2aa-8cf29bafd120")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d6e4e82-7df7-4afe-b0a9-76160de295ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4fdc40c-7971-40c5-bee1-5091731cc633")
=======
        @objid ("2331c3ac-930e-4557-9f69-73429c4c4d08")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f30bca7-259e-48fe-9902-4c1809e500e8")
        private static Stereotype MDAASSOCDEP;

        @objid ("577ae012-ba42-4f52-98dd-1fdcf9ed1133")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd0a6e1f-b9d2-45ee-ac92-e34d7eef5fd5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eec7381e-4c61-4f7c-9a1c-210f2fe38377");
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
