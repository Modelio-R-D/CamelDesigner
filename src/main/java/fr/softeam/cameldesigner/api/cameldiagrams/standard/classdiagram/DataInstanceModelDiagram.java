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
 * Proxy class to handle a {@link ClassDiagram} with << DataInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("89866a6e-e4eb-4f57-a5fb-15874f126499")
public class DataInstanceModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("1949773b-5d6d-4caf-a806-7fa44d7bb5a1")
=======
    @objid ("3e6c2b50-60fb-4bbc-9d5e-273daeb78a64")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataInstanceModelDiagram";

    /**
     * Tells whether a {@link DataInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("3a0adaa5-d555-4a5c-b46d-55cc247ac097")
=======
    @objid ("cc81c6a0-50ec-49ed-b81f-ae8d47559d33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> then instantiate a {@link DataInstanceModelDiagram} proxy.
     * 
     * @return a {@link DataInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("742c78d8-2346-4a18-a02b-054a8e4cf283")
=======
    @objid ("97be892b-9984-4e34-ab14-2a14a18e5d9b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME);
        return DataInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataInstanceModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("5f21a74c-a62c-4666-8bf1-8da2e0632c36")
=======
    @objid ("769d9b2a-16b4-4838-adf6-acc67f30e102")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DataInstanceModelDiagram.canInstantiate(obj) ? new DataInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("39faf201-841b-432c-840a-401f3bc68561")
=======
    @objid ("7c2476a0-3d8b-4065-a0af-8932f28ea381")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataInstanceModelDiagram.canInstantiate(obj))
        	return new DataInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("f9bae1c7-e096-40d0-8272-97934e2df90c")
=======
    @objid ("6cec622b-72ce-484b-bacc-cf8122da92dd")
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
        DataInstanceModelDiagram other = (DataInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("093ace94-6232-4606-912c-b27e4eb8bda2")
=======
    @objid ("7baca33d-c1cc-4fb9-8534-5e7dd9a93fd0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("ae91fd62-63a8-43e9-8014-2fef1d20ee47")
=======
    @objid ("e2b67ec4-c208-4a42-93a1-bb31f6de9e33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("d3605cf5-0e62-4dbd-a9ef-b08cac0aa38b")
=======
    @objid ("b1ad87a9-58cd-4df2-892c-54a61420bc45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("7510381b-e94b-4f15-8226-f11baa81cec5")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("06455af1-e8b4-4247-aab4-e42abc8a01dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a79ab9e0-6705-43db-b556-71ce6137e9da")
        private static Stereotype MDAASSOCDEP;

        @objid ("316bdf2e-f15f-48b3-9cbc-258d4d2cf4c6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f74cd5c-5adb-42c7-972b-fa1e459a80f3")
=======
        @objid ("8f38f8d9-d012-4df7-b161-cbf8a77a0c34")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f2f402cc-0bc2-42b0-bc20-94380e36de59")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e28ff39-b453-4432-acb8-01f050c45c21")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbf45db0-9cfa-4fc9-aa3d-f4f4d7e16049")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8ab145ba-4bc6-410d-be7a-b17e36147115");
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
