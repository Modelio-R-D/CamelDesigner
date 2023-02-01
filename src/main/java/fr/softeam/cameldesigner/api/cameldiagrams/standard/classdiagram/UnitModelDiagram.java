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
 * Proxy class to handle a {@link ClassDiagram} with << UnitModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6d478936-9de1-4f27-959c-107efa6f197b")
public class UnitModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("539c4e14-773d-42a8-b053-d119a9d5cc92")
=======
    @objid ("72443743-9e7f-4507-8d8b-1209fb2a3e47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "UnitModelDiagram";

    /**
     * Tells whether a {@link UnitModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << UnitModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c8a4c63a-8218-4801-b8bf-c8b0414a005a")
=======
    @objid ("7f688d6b-7d85-4571-a537-b802afeee349")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << UnitModelDiagram >> then instantiate a {@link UnitModelDiagram} proxy.
     * 
     * @return a {@link UnitModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("04191df7-67df-4467-a8f4-592c54cf87ef")
=======
    @objid ("cc3cdb65-06a3-4f6d-a2b4-424ff972475b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME);
        return UnitModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link UnitModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("acb2f0f5-01b5-4e08-9ac4-bcc8986769f3")
=======
    @objid ("c7a5c484-3489-4785-b047-7ca1b025a446")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModelDiagram instantiate(final ClassDiagram obj) {
        return UnitModelDiagram.canInstantiate(obj) ? new UnitModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link UnitModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("0b262206-2bee-49f4-8e41-7cecf5d818b9")
=======
    @objid ("4b827d8d-c6ab-4cc2-a816-a6b144539c4e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (UnitModelDiagram.canInstantiate(obj))
        	return new UnitModelDiagram(obj);
        else
        	throw new IllegalArgumentException("UnitModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("89b878a4-d7cf-4257-b1e8-995496e083e1")
=======
    @objid ("0f216606-7eb1-451f-a148-5d681862d5f9")
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
        UnitModelDiagram other = (UnitModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("41c2afe4-2c1a-4e78-84c5-19782e186650")
=======
    @objid ("22b711f1-6a87-449e-a2e2-79df1d9346fb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("2c632562-331e-4a9d-83a8-5154a0bc952f")
=======
    @objid ("2fd40d54-e17b-4e8c-826e-e9409547c44f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("768bfcdd-f648-459b-bdcf-7a7ca8faeda7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("af37f072-2c1a-4735-a9de-8fc18b4b104a")
=======
    @objid ("c3cc1136-d099-479b-ba5c-5a5e260fdc6d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UnitModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("25ea4c22-2cce-4ce3-a7ad-b7eef6e812e6")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3deffabc-e3aa-43a0-abcb-e78d49187933")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a25364f1-6899-4826-98bf-df887346b9c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("dee1a41b-ffc1-403a-b05e-2765ccd3755b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0f6889f-22b3-4a6c-9790-802c74e239d7")
=======
        @objid ("bb40d63d-738e-4168-9e8c-f069554c6661")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d3e4bad-4108-4e13-8bdf-e5826cee3b45")
        private static Stereotype MDAASSOCDEP;

        @objid ("e50c4fdd-cbd8-4a70-a0ec-fbac14d815eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16545186-a6e9-4efa-b277-866dad9ac42b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "447f259a-1b5e-46e1-8721-8c09653baaff");
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
