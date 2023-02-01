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
 * Proxy class to handle a {@link ClassDiagram} with << SecurityModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4718a895-acb3-4999-91d8-cabfc0237ba5")
public class SecurityModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("e5ba2be2-1389-4724-b8be-10bf4b585a2a")
=======
    @objid ("78b81f39-af31-4130-9efb-e2c3b344be5b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SecurityModelDiagram";

    /**
     * Tells whether a {@link SecurityModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << SecurityModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("421ba982-18c6-493d-a46c-9f54cf4b90b2")
=======
    @objid ("84a88af8-f23c-48e8-b6a0-8950e56e355b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << SecurityModelDiagram >> then instantiate a {@link SecurityModelDiagram} proxy.
     * 
     * @return a {@link SecurityModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("9006acd2-c269-43f8-afaf-966e789fe1a2")
=======
    @objid ("5985774d-7676-42e0-998d-e5a2f64f29f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModelDiagram.STEREOTYPE_NAME);
        return SecurityModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link SecurityModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("a4bf75b7-aafe-4171-8b60-031c7b67cd27")
=======
    @objid ("51abc8c9-6cab-4593-9483-1a64249b2e3c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModelDiagram instantiate(final ClassDiagram obj) {
        return SecurityModelDiagram.canInstantiate(obj) ? new SecurityModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModelDiagram} proxy from a {@link ClassDiagram} stereotyped << SecurityModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link SecurityModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("9af169bd-e9fb-46f0-9895-f40d6f1365cc")
=======
    @objid ("2c5481a1-1442-4c28-b1fd-56fcbb531422")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (SecurityModelDiagram.canInstantiate(obj))
        	return new SecurityModelDiagram(obj);
        else
        	throw new IllegalArgumentException("SecurityModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("60dfd37f-7ba3-4b33-9870-9823c7564679")
=======
    @objid ("3662ee27-f1e1-4e3a-9370-be24671e190b")
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
        SecurityModelDiagram other = (SecurityModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("74da99b8-8dc7-418a-8656-acaaa5e3e330")
=======
    @objid ("e8482c04-2bec-4e8a-bb73-fa6e1f51fe2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("51e137ce-29d9-4801-a4c2-c10f3f5b1cd0")
=======
    @objid ("ce476557-697b-4806-9fdf-fa940714b8ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("78f63251-e877-421f-8907-5a07a2605825")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("e5385d74-c88f-400b-ada7-66afddab5b11")
=======
    @objid ("3cbd12da-5569-4368-88e8-4da4bc7d4f63")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("868740be-41f1-4107-b65a-5c1c718c6bd6")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d520da87-0561-40fa-a66a-45848b6eea79")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b4b963b-4a24-49d4-89c9-e9932fd53bbf")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2c4e896-ea75-4254-97f6-a4cc1ba402d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06730171-f90a-4b2b-834e-e42ce5cb6b3a")
=======
        @objid ("aaf8426b-0969-4ff8-ad59-e2f6bec161bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("218922c8-d677-45ac-8a80-1f7adb102497")
        private static Stereotype MDAASSOCDEP;

        @objid ("1368c1df-74b8-49cb-ad8f-f7aba32a2c37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b30552db-e363-43ef-9e33-204a27b07779")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f7228862-f56b-49a6-a404-f06dcb6a08fa");
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
