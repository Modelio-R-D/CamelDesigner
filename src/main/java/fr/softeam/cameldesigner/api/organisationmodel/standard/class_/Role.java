/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Role >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5846bcfc-fc98-4f31-b691-21c72a9930b9")
public class Role extends FeatureClass {
<<<<<<< HEAD
    @objid ("588816f4-78ab-4008-8515-c77be4127ca1")
=======
    @objid ("525c7967-c801-41ed-8641-0eca75e5b164")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Role";

    /**
     * Tells whether a {@link Role proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Role >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("81a204df-2372-474e-9560-2044f1ea8207")
=======
    @objid ("f4ac0e27-21dd-41d1-8749-1ee926e97a02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Role >> then instantiate a {@link Role} proxy.
     * 
     * @return a {@link Role} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("02a3d18d-70a1-4f31-8773-d60d9ddc4fbf")
=======
    @objid ("d7537cc0-d9d2-4f41-98b0-8df1f54b4449")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Role create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME);
        return Role.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Role} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("9688f9ce-1bae-47f8-8feb-07d776529aa7")
=======
    @objid ("27f1be5b-11ce-4a68-8c71-6bfc2f56c7f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Role instantiate(final Class obj) {
        return Role.canInstantiate(obj) ? new Role(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Role} proxy from a {@link Class} stereotyped << Role >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Role} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ebd56fce-e74a-4108-8482-75ce53b0a85e")
=======
    @objid ("b446ecec-5770-489c-b9b3-181465566744")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Role safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Role.canInstantiate(obj))
        	return new Role(obj);
        else
        	throw new IllegalArgumentException("Role: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("e08b940e-b63c-4b9f-9ea0-09887c6feadd")
=======
    @objid ("7b2e28d3-72f7-4fe0-b739-c49d8202f8c4")
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
        Role other = (Role) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("0126c01a-bf71-47fb-a06e-2ff14c91794a")
=======
    @objid ("53d9074b-6d67-4546-9314-5daa52d9a465")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("55522b58-b53b-49ee-b954-5a7484e571d3")
=======
    @objid ("561ec0f0-58e9-401f-a2f9-d35d112a4f2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3657ba2e-5382-4327-b5bc-5bfe2bd87073")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("36a3dd7e-3065-44a1-9b20-868e0d82aaed")
=======
    @objid ("d12df127-98d9-400f-8a06-ca0deb64b8ee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Role(final Class elt) {
        super(elt);
    }

    @objid ("6984b739-246a-4151-a962-ff6ba842fc69")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("94fec7f6-6aa6-465f-bafb-e04f01963d20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aae483af-a960-462d-826e-8f978559afcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("f55daf09-802a-4601-8f0d-82b7a0bf9df5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e352d99f-9163-4974-bb91-b92d1001f540")
=======
        @objid ("cd751d77-8b65-4d55-97a1-0140c2a6d120")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c64d5afc-bf88-448f-9fe8-9fdf3d8cb302")
        private static Stereotype MDAASSOCDEP;

        @objid ("4cd80acb-0fed-48e7-84ec-f3ddc56aa78c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9cde7929-dd13-4204-b9d5-ee8af4719a9c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "858f6212-589e-4b36-9150-2e764f0e91b5");
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
